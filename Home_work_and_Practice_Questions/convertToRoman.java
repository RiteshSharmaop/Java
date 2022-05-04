// package Home_work_and_Practice_Questions;

import java.util.*;
public class convertToRoman {

        public static void main(String[] argu) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Roman Converter");
                    int n =sc.nextInt();
                    switch(n){
                        case 1:System.out.println("I");
                        break;
                        case 5:System.out.println("V");
                        break;
                        case 10:System.out.println("X");
                        break;
                        case 50:System.out.println("L");
                        break;
                        case 100:System.out.println("C");
                        break;
                        case 500:System.out.println("D");
                        break;
                        case 1000:System.out.println("M");
                        break;
                        default:System.out.println("Inavalid number!!");
                    }
                    sc.close();
    
}
}
