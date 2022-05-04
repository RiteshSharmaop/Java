import java.util.*;

public class variables_input_practice {
    public static void main(String[] argu){
        Scanner op= new Scanner(System.in);
        System.out.print("Type First Number: ");
        int a = op.nextInt();
        System.out.print("Type Second Number:");
        int b = op.nextInt();
        int sum1 = a+b;
        System.out.println("sum: "+sum1);
        System.out.println("Mission Passed respect+");

        op.close();
    }

}