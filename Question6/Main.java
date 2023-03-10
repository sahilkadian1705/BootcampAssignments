package Question6;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello world");
        Stream<String> stream = optional.stream();
        stream.forEach(System.out::println);
    }
}
