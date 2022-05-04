package CodeChef.Apr_22_LongChallenge.Date_24_04_22;
import java.util.*;
public class T20MCH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int o = sc.nextInt();
		int c = sc.nextInt();
		
		o = 20 - o;
		o = o*6;
		o = o*6;

		if(o>r-c){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
    }
}
