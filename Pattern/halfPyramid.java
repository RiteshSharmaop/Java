// package Pattern;

public class halfPyramid {
    public static void main(String[]argu){
        //Half Pyramid
        System.out.println("Half Pyramid");
        /* 
        *
        **
        ***
        ****
        */
        int n =4;
        for(int i =1;i<=n;i++){
            for(int t=1;t<=i;t++){
                System.out.print("* ");
            }
            System.out.println();
        }
}
}
