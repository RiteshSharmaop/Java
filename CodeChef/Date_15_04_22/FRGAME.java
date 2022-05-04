package CodeChef.Apr_22_LongChallenge.Date_15_04_22;
// FRGAME
import java.util.Scanner;

public class FRGAME {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
		int t =sc.nextInt();
		for(int i = 1; i<=t;i++){
		    int a,b,c,d;
		    a =sc.nextInt();
		    b =sc.nextInt();
		    c =sc.nextInt();
		    d =sc.nextInt();
		  //  c Comes
            if(a>b){
                b=b+c;
            }else if(a==b){
                b =b+c;
            }else{
                a=a+c;
            }
            
            // D comes
            if(a>b){
                b=b+d;
            }else if(a==b){
                b = b+d;
            }else{
                a= a+d;
            }
            
            // Answers
            if(a>b){
                System.out.println("N");
            }else if(a==b){
                System.out.println("N");
            }else{
                System.out.println("S");
                
            }
        }

    }
}
