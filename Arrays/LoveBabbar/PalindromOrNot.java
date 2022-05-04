public class PalindromOrNot {
    public static String pali(int arr[]){
        int i =0;
        int j = arr.length-1;
        int count = 0;
        while(i<j){
            if(arr[i]==arr[j]){
                count++;
            }
            i++;
            j--;
        }
        if(count==arr.length/2){
            return "Yes";
        }else{
            return "NO";
        }
    }

    public static boolean babbar(int arr[]){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,3,2,1};
        // int arr[] = {1,2,3,3,2,1};
        
        System.out.println(pali(arr));
        System.out.println(babbar(arr));
    }
}
