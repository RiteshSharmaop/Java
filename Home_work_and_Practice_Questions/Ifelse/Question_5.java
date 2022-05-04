package Ifelse;

// package Home_work_and_Practice_Questions.Ifelse;
import java.util.*;
public class Question_5 {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int Salary =sc.nextInt();
        System.out.println("Enter your Service Year: ");
        int year=sc.nextInt();

        if (year>5){
            System.out.println("Congratulation, You will get 5% bonus "+Salary*0.005+"Which is"+((Salary*0.005)+Salary));
        }
    }
}
