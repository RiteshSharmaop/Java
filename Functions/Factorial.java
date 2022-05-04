import java.util.*;

public class Factorial {
    public static void fac(int n){
        //Condition 
        if (n < 0){
            System.out.println("Invalid Number");
            return;
        }
        //loop
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
        
    }
    public static void main(String args[]){
        Scanner ok =new Scanner(System.in);
        int n=ok.nextInt();

        fac(n);
    }

}
