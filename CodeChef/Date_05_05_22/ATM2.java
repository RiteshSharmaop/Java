import java.util.*;
public class ATM2 {
    public static void main(String[] arsg){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    String sum = "";
		    String ok;
		    int arr[] = new int[n];
		    for(int i = 0 ; i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    for(int i = 0; i<n;i++){
		        if(k>=arr[i]){
		            sum =sum + "1";
		            k = k - arr[i];
		        }else{
		            sum = sum+"0";
		            
		        }
		    }
            System.out.println(sum);
		    
		    t--;
		}
    }
}
