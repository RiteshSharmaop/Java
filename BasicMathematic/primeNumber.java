import java.util.*;
public class primeNumber {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String ans = "YES";
            for(int i = 2 ; i < num ; ++i){
                if(num%i == 0){
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
}
