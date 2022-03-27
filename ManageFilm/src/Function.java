import java.util.ArrayList;

public class Function<T> {
    public ArrayList<Movie> getMovies() {
        ArrayList<Movie> listMovie = new ArrayList<>();
        Movie f1 = new Movie(1, "Biet doi bao thu", "ABC", "DEF", 2022,180);
        Movie f2 = new Movie(2, "Biet doi bao thu", "ABC", "DEF", 2022,200);
        Movie f3 = new Movie(3, "Biet doi bao thu", "ABC", "DEF", 2022,150);
        Movie f4 = new Movie(4, "Biet doi bao thu", "ABC", "DEF", 2022,120);
        Movie f5 = new Movie(5, "Biet doi bao thu", "ABC", "DEF", 2022,100);

        listMovie.add(f1);
        listMovie.add(f2);
        listMovie.add(f3);
        listMovie.add(f4);
        listMovie.add(f5);

        return listMovie;
    }
    
    public void show(ArrayList<T> movies) {
        for (T x: movies) {
            System.out.println(x);
        }
    }
}
