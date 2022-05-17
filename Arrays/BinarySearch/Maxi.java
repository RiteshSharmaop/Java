public class Maxi {
        public static void Ball(int arr[],int n){
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;
        
    
        int max = Integer.MIN_VALUE;
        while(s<=e){
            int midd =arr[mid];
            if(midd==max){
                System.out.println(max);
            }
            if(midd>max){
                max = midd;
            }else{
                continue;
            }
            mid = s+(e-s)/2;
        }
    }
    public static void main(String[] args){
        int arr[] = {-2,0,3,4,5,6,8};
        int n = 7;
        
        


        Ball(arr, n);

    }
}

