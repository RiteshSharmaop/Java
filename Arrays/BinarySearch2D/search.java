public class search {
    public static int binarysearchh(int arr[][],int n, int s,int e){
        s = 0;
        e = n-1;
        return 0;
    }

    public static int printt(int arr[][], int n){
        int s = arr[0][0];
        int e = arr[0][n-1];
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return 0;
        }
        if(arr[s+1][0]>target){
            e = arr[s][n-1];
            binarysearchh(arr,n,s,e);
        }
        if(arr[mid][0]<target<arr[0+1][0]){
            e = 
        }

        int ss =arr[mid][0] ;
        int ee =arr[mid][n-1] ;

        
    }
    public static void main(String[] args){
        int arr[] [] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 5;
        arr[0][2] = 9;
        arr[1][0] = 14;
        arr[1][1] = 20;
        arr[1][2] = 23;
        arr[2][0] = 30;
        arr[2][1] = 34;
        arr[2][2] = 43;

        int n = 3;
        int target = 20;

        printt(arr, n);

    
    }
}
