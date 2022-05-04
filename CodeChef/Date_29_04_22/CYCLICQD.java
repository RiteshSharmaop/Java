import java.util.*;
public class CYCLICQD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t,a,b,c,d;
		t = sc.nextInt();
		while(t!=0){
		    a = sc.nextInt();
		    b = sc.nextInt();
		    c = sc.nextInt();
		    d = sc.nextInt();
		    if(a+c==180 && b+d==180){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
		    t--;
		}
    }
}
