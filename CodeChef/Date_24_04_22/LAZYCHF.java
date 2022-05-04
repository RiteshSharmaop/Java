import java.util.*;
import java.lang.Math;
public class LAZYCHF {
    public static void maiin(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int x,m,d;
		    x = sc.nextInt();
		    m = sc.nextInt();
		    d = sc.nextInt();
		    
		    m = x*m;
		    d = x+d;
		    
		    if(m>d){
		        System.out.println(d);
		    }else{
		        System.out.println(m);
		    }
		    t--;
		}
    }
}
