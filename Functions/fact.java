import java.util.Scanner;

public class fact {
    public static void faCtor(int n){
        int fac= 1;
        if(n<0){
            System.out.println("Invalid Number!");
            return;
        }
        for(int i =1; i<=n;i++){
            fac = fac*i;
        }
        System.out.println(fac);
        return;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        faCtor(n);
    }
}
