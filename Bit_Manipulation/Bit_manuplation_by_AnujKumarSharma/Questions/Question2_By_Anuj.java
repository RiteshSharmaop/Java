package Bit_Manipulation.Bit_manuplation_by_AnujKumarSharma.Questions;
import java.util.*;
public class Question2_By_Anuj {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        if((a & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        sc.close();
    }
}