import java.util.*;
public class MINCOINS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t,x;
		t = sc.nextInt();
		while(t!=0){
		    x = sc.nextInt();
		    if(x%5==0){
		        if(x%10==0){		        
		            x = x/5;
		            x = x/2;
		            System.out.println(x);
		            
		        }else{
		            x = x/5;
		            x = (x/2)+1;
		            System.out.println(x);
		        }
		            
		    }else{
		        System.out.println(-1);
		    }
		    t--;
		}
    }
}
