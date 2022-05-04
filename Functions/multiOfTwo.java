import java.util.*;
public class multiOfTwo {
    public static int calculateMulti(int a,int b){
        int multi=a*b;
        return multi;  //but it domt print

    }
    public static void main(String argu []){
        Scanner op=new Scanner(System.in);
        int a =op.nextInt();
        int b =op.nextInt();

    System.out.println("Multiplication of two number is: "+calculateMulti(a, b));
    
    /*
    multi = calculateMulti(a,b);
    System.out.println(multi);
    */
    }
    
}
