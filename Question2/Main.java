package Question2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Take while");
        ls.stream().takeWhile(e->e<5).forEach(System.out::println);
        System.out.println("Drop while");
        ls.stream().dropWhile(e->e<5).forEach(System.out::println);
    }
}
