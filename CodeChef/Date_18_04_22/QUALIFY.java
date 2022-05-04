package CodeChef.Apr_22_LongChallenge.Date_18_04_22;
import java.util.*;
public class QUALIFY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int x,a,b;
		    x = sc.nextInt();
		    a = sc.nextInt();
		    b = sc.nextInt();
		    a = a*1;
		    b = b*2;
		    if((a+b)>=x){
		        System.out.println("Qualify");
		    }else{
		        System.out.println("NotQualify");
		    }
		    t--;
		}
    }
}
