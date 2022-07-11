package homework.books.model;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType UserTape;

    public User(String name, String surname, String email, String password, UserType userTape) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        UserTape = userTape;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserTape() {
        return UserTape;
    }

    public void setUserTape(UserType userTape) {
        UserTape = userTape;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", UserTape=" + UserTape +
                '}';
    }
}
