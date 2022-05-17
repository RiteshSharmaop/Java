public class VAl_Ind {
    public static int valIndindex(int arr[], int n){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            int midd = arr[mid];
            if(midd == mid){
                // System.out.println("yes");
                return mid;
            }
            if(midd<mid){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        // System.out.println("no");
        return -1;

    }
    public static int valInd(int arr[], int n){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<=e){
            int midd = arr[mid];
            if(midd == mid){
                // System.out.println("yes");
                return 0;
            }
            if(midd<mid){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        // System.out.println("no");
        return -1;

    }
    public static void main(String[] args){
        int arr[] = {-22,-16,0,1,2,5,7};
        int n = 7;

        if(valInd(arr, n)==0){
            System.out.println("yes");
        }else{
            System.out.println("NO");
        }

        System.out.println  (valIndindex(arr, n));
        
    }
}
