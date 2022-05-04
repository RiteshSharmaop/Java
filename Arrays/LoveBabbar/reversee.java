public class reversee {
    public static void main(String[] args){
        int arr[] = {7,5,1,2,4,8};
        

        int i  = 0;
        int j = arr.length-1;
        while(i<=j){
            arr[i] = arr[i]^arr[j];
            arr[j] = arr[i]^arr[j];
            arr[i] = arr[i]^arr[j];
            i++;
            j--;
        }

        for(i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
