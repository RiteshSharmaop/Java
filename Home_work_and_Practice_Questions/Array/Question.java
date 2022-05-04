package Array;
import java.util.*;
public class Question {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum =0;
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum=arr[i]+sum;
        }
    
        System.out.println(sum);
    }
}


// by using function

// import java.util.*;
// public class Question {
//     public static int add(int arr[],int size,int sum){
        
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//             sum=arr[i]+sum;
//         }
//         return sum;

//     }
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int size=sc.nextInt();
//         int arr[]=new int[size];
        
//         int sum =0;
//         for(int i=0;i<arr.length;i++){
//             arr[i]=sc.nextInt();
            
//         }
        
        

//         System.out.println(add(arr, size, sum));
//     }
// }
