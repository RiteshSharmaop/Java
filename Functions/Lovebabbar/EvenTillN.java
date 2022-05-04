package Lovebabbar;
import java.util.*;
public class EvenTillN {
    public static int multi(int n){
        for(int i = 2; i<=n;i=i+2){
            System.out.println(i);
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        multi(n);
    }
}
