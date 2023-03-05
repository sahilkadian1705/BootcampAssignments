package Question2;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[n]);
            int ans=arr[0]/0;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic exception");
        }
        finally {
            System.out.println("final block will continue executing");
        }
    }
}
