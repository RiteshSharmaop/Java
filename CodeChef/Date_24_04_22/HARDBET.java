import java.util.*;
public class HARDBET {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		
		int t =sc.nextInt();
		while(t!=0){
		    int a,b,c;
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    
		    
		    if(c<a && c<b){
		        System.out.println("Alice");
		    }else if(b<a && b<c){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Draw");
		    }
		    t--;
		   
		}
    }
}
