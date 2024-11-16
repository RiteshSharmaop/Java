import java.util.*;
public class String_1 {
    //in build class already there String that's why we cann't write String
    public static void main(String [] args){
        //String Declaration
        String name ="Tony";
        String fullname="Tony Stark";  //here spaces are the valid charactrs in Strings
        String sentence="My name is Tony Stark";
        String essay="hii baby.\n how are u";

        // taking string form user or store in string whatever value given by the users.
        Scanner sc =new Scanner(System.in);
        // Scanner is a class.
        // sc is object.
        // new is a keyword which is used to to define the class. new is non primitive data type in java
        //String name1=sc.next();   // sc.next is used to take single character or single word but fore multiple character or name we use sc.nextLine()
        //System.out.println("Your Name is: "+name1);
        String fullName=sc.nextLine();  //sc.nextLine is used for multiLine String
        System.out.println("Your FullName is: "+fullName);
        System.out.println("\n");

        System.out.println(name);
        name = "Ritesh";
        System.out.println(name);
        System.out.println(fullname.charAt(0));
        System.out.println();
        



    }
}
