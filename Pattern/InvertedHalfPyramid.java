// package Pattern;
public class InvertedHalfPyramid {
    public static void main(String[]argu){
        //Inverted Half Pyramid
        System.out.println("Interted Half Pyramid");
        /*
        ****
        ***
        **
        *

        */
        int n =4;
        for(int i =n;i>=1;i--){ //  i=i-1
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
