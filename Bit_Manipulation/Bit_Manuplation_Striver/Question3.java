package Bit_Manipulation.Bit_Manuplation_Striver;
import java.util.*;
public class Question3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        // My Approch
        // int n = sc.nextInt();
        // int xor=0;

        // for(int i =1; i<=n ; i++){
        //     xor = i^xor;
        // }
        // System.out.println("Answer is: "+xor);
        
        
        int n =sc.nextInt();
        if(n%4==0){
                System.out.println(n);
        }else if(n%4==1){
            System.out.println(1);
        }else if(n%4==2){
            System.out.println(n+1);
        }else if(n%4==3){
            System.out.println(1);
        }


        sc.close();
        }
    }
