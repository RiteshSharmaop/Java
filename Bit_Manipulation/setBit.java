package Bit_Manipulation;

public class setBit {
    public static void main(String[]args){
        int n = 5;
        int pos = 1;  
        int bitMask=1<<pos;
        
        int new_Number= bitMask | n;
        System.out.println(new_Number);
        
    }
}
