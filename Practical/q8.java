import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the Shape : ");
        System.out.println("1. Circle : \n2. Triangle : \n3. Rectangle : ");
        int shape = sc.nextInt();
        if( shape == 1 ){
            System.out.println("You Selected Circle : ");
            System.out.println("Enter Radius :");
            int r = sc.nextInt();
            System.out.println("Area of Circle is : " + ((r * r)+"Pi"));
            System.out.println("Area of Circle is : " + ((3.14) * (r * r)));
        }else if( shape == 2){
            System.out.println("You Selected Traingle : ");
            System.out.println("Enter Base :");
            int b = sc.nextInt();
            System.out.println("Enter Height :");
            int h = sc.nextInt();
            System.out.println("Area of Traingle is : " + ( (b * h)/2 ));
        }else if( shape == 3){
            System.out.println("You Selected Rectangle : ");
            System.out.println("Enter Width :");
            int w = sc.nextInt();
            System.out.println("Enter Length :");
            int l = sc.nextInt();
            System.out.println("Area of Rectangle is : " + (w * l));
        }else {
            System.out.println("Please Choose Correct Option form {1,2,3} ");
        }
        sc.close();
    }
}
