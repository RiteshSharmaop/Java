public class MoveNegativeArray {
    public static void main(String[] args){
        int arr[] = {3,-1,2,-4,-6,-4,5};
        
        for(int i =0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i]<0){
                    arr[i]= arr[i]^arr[j];
                    arr[j]= arr[i]^arr[j];
                    arr[i]= arr[i]^arr[j];
                }
                
            }
        }
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
