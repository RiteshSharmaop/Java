import java.util.*;
public class BLACKJACK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t,a,b;
        t= sc.nextInt();
        while(t!=0){
            
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(21-(a+b)>10){
                System.out.println(-1);
            }else{
                System.out.println(21-(a+b));
            }
        t--;
        }
    }
}
