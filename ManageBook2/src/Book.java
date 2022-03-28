public class Book {
    private int id;
    private String bookName;
    private String description;
    private String author;
    private String category;
    private int releaseYear;
    private String bookPublisher;

    public Book(int id, String bookName, String description, String author, String category, int releaseYear, String bookPublisher) {
        this.id = id;
        this.bookName = bookName;
        this.description = description;
        this.author = author;
        this.category = category;
        this.releaseYear = releaseYear;
        this.bookPublisher = bookPublisher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    @Override
    public String toString() {
        return id + " - " + bookName + " - " + description + " - " +
                author + " - " + category + " - " + releaseYear + " - " + bookPublisher;
    }
}
