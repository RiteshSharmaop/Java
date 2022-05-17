
public class maxMin {
    public static void main(String[] args){
        int arr[] = {7,4,5,2,8,9};
        int maxi = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(maxi);
    }
}
