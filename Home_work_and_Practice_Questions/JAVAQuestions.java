package Home_work_and_Practice_Questions;
import java.lang.ClassNotFoundException;
import java.util.*;
public class JAVAQuestions{
    public static void main(String[]argu){
        Scanner sc=new Scanner(System.in);
        //Question 1
        double a=4.5;
        double b=45.0;
        float c=752.5f;
        String name="Ritesh";
        System.out.println(a+" "+b+" "+c+" "+name);
        System.out.println(a);

        //Question 2
        int A =3;
        double C =9.2;
        String str ="JAVA";
        int B= 4+ (++A);
        System.out.println("B: "+B);
        int x =(int) C;
        System.out.println("x: "+x);
        double w = ((B/A)%2+x*B);
        System.out.println("w: "+w);
        System.out.println(str);


        //Question 3
        System.out.println("Enter an Integer: ");
        int z=sc.nextInt();
        System.out.println("Enter an Character: ");
        int p= sc.next(). charAt(0);
        System.out.println("Integer is : "+z);
        System.out.println("Character is: "+p);

        sc.close();
    }
}