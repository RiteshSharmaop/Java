package LoveBabber;

public class countsetBit {
    public static void main(String[] args){
        int count = 0;
        int n = 5;

        
        while(n!=0){
            if((n&1)==1){
                count++;

            }
            n = n>>1;
            n--;
        }
        System.out.println(count);
        
    
    }
}
