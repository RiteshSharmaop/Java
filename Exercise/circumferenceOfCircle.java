package Exercise;
import java.util.*;

public class circumferenceOfCircle {
    public static double circumference(double r){
        double circ=2*3.14*r;
        return circ;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double r=sc.nextInt();

        System.out.println(circumference(r));

    }
}
