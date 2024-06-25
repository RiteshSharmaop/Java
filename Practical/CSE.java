
import java.util.Scanner;

public class CSE {
    public static void main(String [] arsg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Addition : " +(a+b));
        System.out.println("Substraction : " + (a-b));
        System.out.println("Multiplication : " +( a*b));
        System.out.println("Division : " + (a/b));
        System.out.println("Modulo : " + (a%b));

        sc.close();
    }
}
