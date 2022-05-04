public class linear {
    public static void main(String[] args){
        int arr [] ={7,4,8,5,7,9,3,52,8};
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi = arr[i];
            }
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        System.out.println(maxi);
        System.out.println(mini);

    }
}
