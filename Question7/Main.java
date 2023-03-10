package Question7;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=List.of(1,2,3,4,5,6,7,8,9);
        Set<Integer>set=Set.of(1,2,3,4,5,6);
        Map<Integer,String>map=Map.of(1,"One",2,"Two",3,"Three",4,"Four");
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
    }
}
