import java.util.List;

public class Booking {
    private Show show;
    private List<Seat> bookedSeats;

    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
