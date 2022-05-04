// Write a program to find the factorial value of any number entered through the keyboard. 
package Loop_ques;
// package Home_work_and_Practice_Questions.Loop_ques;
import java.util.*;
public class Question4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int fact=sc.nextInt();
        int number=1;
        if(fact==0){
            System.out.println(1);
        }else if (fact>0){
            for(int i=1;i<=fact;i++){
                number=number*i;
            }
            System.out.println(number);
        }
    }
}
