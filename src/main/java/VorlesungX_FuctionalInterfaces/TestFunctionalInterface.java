package VorlesungX_FuctionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

public class TestFunctionalInterface {
    public static void main(String[] args) {
        int x = 5;
        Function<Integer, Integer> func = value -> 3 * x - 1;
        System.out.println(func.apply(x));

        Predicate<Integer> pred = value -> value % 2 == 0;
        System.out.println(pred.test(127));
    }
}
