package Question1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args){
        Consumer<Integer>consumer = c -> System.out.println(c);
        consumer.accept(12);
        Supplier<Double> supplier = () -> Math.random();
        System.out.println(supplier.get());
        Predicate<Integer> predicate = p -> p%2==0;
        System.out.println(predicate.test(16));
        Function<Integer,Double> function = f -> f*10.3;
        System.out.println(function.apply(20));
    }
}
