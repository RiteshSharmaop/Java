import java.util.*;
public class compare {
    public static void main(String[] args){
        //compare
        String name1 = "Tony";
        String name2 = "Tony";
        // it check 3 cases
        /*
         * s1>s2 --> it return positive value (anyting such as : 1,24,85,41,2,9,etc)
         * s1=s2 --> it return zero (0)
         * s1<s2 --> it return negative value (anything such as: -14,-51, -1, -5, -54, -515)
         */
        // if ((new String("A")) < (new String("a"))){
        //     System.out.println();
        // }

        System.out.println(name1.compareTo(name2));

        //COMPARING BY USIN FUNCTION (.comparTo)
        if(name1.compareTo(name2)==0) {
            System.out.println("String are equal");
        }else{
            System.out.println("strings are not equal");}


        if(name1 ==name2) {
            System.out.println("String are equal");
        }else{
            System.out.println("strings are not equal");}

        // both give same answer but in competitive conding or in tournament were we have to satisfide more than 3 or 4 test cases it fail many times
        // equalto equalto (==) fail in most of the cases
        // but .compareTo will be Acurate


        //here ans in not equal
        if(new String ("Tony") == new String ("Tony")){
            System.out.println("String are equal");
        }else{
            System.out.println("strings are not equal");}

        //in java strings are objects
        

    }
}
