import java.util.Scanner;

public class Linear2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] [] = new int[3][3];
        // arr[3][3] = {1,2,3,4,5,6,7,8,9};

        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.err.println();
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                if(13==arr[i][j]){
                    System.out.println("yes");
                }
            }
        }
        System.out.println("no");
    }
}
