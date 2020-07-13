package operations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class operationsRandom {
    public static void execute() {
        System.out.println("wait few seconds...");
        List<Integer> list = new Random().ints()
                .filter(o -> o > 0 && o < 100).limit(15).boxed().collect(Collectors.toList());
        System.out.println("Random list: " + list);
        printMax(list);
        printMin(list);
        printAliquot(list);
        printNumberPlusTen(list);
    }

    private static void printMax(List<Integer> list) {
        int max = list.stream()
                .max(Integer::compareTo).orElseThrow(NoSuchElementException::new);
        System.out.println("MAX: " + max);
    }

    private static void printMin(List<Integer> list) {
        int min = list.stream()
                .min(Integer::compareTo).orElseThrow(NoSuchElementException::new);
        System.out.println("MIN: " + min);
    }

    private static void printAliquot(List<Integer> list) {
        List<Integer> aliquot = list.stream()
                .filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println("ALIQUOT: " + aliquot);
    }

    private static void printNumberPlusTen(List<Integer> list) {
        List<Integer> increase = list.stream().map(x -> x + 10).collect(Collectors.toList());
        System.out.println("INCREASE on 10: " + increase);
    }
}
