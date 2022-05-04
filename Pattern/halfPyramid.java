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
        int k =4;
        for(int p =1;p<=k;p++){
            for(int t=1;t<=p;t++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
