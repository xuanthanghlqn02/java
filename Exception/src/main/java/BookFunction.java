import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import jdk.jfr.Category;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BookFunction implements Comparable<Book> {

    static Scanner sc = new Scanner(System.in);

    public ArrayList<Book> getAllBooks() {
        Gson gson = new Gson();
        ArrayList<Book> book = null;
        Type bookListType = new TypeToken<ArrayList<Book>>() {
        }.getType();
        try {
            FileReader reader = new FileReader("book.json");
            book = gson.fromJson((Reader) reader, bookListType);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        return book;
    }

    public void show(ArrayList<Book> book) {
        for (Book x : book) {
            System.out.println(x);
        }
    }

    public void searchBookByName(ArrayList<Book> book) {

        System.out.print("Enter the book name you want to search: ");
        String bookName = sc.nextLine();
        int count = 0;
        for (Book x : book) {
            if (x.getTitle().toLowerCase().contains(bookName.toLowerCase())) {
                System.out.println(x);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Do not have the book name you want to search!");
        }
    }

    public void searchBookByCategory(ArrayList<Book> book) {
        System.out.print("Enter the book category you want to search: ");

        System.out.print("1. Action" + "\t");
        System.out.print("2. Drama" + "\t");
        System.out.print("3. Romance" + "\t");
        System.out.print("4. War" + "\t");
        System.out.print("5. Crime" + "\t");
        System.out.print("6. Adventure" + "\t");
        System.out.print("7. Comedy" + "\t");
        System.out.print("8. Horror" + "\t");
        System.out.print("9. Mystery" + "\t");
        System.out.print("10. Thriller" + "\t");
        System.out.println("11. Sci-Fi" + "\t");

        System.out.print("Your answer: ");
        int numberCategory = Integer.parseInt(sc.nextLine());

        switch (numberCategory) {
            case 1:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Action")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 2:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Drama")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 3:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Romance")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 4:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("War")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 5:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Crime")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 6:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Adventure")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 7:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Comedy")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 8:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Horror")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 9:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Mystery")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 10:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Thriller")) {
                            System.out.println(x);
                        }
                    }
                }
                break;

            case 11:
                for (Book x : book) {
                    String[] category = x.getCategory();
                    for (String y : category) {
                        if (y.equalsIgnoreCase("Sci-Fi")) {
                            System.out.println(x);
                        }
                    }
                }
                break;
            default:
                System.out.println("Do not have this choice!");
        }
    }

    @Override
    public int compareTo(Book o) {
        return 0;
    }
}
