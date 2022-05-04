// Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)

package Loop_ques;
// package Home_work_and_Practice_Questions.Loop_ques;
import java.util.*;

public class Question5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        int hii=1;
        for(int i=1;i<=power;i++){
            hii=number*hii;
        
        }
        System.out.println(hii);

    }
}
