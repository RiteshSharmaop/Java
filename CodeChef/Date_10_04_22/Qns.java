package CodeChef.Apr_22_LongChallenge.Date_10_04_22;
import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Qns {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        for(int j = 1;j<=t;j++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int sub = 0;
                int arr[] = new int[n];
            
            for(int i = 0 ; i<n ;i++){
                arr[i] = sc.nextInt();
            }
            
            for(int i = 0 ; i<n ;i++){
                if(arr[i]>k){
                    sub++;
                }
            }
            System.out.println(sub);

        }
        


    }
}
