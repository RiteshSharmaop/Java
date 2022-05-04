package Bit_Manipulation;
import java.util.*;

public class updateBit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n =5;
        int pos=1;

        int bitMarks = 1<<pos;
        
        if (operation==1){
            int newNumber = bitMarks | n;
            System.out.println(newNumber);
        } else {
        // }else if (operation==0){
            int notMarks= ~bitMarks;
            int newnum= notMarks & n;
            System.out.println(newnum);
        }

        sc.close();
        
    }

}
