// package Home_work_and_Practice_Questions;
import java.util.*;
public class questions {
    public static void main(String[]argu){
        Scanner ok = new Scanner(System.in);
        System.out.print("Name1: ");
        String a1= ok.nextLine();
        System.out.print("Age: ");
        int a= ok.nextInt();
        System.out.print("Name2: ");
        String b1= ok.nextLine();
        System.out.print("Age: ");
        int b= ok.nextInt();
        System.out.print("Name3: ");
        String c1= ok.nextLine();
        System.out.print("Age: ");
        int c= ok.nextInt();

        if ((a<b) &&(b>c)){
            System.out.println(b1+"is older");
            System.out.println(a1 +"and"+c1 +"Both are Younger");
        }
        else if((a>b) &&(a>c)){
            System.out.println(a1+"is older");
            System.out.println(b1 +"and"+c1 +"Both are Younger");
        }
    
        else if((a<c) &&(b<c)){
            System.out.println(c1+"is older");
            System.out.println(a1 +"and"+b1 +"Both are Younger");
        }
        else{
            System.out.println("A");
        }
        ok.close();
    }
}



