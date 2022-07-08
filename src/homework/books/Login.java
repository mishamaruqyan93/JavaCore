package homework.books;

public enum Login {

    LOGIN("admin"),
    PASSWORD("123456");

    private String data;

    Login(String data) {
        this.data = data;
    }
}
