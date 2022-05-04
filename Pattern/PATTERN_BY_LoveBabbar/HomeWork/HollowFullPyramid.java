package Pattern.PATTERN_BY_LoveBabbar.HomeWork;

public class HollowFullPyramid {
    public static void main(String[] args){
        int n = 6;
        for(int row =1;row<=n;row++){
            for(int cols=1;cols<=n-row;cols++){
                System.out.print(" ");
            }
            if(row==1||row==n){
                for(int cols =1;cols<=row;cols++){
                    System.out.print("*"+ " ");
                    // System.out.print(" *");
                }
            }else{
                System.out.print("*");
                for(int cols =1;cols<=(row-1);cols++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
