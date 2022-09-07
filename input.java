import java.util.*;
public class input {
    public static void main(String[] argu){
        //input
        Scanner sc = new Scanner(System.in);
       // String name = sc.next();   //.next is only print one topken or input given in first  (token means ever character  such as name)
        String name = sc.nextLine();  //.next line is used to take output for whole line or all token
        int age = sc.nextInt();        //nextInt  for int
        float cgpa = sc.nextFloat();        //nextFloat for float
        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        sc.close();
    
    }
}
