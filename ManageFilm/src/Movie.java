import java.util.ArrayList;

public class Movie extends Film {

    private int length;

    public Movie(int id, String title, String decription, String director, int release_year, int length) {
        super(id, title, decription, director, release_year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public ArrayList<Film> getFilms() {
        ArrayList<Film> listFilm = new ArrayList<>();
        Film f1 = new Film(1, "Biet doi bao thu","ABC","DEF",2022);
        Film f2 = new Film(2, "Biet doi bao thu","ABC","DEF",2022);
        Film f3 = new Film(3, "Biet doi bao thu","ABC","DEF",2022);
        Film f4 = new Film(4, "Biet doi bao thu","ABC","DEF",2022);
        Film f5 = new Film(5, "Biet doi bao thu","ABC","DEF",2022);

        listFilm.add(f1);
        listFilm.add(f2);
        listFilm.add(f3);
        listFilm.add(f4);
        listFilm.add(f5);

        return listFilm;
    }


}
