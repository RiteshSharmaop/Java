// package Home_work_and_Practice_Questions;

import java.util.*;
public class googleDayOne {
    public static void main(String argu[]){
        Scanner op= new Scanner(System.in);
        System.out.println("#1");
        int n=op.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        System.out.println(sum);

        //2
        System.out.println("#2");
        for(int i=1;i<=10;i++){
            System.out.print(i+",");
        }
System.out.println("\n");
        //3
        System.out.println("#3");
        n=10;
        int summ=0;
        for(int i=1;i<=n;i++){
            summ = summ+i;
        }
        System.out.println(summ);

        System.out.println("#4");
        int table=op.nextInt();
        int nn=10;
        for(int i=1;i<=n;i++){
            //System.out.println(table*i);
            int multi =table*i;
            System.out.println(table+"*" +i+"="+multi);
        }

        System.out.println("#5");
        System.out.println(nn);
        op.close();
        }
}
