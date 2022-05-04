import java.util.*;
public class loopquestions {
    public static void main(String[]argu){
        Scanner sc= new Scanner(System.in);
        //natural number
        System.out.print("Enter Natural Number: ");
        int n =sc.nextInt();
        int sum=0;
        for(int i= 1; i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //table printer

        System.out.print("Table of a Number: ");
        int v= sc.nextInt();

        for(int a=1;a<=10;a++){
            System.out.println(v+"x"+a+"="+v*a);
        }

        sc.close();
    }
}
