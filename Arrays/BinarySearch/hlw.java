import java.util.Scanner;

public class hlw {
    public static int balu(int arr[],int n , int target){
        int s = 0;
        int e = n-1;

        while(s<=e){
            int mid= s +(e-s)/2;
            int midd = arr[mid];
            if(target==midd){
                return mid;
            }
            if(target>midd){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int arr[] = {1,3,4,6,7,9};
        int n =  arr.length;
        // int target = sc.nextInt();

        int ok =balu(arr, n, 9);
        System.out.println(ok);
        
    }
}
