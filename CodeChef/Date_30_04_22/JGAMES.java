import java.util.*;
public class JGAMES {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if((x+y)%2==0){
		        System.out.println("Janmansh");
		    }else{
		        System.out.println("Jay");
		    }
		    
		    t--;
		}
    }
}
