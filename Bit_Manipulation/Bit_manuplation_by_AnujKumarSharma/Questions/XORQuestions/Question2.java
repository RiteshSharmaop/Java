package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions.XORQuestions;
import java.util.*;
/* Find the Two non- repeating element in an array where every element repeats twice */
public class Question2 {
    public static void UniqueNumber(int [] arr,int n){
        int sum = 0;
        for(int i = 0; i< n ; i++){
            sum = (sum^arr[i]);
        }
        sum = (sum & -sum);
        int sum1 = 0;
        int sum2 = 0;

        for(int i =0; i< arr.length;i++){
            if((arr[i]& sum) > 0){
                sum1 = (sum1 ^ arr[i]);
            }else{
                sum2 = (sum2 ^ arr[i]);
            }
        }
        System.out.println("The Non-Repeating Elements are " + sum1 + " and "+ sum2);

    }
    public static void main(String[]args){
        int arr[] = {5,4,1,4,3,5,1,2};
        int n = arr.length;

        UniqueNumber(arr, n);
        
    }
}
