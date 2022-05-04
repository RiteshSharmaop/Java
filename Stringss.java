package Stringss;
import java.util.*;
public class Stringss {
    public static void main(String[]argu){
        Scanner sc = new Scanner(System.in);
        String ok="Ritesh";
        System.out.println(ok.length());  // by using lenth we checke the length the value
        System.out.println(ok.toUpperCase()); //to change the string to upper case  but it updated for ont time only
        System.out.println(ok.toLowerCase());  //to change the string to upper case but it updated for ont time only
        System.out.println(ok);

        String greet ="Good Morning";
        System.out.println(greet.indexOf("Morning"));   // check index of the value

        System.out.println(ok+greet);   // by using + we can concatinate or add 

        //String hii="Don't be Frustrated" ok "Don't be Demotivated"   // it throw error
        String hii="Don't be Frustrated\" ok \"Don't be Demotivated"; //  by using \' or \" or \\ we didn;ta get error 
        System.out.println(hii);

        // \n used for new line
        // \r used for carriage Return  it remove all form front
        // \t used for Tab
        // \b used for back s spce
        // \f used for form feed
        String ol="hii \bok\r whats\n up";
        System.out.println(ol);
        sc.close();

        


    }
    
}
