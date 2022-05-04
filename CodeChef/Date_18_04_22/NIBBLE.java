package CodeChef.Apr_22_LongChallenge.Date_18_04_22;
import java.util.*;
public class NIBBLE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n = sc.nextInt();
		    if(n%4==0){
		        System.out.println("GOOD");
		    }else{
		        System.out.println("NOT GOOD");
		    }
		    t--;
		}
    }
}
