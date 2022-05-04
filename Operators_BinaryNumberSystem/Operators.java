package Operators_BinaryNumberSystem;


public class Operators {
    public static void main(String[]args){
        int a=10;
        int b=0;

        // b= a++;   
        //  post increment {
        //     1. use value
        //     2. change value
        // }
        // b= ++a;  
        // pre increment{
        //      1. change value 
        //      2. use value
        //  }

        System.out.println(a);
        System.out.println(b);

        // b= a--;   
        //  post decrement {
        //     1. use value
        //     2. change value
        // }
        // b= --a;  
        // pre decrement{
        //      1. change value 
        //      2. use value
        //  }
        System.out.println(!(a<b));
        int c = 5;
        System.out.println(c<<2);
    }
}
