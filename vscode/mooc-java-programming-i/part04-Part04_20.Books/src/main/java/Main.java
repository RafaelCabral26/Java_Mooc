import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        // implement here the program that allows the user to enter
        // book information and to examine them
        while (true) {
            System.out.println("Title:");
            String name = scan.nextLine();
            if (name.equals(""))
                break;
            System.out.println("Title:");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Title:");
            int year = Integer.valueOf(scan.nextLine());
            books.add(new Book(name, pages, year));
        }
        System.out.println("What information will be printed?");
        String info = scan.nextLine();
        for (Book book: books) {
            System.out.println(book.toString(info));
        }
    }
}
