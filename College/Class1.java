import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num&1){
            case 0:
                System.out.println("Even");
                break;
            default:
                System.out.println("odd");
        }
    }
}