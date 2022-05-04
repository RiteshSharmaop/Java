package Pattern.PATTERN_BY_LoveBabbar;

public class HalfPyramid {
    public static void main(String[] args){
        int n= 5;
        // rows 1 to n
        for(int row =1;row<=n;row++){
            // for each row, print stars =row no
            // cols
            for(int cols = 1;cols<=row;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
