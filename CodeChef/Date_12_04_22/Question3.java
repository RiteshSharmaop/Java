package CodeChef.Apr_22_LongChallenge.Date_12_04_22;
import java.util.*;
public class Question3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        int sum =0;


        for(int i =1;i<=t;i++){
            int m =sc.nextInt();
            int n =sc.nextInt();
            int k =sc.nextInt();

            for(int j = 1; j<=n;j++){
                sum =j*k;
            }
            if(m<=sum){
                System.out.println("NO");

            }else{
                System.out.println("YES");

            }
            sum =sum^sum;
        }
    }
}
