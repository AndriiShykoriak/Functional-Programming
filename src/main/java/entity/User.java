package entity;

import java.util.ArrayList;
import java.util.List;

public record User(String name, int age, String city) {
    public static List<User> getUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Вася", 16, "Днепр"));
        userList.add(new User("Петя", 23, "Днепр"));
        userList.add(new User("Елена", 42, "Луцк"));
        userList.add(new User("Елена", 92, "Чернигов"));
        userList.add(new User("Сергей", 5, "Киев"));
        userList.add(new User("Марина", 32, "Киев"));
        userList.add(new User("Иван Иванович", 69, "Львов"));
        return userList;
    }
}
