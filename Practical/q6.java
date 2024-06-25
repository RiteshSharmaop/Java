import java.util.Scanner;
public class q6 {
    public static boolean isEveOrOdd(int n){
        if((n & 1) == 0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2 ; i < n ; ++i){
            if(n % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        System.out.println("What You Want To Do : ");
        System.out.println("1 : Even/Odd");
        System.out.println("2 : Prime Or Not");
        int n = sc.nextInt();
        if( n == 1 ){
            if(isEveOrOdd(a)) {
                System.out.print("Answer : ");
                System.out.println("Even");
            }else {
                System.out.print("Answer : ");
                System.out.println("Odd");
            }
        }else if( n == 2){
            if(isPrime(a)){
                System.out.print("Answer : ");
                System.out.println("Yes it's a Prime Number ");
            }else {
                System.out.print("Answer : ");
                System.out.println(" No it's Not a Prime Number");
            }
        }else {
            System.out.println("Enter Correct Number!!!");
        }
    }
}
