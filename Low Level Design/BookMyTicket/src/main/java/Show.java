import java.util.List;

public class Show {
    public Integer id;
    public Movie movie;
    public Integer startTime;
    public List<Integer> bookedSeat;

    public Screen screen;

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public List<Integer> getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(List<Integer> bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
}
