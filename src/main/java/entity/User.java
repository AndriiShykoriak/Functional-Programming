package entity;

import java.util.ArrayList;
import java.util.List;

public record User(String name, int age, String city) {
    public static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Vasia", 16, "Dnipro"));
        userList.add(new User("Petia", 23, "Dnipro"));
        userList.add(new User("Olena", 42, "Lutsk"));
        userList.add(new User("Olena", 92, "Chernihiv"));
        userList.add(new User("Serhii", 5, "Kiev"));
        userList.add(new User("Marina", 32, "Kiev"));
        userList.add(new User("Ivan Ibanovych", 69, "Lviv"));
        return userList;
    }
}
