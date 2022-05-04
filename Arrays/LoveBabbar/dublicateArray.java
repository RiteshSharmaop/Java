public class dublicateArray {
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4};
        // for(int i =0 ;i<arr.length;i++){
        //     for(int j = 0; i<arr.length;j++){
        //         if(arr[i]==arr[j]){
        //             System.out.println(arr[j]);
        //         }
        //     }
        // }
        int i =0;
        int j =arr.length;
        while(i!=j){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
            }
            i++;
            j--;
        }

    }
}
