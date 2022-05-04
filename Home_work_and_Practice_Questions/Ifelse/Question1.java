package Ifelse;

// package Home_work_and_Practice_Questions.Ifelse;
import java.util.*;
public class Question1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int length=sc.nextInt();
        int Breadth=sc.nextInt();

        if (length== Breadth){
            System.out.println("Square");
        }else {System.out.println("Rectrangle");
        }
    }
}