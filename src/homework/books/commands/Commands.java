package homework.books.commands;

public interface Commands {

    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL = 2;
    int PRINT_BOOK_BY_AUTHOR_NAME = 3;
    int PRINT_BOOK_BY_GENRE = 4;
    int PRINT_BOOK_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;

    static void printCommand() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + PRINT_ALL + " for print all books");
        System.out.println("please input " + PRINT_BOOK_BY_AUTHOR_NAME + " Print Books by AuthorName ");
        System.out.println("Please input " + PRINT_BOOK_BY_GENRE + "  Print books by genre");
        System.out.println("Please input " + PRINT_BOOK_BY_PRICE_RANGE + "  Print books by price range");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + PRINT_ALL_AUTHOR + " for print all author");
    }
}
