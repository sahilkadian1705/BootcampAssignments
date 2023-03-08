package Question3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer>ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
                ls.stream()
                .filter(e -> e>5)
                .mapToInt(Integer::intValue)
                .sum());
    }
}
