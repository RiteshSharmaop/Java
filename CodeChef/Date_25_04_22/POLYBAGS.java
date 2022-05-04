package CodeChef.Date_25_04_22;
import java.util.*;
public class POLYBAGS {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =1;i<=t;i++){
		    int n = sc.nextInt();
		    if(n%10==0){
		        System.out.println(n/10);
		    }else{
		        System.out.println((n/10)+1);
		    }
		}
    }
}
