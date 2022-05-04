import java.util.*;


public class ifelse {
    public static void main(String[]argu){
        Scanner sc = new Scanner(System.in);
        // Question to check weather the he is adult or under age
        System.out.print("Age: ");
        int ag= sc.nextInt();
        if (ag>18){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are under age");
            }

    System.out.println("\n");
        //Question to check weather the he is odd or even
        System.out.println("To cheek Weather the number is odd or eve");
        System.out.print("Number: ");
        int numb=sc.nextInt();
        if(numb % 2 ==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
System.out.println("\n");
        //Question to check weather the the number  equal or greater or lesser
        System.out.print("a=");
        int a1 = sc.nextInt();
        System.out.print("b=");
        int b1= sc.nextInt();
        if (a1==b1){
            System.out.println("Equal");
        }
        else{   // insted of writing lots of if else or nested if else we use else if
            if (a1>b1){
                System.out.println("a is greater");
                        }
            else {
                System.out.println("a is lesser");
                }
            }
        }


        

        //ok
        System.out.println("Next number: ");
        int v = sc.nextInt();
        if( v <=10){
        System.out.println("kid");
        System.out.println("sjn");
        }
        else{
            if ((v>10)&&(v<=20)){
            System.out.println("Teen");}
            else if((v>20)&&(v<=40)){
                System.out.println("adult");
            }
        else{
            System.out.println("40+");
        }

    }
    sc.close();
}
}