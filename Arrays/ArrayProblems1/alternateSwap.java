public class alternateSwap{
    public static void main(String[] args){
        int arr[] = {2,4,5,7,9,5};
        int i =0;
        while(i<arr.length){
            if(i<arr.length){
                arr[i]=arr[i]^arr[i+1];
                arr[i+1]=arr[i]^arr[i+1];
                arr[i]=arr[i]^arr[i+1];
            }
            i=i+2;
        }
        for(int j = 0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}