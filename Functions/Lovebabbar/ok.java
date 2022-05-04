package Lovebabbar;
import java.util.*;
public class ok {
    public static int multi(int n){
        int c = 1;
        for(int i = 1; i<=n;i++){
            c = c*i;
        }
        // System.out.println(c);
        return c;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // multi(n);
        System.out.println(multi(n));
    }
}
