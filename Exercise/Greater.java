package Exercise;
import java.util.*;
public class Greater {
    public static int maximum(int a,int b){
        /**
        
        if(a > b) {
        return a;
        } else {
        return b;
        }
        

         */
        int c= Math.max(a,b);
        return c;
    }
    public static void main(String argu[]){
        Scanner sc = new Scanner (System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("Greater"+maximum(a, b));
    }
}
