package homework.books.storage;

import homework.books.exception.AuthorNotFoundException;
import homework.books.model.Author;

public class AuthorStorage {
    private Author[] authors;
    public int size;

    public AuthorStorage() {
        authors = new Author[10];
        size = 0;
    }

    public void add(Author author) {
        if (size == authors.length) {
            extend();
        }
        authors[size++] = author;
    }

    private void extend() {
        Author[] temp = new Author[authors.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = authors[i];
        }
        authors = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Author getAuthorByIndex(int index) throws AuthorNotFoundException {
        if (index >= 0 && index < size) {
            return authors[index];
        }
        throw new AuthorNotFoundException("Author was not found by index: " + index);
    }

    private void check(boolean isTrue) {
        if (!isTrue) {
            System.out.println("Data does not exists");
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + authors[i]);

        }
    }
}

