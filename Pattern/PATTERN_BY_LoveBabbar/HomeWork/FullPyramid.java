package Pattern.PATTERN_BY_LoveBabbar.HomeWork;
public class FullPyramid{
    public static void main(String[] args){
        int n =  6;
        for(int row=1;row<=n;row++){
            // Spaces
            for(int col= 1;col<=n-row;col++){
                System.out.print(" ");
            }
            // Star
            for(int col = 1;col<=row;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}