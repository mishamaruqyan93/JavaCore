package homework.books;

public class BookStorage {
    private Book[] books;
    public int size;

    public BookStorage() {
        books = new Book[10];
        size = 0;
    }

    public void add(Book book) {
        if (size == books.length) {
            extend();
        }
        books[size++] = book;
    }

    private void extend() {
        Book[] temp = new Book[books.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = books[i];
        }
        books = temp;
    }

    public void printAllBooks() {
        if (isEmpty()) {
            System.out.println("There are not any book");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + books[i]);
        }
    }

    public void printBookByAuthor(String authorName) {
        if (!isEmpty()) {
            boolean isTrue = false;
            for (int i = 0; i < size; i++) {
                if (books[i].getAuthorName().equals(authorName)) {
                    System.out.println(books[i]);
                    isTrue = true;
                }
            }
            check(isTrue);
        }else {
            System.out.println("There are not any book");
        }
    }

    public void printBooksByGenre(String genre) {
        if (!isEmpty()) {
            boolean isTrue = false;
            for (int i = 0; i < size; i++) {
                if (books[i].getGenre().equals(genre)) {
                    System.out.println(books[i]);
                    isTrue = true;
                }
            }
            check(isTrue);
        }
        else {
            System.out.println("There are not any book");
        }
    }

    public void printBooksByPriceRange(double from, double to) {
        if (!isEmpty()) {
            boolean isTrue = false;
            for (int i = 0; i < size; i++) {
                if (books[i].getPrice() >= from && books[i].getPrice() <= to) {
                    System.out.println(books[i]);
                    isTrue = true;
                }
            }
            check(isTrue);
        }else{
            System.out.println("There are not any book");
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private void check(boolean isTrue) {
        if (!isTrue) {
            System.out.println("Data does not exists");
        }
    }
}

