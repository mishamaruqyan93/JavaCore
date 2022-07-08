package homework.books.enums;

public enum Login {

    LOGIN("admin"),
    PASSWORD("123456");

    private String value;

    Login(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
