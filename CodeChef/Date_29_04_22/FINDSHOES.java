import java.util.*;
public class FINDSHOES {
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
		int t,x,y,z;
		t = sc.nextInt();
		// Approach1
		while(t!=0){
		    x = sc.nextInt();
		    y = sc.nextInt();
		    if(y>x){
		        System.out.println(x);
		    }else{
		        System.out.println((x*2)-y);
		        
		    }
		        
		   
		    t--;
		}


        // Approach 2


// 		while(t!=0){
// 		    x = sc.nextInt();
// 		    y = sc.nextInt();
// 		    z = x*2 -y;
// 		    if(x>y){
// 		        System.out.println(z);
// 		    }else{
// 		        System.out.println(x);
		        
// 		    }
		        
		   
// 		    t--;
// 		}
    }
}
