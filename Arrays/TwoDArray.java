
import java.util.*;
public class TwoDArray {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Row: ");
        int rows=sc.nextInt();
        System.out.print("Enter Colunmn: ");
        int cols=sc.nextInt();
        int [][] numbers=new int[rows][cols]; 


        //Input 
        //outer loop
        for(int i =0;i<rows; i++){  //rows
            //inner loop
            for(int j=0;j<cols;j++){  //cols
                System.out.println("Enter cols: "+j);
                numbers[i][j]=sc.nextInt();
            }
            System.out.println("Row Ends");
        }

        //Answer 
        System.out.println("Answer is: ");
        //outer loop
        for(int i =0;i<rows; i++){  //rows
            //inner loop
            for(int j=0;j<cols;j++){  //cols
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Answer : ");
        System.out.println(numbers[2][3]);
    }
}
