
import java.util.*;
public class s02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Interest");
        System.out.println();
        System.out.println("Enter Principal (P) : ");
        int p = sc.nextInt();
        System.out.println("Enter Time (T) : ");
        int t = sc.nextInt();
        System.out.println("Enter Rate (R) : ");
        int r = sc.nextInt();
        int sit = (p*r*t)/100;
        System.out.print("Answer : ");
        System.out.println(sit);
        sc.close();
    }
}
