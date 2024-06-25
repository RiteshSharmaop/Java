
public class inverseHalfPyramid {
    public static void main(String[]argu){
        //Inverse Half Pyramid (rotated by 180deg)
        /*
        ****
        ***
        **
        *
        */
        
        int n = 5;
        System.out.println("Inverse Half Pyramid : ");
        System.out.println();
        for(int i = n ; i >= 1 ; i--){ //  i=i-1
            for(int j=1 ; j <= i ; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}

