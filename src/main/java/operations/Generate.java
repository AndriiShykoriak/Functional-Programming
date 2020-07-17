package operations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.Collectors;

public class Generate {
    static Random random = new Random();
    public static void execute() {
        System.out.println("wait few seconds...");
        List<Integer> list = random.ints()
                .filter(o -> o > 0 && o < 100).limit(15).boxed().collect(Collectors.toList());
        System.out.println("Random list: " + list);
        printMax(list);
        printMin(list);
        printAliquot(list,2);
        printNumberIncrease(list,10);
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

    private static void printAliquot(List<Integer> list, int num) {
        List<Integer> aliquot = list.stream()
                .filter(x -> x % num == 0).collect(Collectors.toList());
        System.out.println("ALIQUOT: " + aliquot);
    }

    private static void printNumberIncrease(List<Integer> list,int num) {
        List<Integer> increase = list.stream().map(x -> x + num).collect(Collectors.toList());
        System.out.println("INCREASE on 10: " + increase);
    }
}
