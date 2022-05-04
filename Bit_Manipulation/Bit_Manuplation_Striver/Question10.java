package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int mask = 1<<0;
        if((n&mask)==0){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }


        // another approach (Striver Bhaiya)
        System.out.println(n&(n-1));
        
        if((n&(n-1))==0){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }
        sc.close();
    }
}
