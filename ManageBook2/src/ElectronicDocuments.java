public class ElectronicDocuments extends Book {
    private int capacity;
    private int downloads;

    public ElectronicDocuments(int id, String bookName, String description, String author, String category, int releaseYear, String bookPublisher, int capacity, int downloads) {
        super(id, bookName, description, author, category, releaseYear, bookPublisher);
        this.capacity = capacity;
        this.downloads = downloads;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + capacity + " - " + downloads;
    }
}
