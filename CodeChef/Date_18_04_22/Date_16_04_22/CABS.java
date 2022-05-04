package CodeChef.Apr_22_LongChallenge.Date_16_04_22;
// CABS
import java.util.*;
public class CABS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t!=0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y){
                System.out.println("SECOND");
            }else if(x==y){
                System.out.println("ANY");
            }else{
                System.out.println("FIRST");
            }
            t--;
        }
        sc.close();
    }
}
