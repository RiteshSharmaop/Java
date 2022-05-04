// Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
package Loop_ques;
// package Home_work_and_Practice_Questions.Loop_ques;
import java.util.*;
public class Question6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String number =sc.next();
        for(int i=number.length();i>=1;i--){
            int ok=(int)i;
            System.out.print(ok);
            
        }
        System.out.println();
        sc.close();
        System.out.println(((Object )number).getClass().getSimpleName());
        // System.out.println(((Object )ok).getClass().getSimpleName());

    }
}

// public class ReverseNumber
// {
//     public static void main(String[] args)
//     {
//         Scanner console = new Scanner(System.in);
     
//         int number;
//         int reverse = 0;
        
//         System.out.print("Enter the number ");
//         number = console.nextInt();
        
//         int temp = number;
//         int remainder = 0;
        
//         while(temp>0)
//         {
// 	    remainder = temp % 10;
// 	    reverse = reverse * 10 + remainder;
//             temp /= 10;
//         }

//         System.out.println("Reverse of " + number + " is " + reverse);
//     }
// }
