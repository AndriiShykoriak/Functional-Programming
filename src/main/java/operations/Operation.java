package operations;

import entity.User;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Operation {
    private static List<User> users = User.getUserList();

    public static void execute() {
        printUsersOlder(40);
        printUsersYoungerAndCity(50,"Dnipro");
        printUsersAverageFromCity("Lviv");
        printUsersFromNotCityCount("Kiev");
        printUsersAscAgeLimit(3);
    }

    private static void printUsersOlder(int num) {
        System.out.println("User older 40 years:");
         users.stream()
                .filter(x -> x.age() > num)
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printUsersYoungerAndCity(int num,String city) {
        System.out.println("User younger 50 years and from Dnipro:");
        users.stream()
                .filter(x -> x.age() < num && x.city().contains(city))
                .forEach(System.out::println);
        System.out.println();
    }

    private static void printUsersAverageFromCity(String city) {
        System.out.println("Users from Lviv average years:");
        OptionalDouble avg = users
                .stream()
                .filter(x -> x.city().equals(city))
                .mapToInt(User::age)
                .average();
        System.out.println(avg + "\n");
    }

    private static void printUsersFromNotCityCount(String city) {
        System.out.println("Users from not Kiev count:");
        long countNoKiev = users.stream()
                .filter(x -> !x.city().contains(city)).count();
        System.out.println(countNoKiev + "\n");
    }

    private static void printUsersAscAgeLimit(int num) {
        System.out.println("Users ASC Age Limit 3 elements:");
        users.stream()
                .sorted(Comparator.comparing(User::age))
                .limit(num)
                .forEach(System.out::println);
        System.out.println();
    }
}
