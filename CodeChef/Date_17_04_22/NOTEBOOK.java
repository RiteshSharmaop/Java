package CodeChef.Apr_22_LongChallenge.Date_17_04_22;
import java.util.*;
public class NOTEBOOK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n = sc.nextInt();
		    n = n*1000;
		    System.out.println(n/100);
		    t--;
		}
    }
}
