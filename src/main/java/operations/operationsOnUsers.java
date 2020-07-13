package operations;

import entity.User;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class operationsOnUsers {
    private static List<User> users = User.getUserList();

    public static void execute() {
        printUsersOlder40();
        printUsersYounger50AndFromDnipro();
        printUsersAverageFromLviv();
        printUsersFromNotKievCount();
        printUsersAscAgeLimit3();
    }

    private static void printUsersOlder40() {
        System.out.println("User older 40 years:");
        users.stream()
                .filter(x -> x.age() > 40)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printUsersYounger50AndFromDnipro() {
        System.out.println("User younger 50 years and from Dnipro:");
        users.stream()
                .filter(x -> x.age() < 50 && x.city().contains("Днепр"))
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printUsersAverageFromLviv() {
        System.out.println("Users from Lviv average years:");
        OptionalDouble avg = users
                .stream()
                .filter(x -> x.city().equals("Львов"))
                .mapToInt(User::age)
                .average();
        System.out.println(avg + "\n");
    }

    private static void printUsersFromNotKievCount() {
        System.out.println("Users from not Kiev count:");
        long countNoKiev = users.stream()
                .filter(x -> !x.city().contains("Киев")).count();
        System.out.println(countNoKiev + "\n");
    }

    private static void printUsersAscAgeLimit3() {
        System.out.println("Users ASC Age Limit 3 elements:");
        users.stream()
                .sorted(Comparator.comparing(User::age))
                .limit(3)
                .forEach(System.out::println);
        System.out.println();
    }
}
