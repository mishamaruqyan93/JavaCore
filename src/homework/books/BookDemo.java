package homework.books;

import homework.books.commands.Commands;
import homework.books.enums.Gender;
import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;
import homework.books.model.Book;
import homework.books.model.User;
import homework.books.model.UserType;
import homework.books.storage.AuthorStorage;
import homework.books.storage.BookStorage;
import homework.books.storage.UserStorage;

import java.util.Scanner;

public class BookDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();
    private static User currentUser = null;

    public static void main(String[] args) {
        userStorage.add(new User("admin", "poxosyan", "admin@mail.com", "admin", UserType.ADMIN));

        boolean run = true;
        while (run) {
            Commands.printLoginCommand();
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
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid command:");
            }
        }
    }

    private static void login() {
        System.out.println("Please input email,password");
        String emailPasswordStr = scanner.nextLine();
        String[] emailPassword = emailPasswordStr.split(",");
        User user = userStorage.getUserByEmail(emailPassword[0]);
        if (user == null) {
            System.out.println("User with" + emailPassword[0] + "does not exists!");
        } else {
            if (user.getPassword().equals(emailPassword[1])) {
                currentUser = user;
                if (user.getUserTape() == UserType.ADMIN) {
                    loginAdmin();
                } else if (user.getUserTape() == UserType.USER) {
                    loginUser();
                }
            } else {
                System.out.println("Password is wrong!");
            }
        }
    }

    private static void loginUser() {
        System.out.println("Welcome" + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printUserCommands();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                command = -1;
            }
            switch (command) {
                case LOGOUT:
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
                case PRINT_ALL_AUTHOR:
                    authorStorage.print();
                    break;
                default:
                    System.out.println("Invalid command: Please try again!");
            }
        }
    }

    private static void register() {
        System.out.println("Please input name,surname,email,password");
        String userDataStr = scanner.nextLine();
        String[] userData = userDataStr.split(",");
        if (userData.length < 4) {
            System.out.println("Please input correct data!");
        } else {
            if (userStorage.getUserByEmail(userData[2]) == null) {
                User user = new User();
                user.setPassword(userData[0]);
                user.setSurname(userData[1]);
                user.setEmail(userData[2]);
                user.setPassword(userData[3]);
                user.setUserTape(UserType.USER);
                userStorage.add(user);
                System.out.println("User created:");
            } else {
                System.out.println("user with" + userData[2] + "already exists!");
            }
        }
    }


    private static void loginAdmin() {
        System.out.println("Welcome" + currentUser.getName());
        boolean run = true;
        while (run) {
            Commands.printAdminCommands();
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
        String gender = scanner.nextLine().toUpperCase();
        try {
            if (!gender.equals(Gender.MALE.name()) && !gender.equals(Gender.FEMALE.name())) {
                System.out.println("Please input correct gender");
                addAuthor();
            }
            Gender gender2 = Gender.valueOf(gender);
            Author author = new Author(name, surname, email, gender2);
            authorStorage.add(author);
        } catch (NullPointerException e) {
            System.out.println("Gender cannot be null!");
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
                    Book book = new Book(title, author, price, count, genre, currentUser);
                    bookStorage.add(book);
                    System.out.println("Book was added");
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    addBook();
                }
            } catch (AuthorNotFoundException | ArrayIndexOutOfBoundsException e) {
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
