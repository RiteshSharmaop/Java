// package Home_work_and_Practice_Questions;
public class patternTask {
    public static void main(String args []){
        //solid rectangle
        int z=4;
        int y=5;
        //outer loop
        for(int i=1;i<=z;i++){
            //inner loop
            for(int j=1;j<=y;j++){
                System.out.print("*"+" ");
            }System.out.println();
        }


        System.out.println("Hollow Rectangle");
        //Hollow Rectangle
        int n=4;
        int m=5;
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=m;j++){
                if(i==1||j==1||n==i||m==j){
                    System.out.print("*");
                }else{System.out.print(" ");
                }
            }
            }System.out.println();
    }
}
