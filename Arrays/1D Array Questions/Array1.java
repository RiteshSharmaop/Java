import java.util.*;
public class Array1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an Array: ");
        int size=sc.nextInt();
        int [] arr= new int[size];

        //taking array value form input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        //output
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
}