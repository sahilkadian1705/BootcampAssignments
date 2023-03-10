package Question3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("Closed Range");
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
}
