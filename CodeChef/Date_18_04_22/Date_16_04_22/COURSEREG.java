package CodeChef.Apr_22_LongChallenge.Date_16_04_22;
import java.util.*;
public class COURSEREG {
    public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n, m,k,p;
		    n = sc.nextInt();
		    m = sc.nextInt();
		    k = sc.nextInt();
		    p= m-k;
		    
		    if(p>=n){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
	}
}
