package Array;
import java.util.*;
public class Question3 {
    public static void main(String[]args){
        int n=10;
        int m=10;
        
        String arr[][]=new String[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]="-";
            }
            System.out.println();
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]);
            }
        }
        
    }
}
