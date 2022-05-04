package LoveBabber;
public class powerOF2 {
    public static void main(String[] args){
        int n = 8;

        if((n&(n-1))==0){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }

        // 2nd Approach
        // int count = 0;
        // while(n!=0){
        //     if(n&1){
        //         count++;
        //     }
            
        //     n= n>>1;
        // }
        // if(count==1){
        //     return true;
        // }else{
        //     return false;
        // }
        
    }
}


