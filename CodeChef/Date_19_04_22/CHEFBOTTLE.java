package CodeChef.Apr_22_LongChallenge.Date_19_04_22;
import java.util.*;
public class CHEFBOTTLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n,x,k;
		    n = sc.nextInt();
		    x = sc.nextInt();
		    k = sc.nextInt();
		    if((k/x)>=n){
		        System.out.println(k/x);
		    }else if((k/x)=<n){
		        System.out.println(n-(k/x));
		    }
		    t--;
		}
    }
}
