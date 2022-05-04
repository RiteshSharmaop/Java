package Pattern.PATTERN_BY_LoveBabbar;

public class Square {
    public static void main(String[] args){
        int n = 4;
        // rows
        for(int row =1;row<=n;row++){
            // for each row, print n starts or 
            // cols
            for(int cols = 1;cols<=n;cols++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
