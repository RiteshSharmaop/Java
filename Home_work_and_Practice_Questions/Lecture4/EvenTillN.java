package Lecture4;
// package Home_work_and_Practice_Questions.Lecture4;
import java.util.*;
public class EvenTillN{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        for(int i=0;i<=n;i=i+2){
            if(i%2==0){
                s=s+i;
            }
        }
        System.out.println(s);
    }
}
