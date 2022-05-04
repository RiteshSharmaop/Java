import java.util.*;
public class TYRES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n,ok;
		    n =sc.nextInt();
		    if(n>=4){
		        ok = n%4;
		        if(ok!=0){
		            System.out.println("YES");
		        }else{
		            System.out.println("NO");
		        }
		    }else if(n==2){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    t--;
		}
    }
}
