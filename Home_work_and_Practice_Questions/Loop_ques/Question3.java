package Loop_ques;
// Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number. package Loop;
// package Home_work_and_Practice_Questions.Loop_ques;
import java.util.*;
public class Question3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int number =sc.nextInt();
        if(number>0){
            for(int i =1;i<=10;i++){
                System.out.println(number +"x"+i+"="+number*i);
            }
        }
    }
}
