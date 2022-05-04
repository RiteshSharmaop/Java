package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question11 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        

        int count = 0;

        // Approch 1
        // while(n!=0){
        //         if((n&1)==1){
        //                 count++;
        //             }
        //         n = n>>1;
        //         }
        //         System.out.println(count);
                
        // Approch 2

        while(n!=0){
                n = n&(n-1);
                count++;

        }
        System.out.println(count);


        sc.close();
    }
}
