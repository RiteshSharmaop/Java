package CodeChef.Apr_22_LongChallenge.Date_19_04_22;
import java.util.*;
public class BATH {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int x,y;
		    x = sc.nextInt();
		    y = sc.nextInt();
		    y = y*2;
		    System.out.println(x/y);
		    t--;
		}
    }
}
