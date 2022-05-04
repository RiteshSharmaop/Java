package Pattern.PATTERN_BY_LoveBabbar;

public class pattern5 {
public static void main(String[] arts){
    int n = 4;
    for(int row =1;row<=n;row++){
        // for each row, print n starts or 
        // cols
        // Spaces
        for(int cols = 1;cols<=row-1;cols++){
            System.out.print(" ");
        }
        // Star
        for(int cols = 1;cols<=n-row+1;cols++){
            System.out.print("*");
        }
        System.out.println();
    }}
}
