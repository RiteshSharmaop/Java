package Exercise;
import java.util.*;
public class ExerciseFunction {
    public static float avera(int a,int b,int c){
        float divi=(a+b+c)/3;
        return divi;

    }
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        System.out.println(avera(a, b, c));
    }

}