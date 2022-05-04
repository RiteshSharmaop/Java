package CodeChef.Apr_22_LongChallenge.Date_12_04_22;
import java.util.*;
public class Question2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int arr [] = new int[5];
        int ok = arr[0] - arr[1];
        int op = arr[2]+arr[3]+arr[4];
        for(int k = 1;k<=t;k++){
            for(int i =0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1;i<arr.length;i++){
                if(ok>op){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
    }
        
        


        sc.close();
    }
}
