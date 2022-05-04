package CodeChef.Apr_22_LongChallenge.Date_15_04_22;
// MATCHES
import java.util.*;
public class MATCHESLinkList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        // for(int j=1;j<=t;j++){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int sum= a+b;
            int val =0;
            String summ = String.valueOf(sum);
            char[] arr = summ.toCharArray();
            
            

            
            for(int i = 0; i<arr.length;i++){
                if(arr[i]==0){
                    val = val+6;
                }else if(arr[i]==1){
                    val = val+2;
                }else if(arr[i]==2){
                    val = val+5;
                }else if(arr[i]==3){
                    val = val+5;
                }else if(arr[i]==4){
                    val = val+4;
                }else if(arr[i]==5){
                    val = val+5;
                }else if(arr[i]==6){
                    val = val+6;
                }else if(arr[i]==7){
                    val = val+3;
                }else if(arr[i]==8){
                    val = val+7;
                }else if(arr[i]==9){
                    val = val+6;
                }
            }

            // int arr[] ={sum};
            // for(int i =0;i<=arr.length-1;i++){
            //     if(arr[i]==0){
            //         val = val+6;
            //     }else if(arr[i]==1){
            //         val = val+2;
            //     }else if(arr[i]==2){
            //         val = val+5;
            //     }else if(arr[i]==3){
            //         val = val+5;
            //     }else if(arr[i]==4){
            //         val = val+4;
            //     }else if(arr[i]==5){
            //         val = val+5;
            //     }else if(arr[i]==6){
            //         val = val+6;
            //     }else if(arr[i]==7){
            //         val = val+3;
            //     }else if(arr[i]==8){
            //         val = val+7;
            //     }else if(arr[i]==9){
            //         val = val+6;
            //     }
            // }
            System.out.println(val);

        
    }
}
