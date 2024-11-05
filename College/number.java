import java.util.Scanner;

public class number {
    public static void main(String an[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a /= 10;
        System.out.println(a%10);
    }
}
