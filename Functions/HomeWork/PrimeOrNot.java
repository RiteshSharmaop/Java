package HomeWork;
import java.util.*;

public class PrimeOrNot {
    public static void primeOrNonPrime(int n){
        for(int i=2;i<n;i++)
            if(n%i==0){
                System.out.println(n+"is Prime");
            }else{
                System.out.println(n+"is Non-Prime");
            }
        return;
    }
    public static void main(String[]argu){
        Scanner op=new Scanner(System.in);
        int n=op.nextInt();
        op.close();

        primeOrNonPrime(n);
    }
    
}
