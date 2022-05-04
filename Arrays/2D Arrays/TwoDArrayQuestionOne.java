
import java.util.*;

public class TwoDArrayQuestionOne{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Row: ");
        int rows=sc.nextInt();
        System.out.print("Enter Cols: ");
        int cols=sc.nextInt();


        int [][] numbers=new int[rows] [cols];

        //input array value
        //rows
        for(int i=0;i<rows;i++){
            //cols
            for(int j=0;j<cols;j++){
                System.out.println("Enter Value: "+i+","+j);
                numbers [i][j]=sc.nextInt();

            }
            System.out.println("Row Ends");
        }
        System.out.print("Enter X: ");   
        int x=sc.nextInt();

        //output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("("+i+","+j+")");
            }
        }
        
    }

    }
}