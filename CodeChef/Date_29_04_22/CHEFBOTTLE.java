import java.util.*;
public class CHEFBOTTLE {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
		int t,n,x,k;
		t= sc.nextInt();
		while(t!=0){
		    n = sc.nextInt();
		    x = sc.nextInt();
		    k = sc.nextInt();
		    
		    if(n>k/x){
		        System.out.println(k/x);
		    }else{
		        System.out.println(n);
		    }
		    t--;
		}
    }
}
