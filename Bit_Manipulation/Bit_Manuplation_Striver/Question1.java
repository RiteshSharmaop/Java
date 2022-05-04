package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter TestCases: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        // Taking input
        for(int i =0; i<size;i++){
            arr[i] = sc.nextInt();
        }

        // printing Unique one
        int res = 0;
        for(int i = 0; i<arr.length;i++){
            res = arr[i]^res;
        }
        System.out.println("Unique: "+res);
    }
}
