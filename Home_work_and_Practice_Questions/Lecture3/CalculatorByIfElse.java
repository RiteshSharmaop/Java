package Lecture3;

import java.util.*;
public class CalculatorByIfElse{
    public static void main(String[]argu){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.print("Enter What you Want to do: ");
        char b = sc.next().charAt(0);
        System.out.print("Enter Second Number: ");
        int c = sc.nextInt();

        if (b== '+'){
            System.out.print("Answer:");
            System.out.println(a + c);
        }else if (b=='-'){
            System.out.print("Answer:");
            System.out.println(a - c);
        }else if (b == '/'){
            System.out.print("Answer:");
            System.out.println(a/c);
        }else if (b=='*'){
            System.out.print("Answer:");
            System.out.println(a*c);
        }else if (b=='%'){
            System.out.print("Answer:");
            System.out.print(a%c);
        }else {
            System.out.print("Answer:");
            System.out.print("Inavalid ");
        }


        



        sc.close();
    }
    
}
