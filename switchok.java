import java.util.*;
public class switchok {
    public static void main(String[] argus) {
        Scanner sc = new Scanner(System.in);
        //to print greeting 1=Hello, 2=Nameste, 3=Bonjour
        System.out.print("Enter Number: ");
        int button= sc.nextInt();

        //if (button==1){
        //    System.out.println("Hello");
        //}else if (button==2){
        //    System.out.println("Nameste");
        //} else if (button==3){
        //    System.out.println("Bonjour");
        //}
        //else{
        //    System.out.println("Invalid Button");
        //}


        // Insted of writeing lots of codes we use Switch
        switch (button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Nameste");
            break;
            case 3 :  System.out.println("Bonjoun");
            break;
            default: System.out.println("Invalid Button");
        
        }
        sc.close();
    }

    
}


