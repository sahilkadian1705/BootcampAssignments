package Question1;
import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Float> ls=new ArrayList<>();
        ls.add(2.3F);
        ls.add(3.4F);
        ls.add(7.3F);
        ls.add(5.8F);
        ls.add(9.6F);
        Iterator<Float> it=ls.iterator();
        float sum = 0;
        while(it.hasNext()){
            sum=sum+it.next();
        }
        System.out.println(sum);
    }
}
