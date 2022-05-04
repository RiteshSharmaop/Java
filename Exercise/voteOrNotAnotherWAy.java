package Exercise;
import java.util.*;
public class voteOrNotAnotherWAy {
    public static int agee(int age){
        if(age>18){
            System.out.println("True You can vote");
        }else{System.out.println("False you can't");}
        return age;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        System.out.println(agee(age));
    }
}
