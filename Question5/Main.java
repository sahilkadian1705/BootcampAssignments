package Question5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>ls= Arrays.asList(1,2,3,4,5,6,7,8,9);
        ls.stream()
                .filter(e->e>5)
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("Element not found"));
    }
}