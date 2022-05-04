
import java.util.*;
public class Question3 {
    public static void fac(int n){
        if(n<=0){
            System.out.println("Invallid Number");
            return;
        }else{
            int factorial = 1;
            for(int i=1;i<=n;i++){
                factorial= factorial*i;
            }
            System.out.println(factorial);
                return;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fac(n);
    }
}
