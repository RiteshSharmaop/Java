package Loop_ques;
// package Home_work_and_Practice_Questions.Loop_ques;
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
// import java.util.*;
// public class Question7 {
//     public static void main (String[]args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int eve=0;
//         int odd=0;
//         for(int i=0;i<=n;i++){
//             if(i%2==0){
//                 eve=eve+i;
//             }else{
//                 odd=odd+i;
//             }
//         }
//         System.out.println(eve);
//         System.out.println(odd);
        
//     }
// }

import java.util.Scanner;

public class Question7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;
        
        do
        {
            System.out.print("Enter the number ");
            number = sc.nextInt();
        
            if( number % 2 == 0)
            {
                evenSum += number;
            }
            else
            {
                oddSum += number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        sc.close();
        
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }  
}
