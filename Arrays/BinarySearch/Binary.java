import java.util.*;
public class Binary {
    public static boolean bina(int arr[],int n,int key){
        int s = 0;
        int e = n-1;
        
        int mid = s+(e-s)/2;
        while(s<=e){
            int midd = arr[mid];

            if(midd==key){
                return true;
            }
            if(key>midd){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {-2,0,1,3,6,7,9};
        int n = arr.length;
        // int key = sc.nextInt();
        int key = 7;

        
        if(bina(arr, n, key)){
            System.out.println(0);
        }else{
            System.out.println(-1);
        }
        System.out.println(arr.length);


    }
}
