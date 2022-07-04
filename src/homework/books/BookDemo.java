package homework.books;

import homework.books.commands.Commands;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Commands.printCommand();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBook();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command: Please try again!");
            }
        }
    }

    private static void addAuthor() {
        System.out.println("Please input AuthorName");
        String name = scanner.nextLine();
        System.out.println("Please input AuthorSurname");
        String surname = scanner.nextLine();
        System.out.println("Please input AuthorEmail");
        String email = scanner.nextLine();
        System.out.println("Please input gender MALE or FEMALE");
        String gender = scanner.nextLine();
        String genderUpperCase = gender.toUpperCase();
        if (genderUpperCase.equals("MALE") || genderUpperCase.equals("FEMALE")) {
            Author author = new Author(name, surname, email, genderUpperCase);
            authorStorage.add(author);
            System.out.println("Author created!");
        } else {
            System.out.println("No correct gender!");
            addAuthor();
        }
    }

    private static void addBook() {
        if (authorStorage.isEmpty()) {
            System.out.println("Please add author");
            addAuthor();
        } else {
            authorStorage.print();
            System.out.println("pLease choose author index");
            int authorIndex = Integer.parseInt(scanner.nextLine());
            try {
                Author author = authorStorage.getAuthorByIndex(authorIndex);
                System.out.println("Please input title");
                String title = scanner.nextLine();
                System.out.println("Please input price");
                try {
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("please input count");
                    int count = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input book genre");
                    String genre = scanner.nextLine();

                    if (title == null || title.trim().isEmpty() || genre == null || genre.trim().isEmpty() || price <= 0 || count <= 0) {
                        System.out.println("No correct data");
                        addBook();
                    }
                    Book book = new Book(title, author, price, count, genre);
                    bookStorage.add(book);
                    System.out.println("Book was added");

                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    addBook();
                }
            } catch (AuthorNotFoundException e) {
                System.out.println(e.getMessage());
                addBook();
            }
        }
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
        try {
            System.out.println("Please input from");
            double from = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input to");
            double to = Double.parseDouble(scanner.nextLine());
            if (from <= 0 || to <= 0) {
                System.out.println("please enter the correct amount");
                printBooksByPriceRange();
            }
            bookStorage.printBooksByPriceRange(from, to);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            printBooksByPriceRange();
        }
    }
}
