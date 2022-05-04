import java.util.*;
public class CHEFRACES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t,x,y,a,b;
		t = sc.nextInt();
		while(t!=0){
		    x = sc.nextInt();
		    y= sc.nextInt();
		    a = sc.nextInt();
		    b = sc.nextInt();
		    if(x==a && y ==b || y==a && x ==b){
		        System.out.println(0);
		    }else if( x==b || x == a || y==a || y==b){
		        System.out.println(1);
		    }else{
		        System.out.println(2);
		    }
		    t--;
		}
    }
}
