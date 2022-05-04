package Bit_Manipulation.Bit_Manuplation_Striver;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();

        int mask =~(1<<i);
        System.out.println(n & mask);
        sc.close();
    }
}
