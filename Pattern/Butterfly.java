// package Pattern;
public class Butterfly {
    public static void main(String argu[]){
        /*

        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * * 
        *             *

        */
        int n=4;
        for (int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces between them
            for(int j=1;j<=n-i;j++){
                System.out.print("    ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
            }
            //opposit
        for(int i =n;i>=1;i--){
            
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("    ");
            }
            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
        System.out.println();
        System.out.println("Another way to print: ");
        for (int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //spaces between them
            for(int j=1;j<=n-i;j++){
                System.out.print("    ");
            }
            //2nd part 
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }System.out.println();
        }
    }
}