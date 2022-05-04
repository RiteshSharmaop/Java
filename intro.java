import java.util.*;
public class intro {
    public static void main(String args[]){
        Scanner op=new Scanner (System.in);
        int n=op.nextInt();
        if(n%n==1){
            System.out.println(n+"is Prime");
        }else{
            System.out.println(n+"is Non-Prime");
        }
        op.close();
    }
    
}
