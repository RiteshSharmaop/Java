package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        // Given a number (L-R)print the XOR
        // XOR (L^L+1^L+2^L+3 ........R-1^R-2)
        // if L = 2 = 010
        // R = 4 =  100
        // so 2^3^4 = 101


        // Approch 1
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int res = 0;
        // for(int i = a; i<=b;i++){
        //     res = res^i;
        // }
        // System.out.println("Ans: "+res);

        // Approch 2 
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = b ^ (a-1);
        System.out.println(c);
        sc.close();
    }
}
