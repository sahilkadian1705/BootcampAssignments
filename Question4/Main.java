package Question4;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Optional<Integer> ans=list.stream().filter(e -> e>5).reduce(Integer::sum);
        if(ans.isPresent()){
            System.out.println(ans.get());
        }
        else{
            System.out.println("No values greater than 5");
        }
    }
}
