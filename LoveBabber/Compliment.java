package LoveBabber;

public class Compliment {
    public static void main(String[] args){
        int num = 5;
        int mask = 0;
        while(mask <num){
            mask = (mask<<1) |1;

        }
        int ans =( ~num) &mask;
        System.out.println(ans);
    }
}
