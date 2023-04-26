import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterController {
    public Map<City, List<Theater>> cityVsTheater = new HashMap<>();
    public List<Theater> theaterList = new ArrayList<>();

    public String addTheater(City city, Theater theater) {
        List<Theater> theaterList = cityVsTheater.get(city);
        if(theaterList == null) {
            theaterList = new ArrayList<>();
        }
        theaterList.add(theater);
        cityVsTheater.put(city, theaterList);
        return "Theater added successfully";
    }

    public Map<Theater, List<Show>> getAllShows(Movie movie, City city) {
        Map<Theater, List<Show>> allShows = new HashMap<>();
         List<Theater> theaters = cityVsTheater.get(city);

            for(Theater theater: theaters) {
                List<Show> interestedMovieShow = new ArrayList<>();
                if(theater.getCity().equals(city)) {
                    List<Show> movieAllShows = theater.getShowList();
                    for(Show show : movieAllShows) {
                        if(show.getMovie().id.equals(movie.id)) {
                            interestedMovieShow.add(show);
                        }
                    }
                }
                if(interestedMovieShow.size() != 0)
                    allShows.put(theater, interestedMovieShow);
           }
        return allShows;
    }

    public List<Theater> getTheaterList() {
        return theaterList;
    }

    public Map<City, List<Theater>> getCityVsTheater() {
        return cityVsTheater;
    }
}
