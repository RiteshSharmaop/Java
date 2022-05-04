import java.util.Scanner;

public class ArraySum {
    public static int sum(int arr[], int n){
        int sum = 0;
        for(int i = 0; i<n; i++){
            sum = arr[i]+sum;
        }
        return sum;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int arr[] = new int[size];
        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr, 5));
    }
}
