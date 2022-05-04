
import java.util.*;

public class ArrayH_W {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        String [] arry= new String[size];

        for(int i=0;i<size;i++){
            arry[i] = sc.next();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.print("Name "+i+": ");
            System.out.println(arry[i]);
        }
        sc.close();
    }
    
}
