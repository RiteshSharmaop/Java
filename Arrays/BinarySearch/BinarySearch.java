import java.util.Scanner;

public class BinarySearch {
    public static Boolean Binary(int arr[],int n,int target){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
        
    
        while(s<=e){
            int midd = arr[mid];
            if(midd==target){
                // System.out.println("YES");
                return true;
            }
            if(midd>target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
            mid = s+(e-s)/2;
        }
        // System.out.println("NO");
        return false;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-2,0,3,4,5,6,8};
        int n = 7;
        int target = sc.nextInt();
        


        if(Binary(arr, n, target)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
