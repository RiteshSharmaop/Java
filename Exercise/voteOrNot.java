package Exercise;
import java.util.*;
public class voteOrNot {
    public static void agee(int age){
        if(age>18){
            System.out.println("True You can vote");
        }else{System.out.println("False you can't");}
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        agee(age);
    }
}
