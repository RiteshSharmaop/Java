// package Pattern;
public class pattern { 
    public static void main(String[] argu){

        for (int k=1;k<=4;k++){
            System.out.println("*");
        }
        // Solid Rectangle       
        for (int v=1;v<=4;v++){
            System.out.println("*"+"*"+"*"+"*"+"*");
        }
        System.out.println("Another way to print this ");
        // another concept to print Rectangle
        for (int c=1;c<=4;c++){ //row
            //inner loop
            for (int d=1;d<=5;d++){ //column
                System.out.print("*");
            }
            System.out.println();
        }

        //Hollo Rectangle
        /* 

        *****   
        *   *
        *   *
        *****

        */


        int n = 4;
        int m = 5;
        //outer loop
        for(int i=1;i<=n;i++){
            //innner loop
            for(int j=1;j<=m;j++){
                //cell ~> (i,j)
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

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

        
        //Inverted Half Pyramid
        System.out.println("Interted Half Pyramid");
        /*
        ****
        ***
        **
        *

        */
        int i1 =4;
        for(int z =i1;z>=1;z--){ //  z=z-1
            for(int y=1;y<=z;y++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Inverse Half Pyramid (rotated by 180deg)
        /*
        ****
        ***
        **
        *
        */
        
        int n1 = 4;
        for(int i2=1;i2<=n1;i2++){
            for(int q=1;q<=i2;q--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
