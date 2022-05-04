package Bit_Manipulation;

public class getBit {
    public static void main(String[]args){
        int n = 5; // in decimal
        // int n = 7; // in decimal
        int pos = 2;  //posoiton in binary either 0,1
        // int pos = 4;  //posoiton in binary either 0,1
        // int pos = 3;
        int bitMask=1<<pos;

        if((bitMask & n)==0){
            System.out.println("bit was zoro '0'");
        }else{
            System.out.println("bit was one '1'");
        }
    }
}
