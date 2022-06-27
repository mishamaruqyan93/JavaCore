package homework.books;

import java.util.Objects;

public class Book {
    private String title;
    private String authorName;
    private double price;
    private int count;
    private String genre;

    public Book(String title, String authorName, double price, int count, String genre) {
        this.title = title;
        this.authorName = authorName;
        this.price = price;
        this.count = count;
        this.genre = genre;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && count == book.count && Objects.equals(title, book.title) && Objects.equals(authorName, book.authorName) && Objects.equals(genre, book.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, price, count, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", genre='" + genre + '\'' +
                '}';
    }
}
