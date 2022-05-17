// package Sorting

public class SelectionSort {
    public static void PrintArray(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr [] = {7,8,3,1,2};
        // Selection Sort
        // Time Complexity O(n^2)
        for(int i = 0 ; i<arr.length-1;i++){
            int smallest = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){  //Ascending
                // if(arr[smallest] < arr[j]){  Decending 
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        PrintArray(arr);
    }
}
