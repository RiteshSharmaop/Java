import java.util.*;
public class POLTHIEF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t!=0){
		    int x,y;
		    x = sc.nextInt();
		    y = sc.nextInt();
		    if(y>=x){
		        System.out.println(y-x);
		    }else{
		        System.out.println(x-y);
		    }
		    t--;
		}
    }
}
