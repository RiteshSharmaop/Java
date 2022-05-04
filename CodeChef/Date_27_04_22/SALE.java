import java.util.*;
public class SALE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    int t,a,b,c;
	    t=sc.nextInt();
	    while(t!=0){
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();
	        if(a>=b && c>=b){
	            System.out.println(a+c);
	        }else if(a<=b && a<=c){
	            System.out.println(b+c);
	        }else{
	            System.out.println(a+b);
	        }
	        t--;
	    }
    }
}
