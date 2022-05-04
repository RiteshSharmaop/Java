package Pattern.PATTERN_BY_LoveBabbar.HomeWork;

public class SolidHAlfDimond {
    public static void main(String[] args){
        int n =9;
        for(int row=1;row<=n;row++){
            if(n/2+1<=n  )
                for(int cols=1;cols<=(row/2)+1;cols++){
                    System.out.print("*");
                }
                for(int cols=n-row;1>=cols;cols++){
                    System.out.print("*");
                }
            System.out.println();
            
        }
    }
}
