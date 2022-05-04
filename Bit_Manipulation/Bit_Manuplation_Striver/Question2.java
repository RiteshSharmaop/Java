package Bit_Manipulation.Bit_Manuplation_Striver;

public class Question2 {
    public static void main(String[]arfgs){
        int a = 5;
        int b = 7;

        a= a^b;
        b= a^b;
        a= a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
