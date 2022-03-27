public class Film {
    private int id;
    private String title;
    private String decription;
    private String director;
    private int release_year;

    public Film(int id, String title, String decription, String director, int release_year) {
        this.id = id;
        this.title = title;
        this.decription = decription;
        this.director = director;
        this.release_year = release_year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", decription='" + decription + '\'' +
                ", director='" + director + '\'' +
                ", release_year=" + release_year +
                '}';
    }
}
