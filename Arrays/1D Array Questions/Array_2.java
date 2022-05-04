import java.util.*;

public class Array_2 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size=sc.nextInt();
        String [] arry= new String[size];

        for(int i=0;i<size;i++){
            arry[i] = sc.next();
        }

        int max= Integer.MIN_VALUE;

        for(int i=0;i<size;i++){
            System.out.println(arry[i]);
        }
    }
}
