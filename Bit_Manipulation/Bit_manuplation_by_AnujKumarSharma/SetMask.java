package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma;
import java.util.*;
public class SetMask {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask = 1<<i;

        System.out.println(n|mask);
        sc.close();
    }
}
