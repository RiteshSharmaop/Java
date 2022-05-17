import java.util.Scanner;

public class AvtoBus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            Long n = sc.nextLong();
            if(n%4==0 ||n%6==0){
                Long Four = n/4;
                Long Six = n/6;
                if(n<=4){
                    System.out.println(Four);
                    System.out.println(Four);
                }else if(Four<Six && n>4){
                    System.out.println(Four);
                    System.out.println(Six);
                }else{
                    System.out.println(Six);
                    System.out.println(Four);

                }

            }else{
                System.out.println(-1);
            }
            t--;
        }
    }
}