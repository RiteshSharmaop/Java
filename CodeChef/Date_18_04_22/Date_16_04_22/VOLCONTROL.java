package CodeChef.Apr_22_LongChallenge.Date_16_04_22;
import java.util.*;
public class VOLCONTROL {
    public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t!=0){
		    int x= sc.nextInt();
		    int y= sc.nextInt();
		    if(x>y){
		        System.out.println(x-y);
		    }else if(x==y){
		        System.out.println(0);
		    }else{
		        System.out.println(y-x);
		    }
		    t--;
		}
	}
}
