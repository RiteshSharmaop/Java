package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions;
import java.util.*;
public class Question4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = n & (n-1);
        for(int i = 1; i<=n;i++){
            n = n & (n-1);
        }
        System.out.println(n);
        sc.close();
    }
}
