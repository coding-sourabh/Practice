public class Main {
    public static void main(String [] args) {
        Directory moviesDirectory = new Directory("moviesDirectory");
        moviesDirectory.add(new File("Inception"));

        Directory comedyMovies = new Directory("comedyMovies");
        comedyMovies.add(new File("Hera Pheri"));
        comedyMovies.add(new File("Golmal"));

        moviesDirectory.add(comedyMovies);

        moviesDirectory.ls();
    }
}
