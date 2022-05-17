public class IndexVAlue {
    public static void indexx (int arr[], int target, int n){
        int start = 0;
        int end = arr[n-1];
        
        while(start<=end){
            int mid = start +(start + end ) /2 ;
            int midd = arr[mid];
            if(target ==midd){
                System.out.println("yes");
            }
            if(target > midd){
                arr[start] = midd+1;
            }
            if(target <=midd){
                arr[end] = midd -1;
            }

        }
        System.out.println("no");
        
    }
    public static void main(String[] args){
        int arr[] = {-26,-2,0,2,3,4,6};
        int n = arr.length;
        int target= 4;




        // System.out.println(indexx(arr, target,n));
        // C:\Users\sharm\AppData\Local\Programs\Eclipse Adoptium\jdk-17.0.2.8-hotspot\
        // C:\Program Files\Common Files\Oracle\Java\javapath
        // indexx(arr, target,n);
        // System.out.println(indexx(arr, 4, 7));
        indexx(arr, 4, 7);
    }

}
