public class FunctionArray {
    public static void array(int arr[],int size){
        for(int i =0; i<size;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){
        int arr[] = {7,4,8,5,4,6};

        array(arr,2);
    }
}
