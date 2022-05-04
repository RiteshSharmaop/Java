package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(n&(n-1));
        sc.close();
    }
}
