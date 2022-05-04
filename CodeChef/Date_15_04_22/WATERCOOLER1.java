package CodeChef.Apr_22_LongChallenge.Date_15_04_22;
import java.util.*;
public class WATERCOOLER1 {
    public static void main(String[] arhs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1;i<=t;i++){
            int x,y,m;
            x = sc.nextInt();
            y = sc.nextInt();
            m = sc.nextInt();
            
            if((x*m)>=y){
                System.out.println("no");
            }else {
                System.out.println("yes");
            }
            
        }
    }
}
