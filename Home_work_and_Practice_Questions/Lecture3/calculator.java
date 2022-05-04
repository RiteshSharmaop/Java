package Lecture3;
// package Home_work_and_Practice_Questions;
import java.util.*;
public class calculator {
    public static void main(String[]argu){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter What you Want to do: ");
        char b = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        int c = sc.nextInt();
        double addition= a+c;
        double subtract= a-c;
        double Divide= a/c;
        double Multiply= a*c;
        double Reminder= a%c;
        switch(b){
            case '+':
            {System.out.println("Answer: " + addition );
            break;
        }
            case '-': System.out.println("Answer: " + subtract);
            break;
            case '/': System.out.println("Answer: " + Divide);
            break;
            case '*': System.out.println("Answer: " + Multiply);
            break;
            case '%': System.out.println("Answer: " + Reminder);
            break;
            default: System.out.println("Invalid!!!");
        
            }

            sc.close();
        
    }
}
