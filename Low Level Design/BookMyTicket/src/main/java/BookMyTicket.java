import javax.naming.directory.SearchControls;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookMyTicket {

    private MovieController movieController;
    private TheaterController theaterController;
    BookMyTicket() {
        movieController = new MovieController();
        theaterController = new TheaterController();
    }

    public static void main(String [] args) {
        BookMyTicket bookMyTicket = new BookMyTicket();
        bookMyTicket.addMovies();
        bookMyTicket.addTheaters(bookMyTicket);

        //user 1
        bookMyTicket.createBooking(City.Delhi, "Avenger");

        // user 2
        bookMyTicket.createBooking(City.Delhi, "Avenger");  // already booked
    }

    public void createBooking(City userCity, String movieName) {
        // search movie by user location
        List<Movie> movies = movieController.getMoviesByCity(userCity);

        // Fetch the movie based on movie name
        Movie interestedMovie = null;
        for(Movie movie : movies) {
            if(movie.name.equals(movieName)) {
                interestedMovie = movie;
                break;
            }
        }

        // Get all shows corresponding to location and movie for all theatres
        Map<Theater, List<Show>> showsTheaterWise = theaterController.getAllShows(interestedMovie, userCity);

        // Now, here we can select the particular show in a particular theater
        Map.Entry<Theater,List<Show>> entry = showsTheaterWise.entrySet().iterator().next();
        List<Show> runningShows = entry.getValue();
        Show interestedShow = runningShows.get(0);

        // select the seat
        int seatNumber = 30;
        List<Integer> bookedSeatIds = interestedShow.getBookedSeat();
        if(!bookedSeatIds.contains(seatNumber)) {
            bookedSeatIds.add(seatNumber);

            // Start payment;
            Booking booking = new Booking();
            List<Seat> userBookedSeats = new ArrayList<>();
            for(Seat screenSeat: interestedShow.getScreen().getSeatList()) {
                if(screenSeat.getSeatId() == seatNumber) {
                    userBookedSeats.add(screenSeat);
                }
            }
            booking.setBookedSeats(userBookedSeats);
            booking.setShow(interestedShow);
        } else {
            System.out.println("Seat already booked, try again");
            return;
        }

        System.out.println("Booking successful");
    }

    public void addMovies() {
        movieController.addMovie("Faridabad", new Movie(1, "Avenger", 2.5F));
        movieController.addMovie("Faridabad", new Movie(2, "Pathan", 2.8F));
        movieController.addMovie("Delhi", new Movie(3, "Avenger", 2F));
        movieController.addMovie("Noida", new Movie(4, "Dangal", 3F));
    }

    public void addTheaters(BookMyTicket bookMyTicket) {
        Theater ionx = new Theater();
        ionx.setId(101);
        ionx.setCity(City.Delhi);
        List<Screen>  theaterScreen = bookMyTicket.createScreen();
        ionx.setScreenList(theaterScreen);
        List<Theater> theaterList = bookMyTicket.theaterController.cityVsTheater.get("Delhi");
        if(theaterList == null) {
            theaterList = new ArrayList<>();
        }
        theaterList.add(ionx);
        bookMyTicket.theaterController.cityVsTheater.put(City.Delhi, theaterList);

        List<Show> showList = bookMyTicket.createShow(bookMyTicket.movieController, ionx.getScreenList());
        ionx.setShowList(showList);

        Theater pvr = new Theater();
        pvr.setId(201);
        pvr.setCity(City.Faridabad);
        pvr.setScreenList(bookMyTicket.createScreen());
        pvr.setShowList(bookMyTicket.createShow(bookMyTicket.movieController, pvr.getScreenList()));
        List<Theater> theaterList2 = bookMyTicket.theaterController.cityVsTheater.get("Faridabad");
        if(theaterList2 == null) {
            theaterList2 = new ArrayList<>();
        }
        theaterList2.add(pvr);
        bookMyTicket.theaterController.cityVsTheater.put(City.Faridabad, theaterList2);
    }

    public List<Screen> createScreen() {
        List<Screen> screenList = new ArrayList<>();
        Screen screen1 = new Screen();
        screen1.setId(1);
        screen1.setSeatList(createSeatList());
        screenList.add(screen1);
        return screenList;
    }

    public List<Show> createShow(MovieController movieController, List<Screen> screenList) {
        Screen usedScreen = screenList.get(0);
        List<Show> showList = new ArrayList<>();
        Show morningShow = new Show();
        morningShow.setId(1);
        morningShow.setScreen(usedScreen);
        morningShow.setMovie(movieController.getMovieByName("Avenger"));
        morningShow.setStartTime(4);
        morningShow.setBookedSeat(new ArrayList<>());
        showList.add(morningShow);

        Show eveningShow = new Show();
        eveningShow.setId(2);
        eveningShow.setScreen(usedScreen);
        eveningShow.setMovie(movieController.getMovieByName("Dangal"));
        morningShow.setBookedSeat(new ArrayList<>());
        eveningShow.setStartTime(8);
        return showList;
    }

    public List<Seat> createSeatList() {
        List<Seat> seatList = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            Seat s = new Seat();
            s.setSeatId(i);
            s.setRow("A");
            s.setPrice(100F);
            s.setSeatCategory(SeatCategory.SILVER);
            seatList.add(s);
        }
        for(int i = 50; i < 80; i++) {
            Seat s = new Seat();
            s.setSeatId(i);
            s.setRow("B");
            s.setPrice(150F);
            s.setSeatCategory(SeatCategory.GOLD);
            seatList.add(s);
        }
        for(int i = 0; i < 20; i++) {
            Seat s = new Seat();
            s.setSeatId(i);
            s.setRow("C");
            s.setPrice(200F);
            s.setSeatCategory(SeatCategory.PLATINUM);
            seatList.add(s);
        }
        return seatList;
    }
}

/*
  Movies :
* Faridabad movies : Avenger, Pathan
* Delhi movies : 3 Idiots
* Noida movies : Dangal

  Theaters:
  Ionx :
    Delhi
    screens  = { 1st-screen(100 seats) }
    shows = { morningShow(avenger) eveningShow(dangal)}

  pvr :
    Faridabad
    screens = { 1st-screen (100 seats) }
    shows = { morning(avenger) eveningShow(dangal) }

* */