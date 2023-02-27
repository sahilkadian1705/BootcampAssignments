import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]={{1,2,3,4},
                    {4,5,6,7},
                    {7,8,9,10}};
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+" : "+sum);
        }
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println("Sum of col "+(i+1)+" : "+sum);
        }
    }
}
