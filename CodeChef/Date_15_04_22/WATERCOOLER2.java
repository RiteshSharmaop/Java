package CodeChef.Apr_22_LongChallenge.Date_15_04_22;
// WATERCOOLER2
import java.util.Scanner;

public class WATERCOOLER2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t =sc.nextInt();
        for(int i =1;i<=t;i++){
            int x =sc.nextInt();
            int y = sc.nextInt();
            int c;
            if(y%x==0){
                c= y/x-1;
            }else{
                c=y/x;
            }
            System.out.println(c);
        }


        // Approach 2
        // while(t!=0){
        //     t--;
        //     int a,b,c;
        //     a=sc.nextInt();
        //     b=sc.nextInt();
        //     if(b%a==0){
        //     c=b/a-1;
        //     }
        //     else{
        //     c=b/a;
        //     }
        //     System.out.println(c);
        //     }
    }
}
