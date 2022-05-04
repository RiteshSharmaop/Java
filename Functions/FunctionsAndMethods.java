
import java.util.*;
public class FunctionsAndMethods {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[]argu){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();

        //call kiya Function Ko
        printMyName(name);
    }
    
}
