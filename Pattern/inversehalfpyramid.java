// package Pattern;
public class inversehalfpyramid {
    public static void main(String[]argu){
        //Inverse Half Pyramid (rotated by 180deg)
        /*
        ****
        ***
        **
        *
        */
        
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
