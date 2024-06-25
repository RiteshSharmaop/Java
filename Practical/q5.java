
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        double ans = 1;
        for(int i = 2 ; i <= n ; ++i){
            ans *= i;
        }
        System.out.print("Factorial of " + n + " is : ");
        System.out.println(ans);
        sc.close();
    
    }
}
