
import java.util.*;
public class Aarray_syntex {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        /**
         * There are two types of an array
         * 1D Array
         * 2Dayyay
         */

        
        //1D Array
        //Two types to define an array.
        //1st way
        int[] OneDArray = new int [3];
        OneDArray[0]=98;
        OneDArray [1]=99;
        OneDArray [2]=97;
        //we can also over write on array
        System.out.println(OneDArray[0]);
        OneDArray[0]=100;
        System.out.println(OneDArray[0]);

        //2nd way 
        System.out.println("2nd Way: ");
        int[] arra={89,91,95,96};
        for (int i=0;i<4;i++){
            System.out.println(arra[i]);
        }
        

        //2D Array
        //in 2D there are 2ways
        //1st Way
        int[][] aary={{1,2,3,4},{5,6,7,8}};
        for (int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.print(aary[i][j]);
            }
            System.out.println();
        }
        //2nd Way
        int[][] aray=new int [2][3];
        
        for (int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                
            }
        }

        for (int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.print(aray[i][j]);
            }
            System.out.println();
        }
    }
}
