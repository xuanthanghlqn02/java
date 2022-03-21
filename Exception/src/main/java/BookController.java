import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookController {
    public static void Menu() {
        Scanner sc = new Scanner(System.in);
        BookFunction BF = new BookFunction();
        ArrayList<Book> list = new ArrayList<>();
        list = BF.getAllBooks();

        while (true) {
            System.out.println("1. Get all of the book info");
            System.out.println("2. Search the book by name");
            System.out.println("3. Search the book by category");
            System.out.println("4. Sort books by page number");
            System.out.println("5. Sort books by release year");
            System.out.println("6. Exit");
            System.out.print("Your answer: ");

            int menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    BF.show(BF.getAllBooks());
                    break;

                case 2:
                    BF.searchBookByName(BF.getAllBooks());
                    break;

                case 3:
                    BF.searchBookByCategory(BF.getAllBooks());
                    break;

                case 4:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getPage_number() - o2.getPage_number();
                        }
                    });
                    BF.show(list);
                    break;

                case 5:
                    Collections.sort(list, new Comparator<Book>() {
                        @Override
                        public int compare(Book o1, Book o2) {
                            return o1.getRelease_year() - o2.getRelease_year();
                        }
                    });
                    BF.show(list);
                    break;

                case 6:
                    System.out.println("Exit!");
                    System.exit(0);

                default:
                    System.out.println("Do not have this choice, please choose again!");
            }
        }

    }


}
