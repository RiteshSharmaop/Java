package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions.XORQuestions;
import java.util.*;
public class Question2AnotherType {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Taking array from user
        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        
        int sum = 0;

        for(int i = 0; i< n ; i++){
            sum = (sum^arr[i]);
        }
        System.out.println("Sum: "+ sum);
        sum = (sum & -sum);
        System.out.println("-sum "+-sum);
        System.out.println("sum "+sum);
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
}
