import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {
    public Map<String, List<Movie>> cityVsMovies = new HashMap<>();
    public List<Movie> allMovies = new ArrayList<>();

    public String addMovie(String city, Movie movie) {
        List<Movie> list = cityVsMovies.get(city);
        if(list == null) {
            list = new ArrayList<>();

        }
        list.add(movie);
        cityVsMovies.put(city, list);
        return "Movie added successfully";
    }

    public Movie getMovieByName(String qName) {
        for (Map.Entry<String, List<Movie>> pair : cityVsMovies.entrySet()) {
            List<Movie> tempList = pair.getValue();
            for(Movie movie: tempList) {
                if(movie.name.equals(qName))
                    return movie;
            }
        }
        return null;
    }

    public List<Movie> getMoviesByCity(City city) {
        List<Movie> movieList = new ArrayList<>();
        for (Map.Entry<String, List<Movie>> pair : cityVsMovies.entrySet()) {
            List<Movie> tempList = pair.getValue();
            for(Movie movie: tempList) {
                if(pair.getKey().toString().equals(city.toString()))
                    movieList.add(movie);
            }
        }
        return movieList;
    }
}
