import java.util.Scanner;
public class ColumnSum {

    // Not Done
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] [] = new int[3][3];
        int col1 =0;
        int col2 =0;
        int col3 =0;

        // arr[3][3] = {1,2,3,4,5,6,7,8,9};

        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                col1 = arr[i][0]+arr[i][0];
            }
        }
        System.out.println(col1);
        
    }

}
