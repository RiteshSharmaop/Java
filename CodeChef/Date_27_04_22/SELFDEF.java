import java.util.*;
public class SELFDEF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
        
        // Approach 1;
		while(t!=0){
		    int n, count;
            count =0;
		    n =sc.nextInt();
		    int arr[] = new int[n];
		    for(int i =0; i<arr.length;i++){
		        arr[i] =sc.nextInt();
		    }
		    for(int i =0; i<arr.length;i++){
		        if(arr[i]>=10 && 60>=arr[i]){
		            count++;
		        }
		    }
            System.out.println(count);
            t--;
		    }


		}
    }

