import java.util.*;
public class CREDITS {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in); 
		int t,x,i;
		t=sc.nextInt();
		
		for(i =1;i<=t;i++){
		    x =sc.nextInt();
		    if(x>65){
		        System.out.println("Overload");
		    }else if(x<35){
		        System.out.println("Underload");
		    }else{
		        System.out.println("Normal");
		    }
		}
    }
}
