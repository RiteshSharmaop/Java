import java.util.*;
public class sumOfTwo{
    
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[]argu){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();

        //we can print our operations by two type
        //1st type
        System.out.println(calculateSum(a, b));
        //2nd type
        int sum=calculateSum(a, b);
        System.out.println("Sum of two numbers is: "+sum);
    }
}
