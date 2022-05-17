import java.util.*;
public class FiratLAst {
    public static int First(int arr[],int n,int target){
        int s = 0;
        int e = n-1;
        int min = 0;
        // int min = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            int midd = arr[mid];
            if(midd ==target){
                min = mid;
                e = mid -1;
                
            }
            if(target>midd){
                s = mid+1;
            }
        }
        return min;
    }
    public static int Last(int arr[], int n, int target){
        int s = 0;
        int e = n-1;
        int max = 0;
        
        while(s<=e){
            int mid = s+(e-s)/2;
            int midd = arr[mid];
            if(midd == target  )
        }

    }
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,5,5,5,67,123,125};
        int n = arr.length;
        int target = 5;
        // int target = op.nextInt();


        System.out.println(First(arr, n, target));
        System.out.println(Last(arr, n, target));
    }
}
