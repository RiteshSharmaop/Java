package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma;
import java.util.*;

public class FindIthBit_GetBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i =sc.nextInt();  // i = position
        int mask = 1<<i;

        if((n&mask)==0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
        sc.close();
    }
}
