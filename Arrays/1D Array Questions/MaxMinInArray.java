// package ARRAYS.MaxMinInArray;
import java.util.*;
public class MaxMinInArray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];

        //taking input array
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
                
            }
            if(arr[i]>min){
                min=arr[i];
            }
        }
        

        System.out.println("Max"+ max);
        System.out.println("Min"+ min);
    }
}
