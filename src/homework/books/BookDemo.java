package homework.books;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static BookStorage bookStorage = new BookStorage();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            Commands.printCommand();
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    add();
                    break;
                case PRINT_ALL:
                    printAll();
                    break;
                case PRINT_BOOK_BY_AUTHOR_NAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOK_BY_GENRE:
                    printBooksByGenre();
                    break;
                case PRINT_BOOK_BY_PRICE_RANGE:
                    printBooksByPriceRange();
                    break;
                default:
                    System.out.println("Invalid command: Please try again!");
            }
        }
    }


    private static void add() {
        System.out.println("Please input title");
        String title = scanner.nextLine();
        System.out.println("Please input authorName");
        String authorName = scanner.nextLine();
        System.out.println("Please input price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("please input count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input book genre");
        String genre = scanner.nextLine();
        if (title == null || title.trim().isEmpty() || authorName == null || authorName.trim().isEmpty()
                || genre == null || genre.trim().isEmpty() || price <= 0 || count <= 0) {
            System.out.println("No correct data");
            add();
        }
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("Book was added");
    }

    private static void printAll() {
        bookStorage.printAllBooks();
    }

    private static void printBookByAuthorName() {
        System.out.println("Please input authorName");
        String authorName = scanner.nextLine();
        if (authorName != null && !authorName.trim().equals("")) {
            bookStorage.printBookByAuthor(authorName);
        } else {
            System.out.println("No correct authorName");
            printBookByAuthorName();
        }
    }

    private static void printBooksByGenre() {
        System.out.println("Please input genre");
        String genre = scanner.nextLine();
        if (genre != null && !genre.trim().equals("")) {
            bookStorage.printBooksByGenre(genre);
        } else {
            System.out.println("no correct kod");
            printBooksByGenre();
        }
    }

    private static void printBooksByPriceRange() {
        System.out.println("Please input from");
        double from = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input to");
        double to = Double.parseDouble(scanner.nextLine());
        if (from <= 0 || to <= 0) {
            System.out.println("please enter the correct amount");
            printBooksByPriceRange();
        }
        bookStorage.printBooksByPriceRange(from, to);
    }
}