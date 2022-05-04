import java.util.*;
public class MINCARS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t,n;
		t = sc.nextInt();
		while(t!=0){
            n = sc.nextInt();
            if(n%4==0){
                System.out.println(n/4);
            }else{
                n= n/4;
                n = n+1;
                System.out.println(n);
            }
        t--;
		}
    }
}
