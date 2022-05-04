package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions.XORQuestions;
import java.util.*;
/* Find the Only non-repeating element in an array Where every Element Repates twice*/
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TestCases: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int res = 0;
        // res= arr[0]^res;
        // res = arr[1]^res;
        // res = arr[2]^res;
        // res = arr[3]^res;
        // res = arr[4]^res;
        // res = arr[5]^res;
        // res = arr[6]^res;

        // Taking input
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        // printing Unique one
        for(int i = 0; i<arr.length;i++){
            res = arr[i]^res;
        }
        System.out.println("Unique: "+res);
    }
}
