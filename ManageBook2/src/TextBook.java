public class TextBook extends Book {
    private int pageNumber;
    private int quantity;

    public TextBook(int id, String bookName, String description, String author, String category, int releaseYear, String bookPublisher, int pageNumber, int quantity) {
        super(id, bookName, description, author, category, releaseYear, bookPublisher);
        this.pageNumber = pageNumber;
        this.quantity = quantity;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + pageNumber + " - " + quantity;
    }
}
