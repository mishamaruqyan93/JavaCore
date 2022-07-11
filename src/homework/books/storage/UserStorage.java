package homework.books.storage;

import homework.books.model.User;

public class UserStorage {
    private User[] users;
    public int size;

    public UserStorage() {
        users = new User[10];
        size = 0;
    }

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] temp = new User[users.length + 10];
        System.arraycopy(users, 0, temp, 0, users.length);
        users = temp;
    }

    public void printAllUsers() {
        if (isEmpty()) {
            System.out.println("There are not any users");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + users[i]);
        }
    }

    public User getUserByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return users[index];
    }

    public User getUserByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
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

