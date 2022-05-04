package CodeChef.Apr_22_LongChallenge.Date_12_04_22;
import java.util.*;
public class Question {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        for(int i = 1; i<=t;i++){
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int ok = z-y;
            int op = a+b+c;
            
            if(ok>=op){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
    }
    }
}
