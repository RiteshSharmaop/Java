package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question6 {
    public static void main(String[]args){
        // (n,i) Check if the ith bit is set or not (set=1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1<<i;

        if((n&mask)==0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        sc.close();
    }
}
