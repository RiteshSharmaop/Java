public class SwapAlternate {
    public static void main(String[] args){
        int arr[] ={2,7,5,6,9,8,1,6,2};

        // for(int i=0;i<arr.length-1;i=i+2){
        for(int i=0;i<arr.length;i=i+2){
            if(i<arr.length-1){
                arr[i] = arr[i]^arr[i+1];
                arr[i+1] = arr[i]^arr[i+1];
                arr[i] = arr[i]^arr[i+1];
        }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
