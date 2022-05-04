package Pattern.PATTERN_BY_LoveBabbar.HomeWork;

public class Butterfly {
    public static void main(String[] args){
        int n = 5;
        for(int row =1;row<=n;row++){
            // Upper
            for(int cols = 1; cols<=row;cols++){
                System.out.print("*");
            }
            for(int cols=1;cols<=(n-row)*2;cols++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<=row;cols++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int row=1;row<=n;row++){
            // Lower
            for(int cols=1;cols<=n-row+1;cols++){
                System.out.print("*");
            }

            for(int cols =1;cols<=row-1;cols++){
                System.out.print("-");
            }
            System.out.println();

        }
    }
}
