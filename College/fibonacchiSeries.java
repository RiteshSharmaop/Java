import java.util.Scanner;

public class fibonacchiSeries {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();
        int ans = 0 ,ans2 = 1;
        System.out.print(ans);
        System.out.print(ans2);
        for(int i = 1 ; i <= n ; i++){
            int val = ans + ans2;
            System.out.print(ans+ans2);
            ans = ans2;
            ans2 = val;
        }
    }
}
