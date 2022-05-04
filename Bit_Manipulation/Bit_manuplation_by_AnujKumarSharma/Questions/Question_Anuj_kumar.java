package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions;
import java.util.*;
public class Question_Anuj_kumar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 22;
        int b = 27;
        System.out.println(a^b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
        sc.close();
    }
}
