package CodeChef.Apr_22_LongChallenge.Date_21_04_22;
import java.util.*;
public class PASSORFAIL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t!=0){
		    int n,x,p,z,y,a;
		    n = sc.nextInt();
		    x = sc.nextInt();
		    p = sc.nextInt();
		    
		    z = x*3;
		    y = n-x;
		    
		    a = z-y;
		    
		    if(a>=p){
		        System.out.println("PASS");
		    }else{
		        System.out.println("FAIL");
		    }
		    
		    t--;
		}
    }
}
