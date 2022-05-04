package CodeChef.Apr_22_LongChallenge.Date_21_04_22;
import java.util.*;
public class RCBPLAY {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t!=0){
		    int x,z,y;
		    x = sc.nextInt();
		    y = sc.nextInt();
		    z = sc.nextInt();
		    
		    z = z*2;
		    if((x+z)>=y){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		    t--;
		}
    }
}
