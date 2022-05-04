import java.util.*;
public class MOVIE2X {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Approach 1
        int x,y;
        x =  sc.nextInt();
        y = sc.nextInt();
        
        y = y/2;
        System.out.println(x-y);


        // Approach 2
        
        
        int arr[] = new int[2];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        
        arr[1] = arr[1]/2;
        
        System.out.println(arr[0]-arr[1]);
        
    }
}
