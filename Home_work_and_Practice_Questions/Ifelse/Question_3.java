package Ifelse;
// package Home_work_and_Practice_Questions.Ifelse;
import java.util.*;
public class Question_3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Quantity: ");
        int Quantity=sc.nextInt();

        if((Quantity*100)>=000){
            System.out.println("You Will Get 10% Discount Which is "+(Quantity*.1*100)+"and You have to Pay now "+(Quantity*100-(Quantity*.1*100)));
        }else{
            System.out.println("You Didn't Get Discount");
        }

    }
}
