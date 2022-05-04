public class NotDoneUnionArray {
    public static void main(String[] args){
        int arr1[] = {2,3,5,7};
        int arr2[] = {3,4,5,6,7};
        int ans = 0 ;
        for(int i = 0; i<arr1.length;){
            for(int j = 0; j<arr2.length;){
                if(arr1[i]==arr1[i-1]){
                    arr1[i]=arr1[i]^arr1[i-1];
                }else if(arr1[i]<arr2[j]){
                    ans = arr1[i];
                    i++;
                }else if(arr1[i]==arr2[j]){
                    ans = arr1[i];
                    i++;
                    j++;

                }else{
                    ans = arr2[j];
                    j++;
                }
            }
        }
        for(int i =0;i<=arr1.length;i++){
            System.out.println(ans);
        }
    }
}
