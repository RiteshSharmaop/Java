package CodeChef.Apr_22_LongChallenge.Date_12_04_22;
import java.util.*;
// SQUIDRULE
public class Question1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int ok = 0;
        for(int j=0;j<t;o++){
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i= 0;i<n-1;i++){
                    arr[i] =sc.nextInt();
                }
                for(int i= 0;i<n;i++){
                    for(int k =0; k<arr.length-1;k++){
                        for(int o =0; o<arr.length-i-1;o++){
                            if(arr[o] > arr[o+1]){  
                                arr[o] = arr[o]^arr[o+1];
                                arr[o+1] = arr[o]^arr[o+1];
                                arr[o] = arr[o]^arr[o+1];
            
                            }
                        }
                }
                
                ok = ok^ok;

            }
            
        sc.close();
    }
}
