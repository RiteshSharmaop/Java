import java.util.*;
public class elseif {
    public static void main(String[]argu){
        Scanner sc = new Scanner(System.in);
        //Question to check weather the the number os equal greater or lesser using else if
        System.out.print("a=");
        int a = sc.nextInt();
        System.out.print("b=");
        int b= sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        }
        
        else if (a>b){
            System.out.println("a is greater");
        }
        else {
                System.out.println("a is lesser");
        }
            
        sc.close();
        }
}
