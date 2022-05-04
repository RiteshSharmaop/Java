import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class functionInString {
    public static void main(String []args){
        //Concatination
        String FirstName="Ritesh";
        String LastName="Sharma";
        String FullName=FirstName+" " +LastName;
        System.out.println(FullName);
        String ok=FirstName.concat(" "+LastName);
        System.out.println(ok);

        //Length
        System.out.println(FullName.length());

        //charAt
        for(int i=0;i<FullName.length();i++){  // by using lenth function we take length of the name or fullname
            System.out.println(FullName.charAt(i));
        }

        //compare Two strings
        String name1 ="Tony";
        String name2 ="Tony";
        
        /**
        * compareTo() check 3 cases before printing
        * case1:  string1>string2  return +ve  value
        * case2:  string1==string2  return 0  
        * case3:  string1<string2    return -ve value
        */

        //question 1
        // if (name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are Not Equal");
        // }


        //Question 2
        // if (name1==name2){
        //     System.out.println("Strings are equal");
        // }else{
        //     System.out.println("Strings are Not Equal");
        // }

        //in most of the case == in not satisfied so we use compare function insted of == 
        //basicaly on competitive codind == fails in test cases

        //question 3
        if (new String("Tony") == new String("Tony")){   // making own string [non primitive datatype]  and but here it is not a string it is an object            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are Not Equal");
        }

        

        //hellow < wello
        //hello is smaller then wello
        //hello is smaller because it is smaller then wello or because h come first then w
        //here we compare first character of the word like h,w



        //Sub String
System.out.println("Sub Strings");
        String addd="hii my name in Tomy";
        // substring(beg index , end index)
        String name=addd.substring(15,18);  // in breckets we add starting index and ending index
        String namee=addd.substring(15,addd.length());
        String nameee=addd.substring(15,19);
        String namme=addd.substring(0,4);
        String aaa=addd.substring(15);  //if we don't give ending index then it give automaticlly
        System.out.println(name);
        System.out.println(namee);
        System.out.println(nameee);
        System.out.println(namme);
        System.out.println(aaa);


        //Strings are immutable
        // inmutable means if we created a string one time then we cannot change the string,and cannot delet and cannot add and cannot modify
        //if we want to modify then we have to make new string
        String aaaa="ok";
        System.out.println(aaaa);
        aaaa="hii";
        System.out.println(aaaa);
        System.out.println(aaaa);



    }
}
