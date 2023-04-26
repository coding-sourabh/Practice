import java.util.List;

public class Theater {
    public Integer id;
    public City city;
    public List<Screen> screenList;
    public List<Show> showList;

    public String addScreen(Screen screen) {
        screenList.add(screen);
        return "Screen added successfully";
    }

    public String addShow(Show show) {
        showList.add(show);
        return "Show added successfully";
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
