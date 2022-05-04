package Pattern.PATTERN_BY_LoveBabbar;

public class Pattern6 {
    public static void main(String[] args){
        int n = 5;
        for(int row =1;row<=n;row++){
            // for each row, print n starts or 
            // cols
            // Spaces
            for(int cols = 1;cols<=n-row;cols++){
                System.out.print(" ");
            }
            for(int j = 1; j<=row;j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
    }
}
