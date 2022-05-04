public class maxmin {
    public static void max(int arr[],int size){
        int maxi= Integer.MIN_VALUE;
        for(int i =0;i<size;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
    }
    public static void min(int arr[],int size){
        int mini= Integer.MAX_VALUE;
        for(int i =0;i<size;i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        System.out.println(mini);
    }
    public static void main(String[] aegs){
        int arr[] = {7,48,58,96,85,4,5};

        max(arr,7);
        min(arr, 7);
    }
}
