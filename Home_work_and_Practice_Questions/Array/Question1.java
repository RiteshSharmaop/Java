package Array;
// Write a Java program to sum values of an array.
import java.util.*;
public class Question1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum =0;
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            sum=arr[i]+sum;
        }
        System.out.println(sum);
    }
}
