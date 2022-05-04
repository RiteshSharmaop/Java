package Exercise;
import java.util.*;
public class ExerciseFunctionTwo{
    public static void oddy(int n){
        int sum =0;
        for(int i=1;i<=n;i=i+2){
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
        public static void main(String argu[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        

        oddy(n);
    }
    
}