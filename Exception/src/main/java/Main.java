public class Main {
    public static void main(String[] args) {
        BookFunction BF = new BookFunction();
        BF.show(BF.getAllBooks());

        System.out.println("---");
        BF.searchBookByName(BF.getAllBooks());

        System.out.println("---");
        BF.searchBookByCategory(BF.getAllBooks());
    }
}
