package Pattern.PATTERN_BY_LoveBabbar.HomeWork;

public class InvertedFullPyramid {
    public static void main(String[] args){
        int n = 6;
        for(int row=1;row<=n;row++){
            // Spaces
            for(int cols = 1;cols<=row-1;cols++){
                System.out.print(" ");
            }
            // Star
            for(int cols=1;cols<=n-row+1;cols++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
