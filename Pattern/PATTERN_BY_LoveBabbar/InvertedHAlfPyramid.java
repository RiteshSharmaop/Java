package Pattern.PATTERN_BY_LoveBabbar;

public class InvertedHAlfPyramid {
    public static void main(String[] args){
        int n =4;
        // for(int row =1;row<=n;row++){
        //     // for each row, print n starts or 
        //     // cols
        //     for(int cols = 1;cols<=n-row+1;cols++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        for(int row =n;;row--){
            System.out.println("*");
        }
    }
}
