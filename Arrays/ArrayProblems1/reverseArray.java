public class reverseArray {
    public static void main(String[] ars){
        int arr[] = {9,8,7,4,5,6,2,1};

        
        for(int i= 0;i<arr.length;i++){
            for(int j = arr.length-1;j<0;j--){
                arr[i] = arr[i]^arr[j];
                arr[i] = arr[i]^arr[j];
                arr[j] = arr[i]^arr[j];
            }
        }
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]);
        }


    }
}
