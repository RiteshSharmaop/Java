public class Strings{
    public static void main(String[]args){
        String name = "Ritesh" ;
        String name1 = "itesh" ;
    
        System.out.println("Length : "+name.length()); //to chack length
        
        //printing characters of a variables 
        System.out.println("Character of a variables");
        for (int i =0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
        

        //comparing string by using compateTo function
        System.out.println("Compare Value");
        String ok ="Hii";
        String okk="Hii";

        // it check 3condition before printing 
        // Sreing1 > String2    --> Positive value
        // Sreing1 = String2    --> zero
        // Sreing1 < String2    --> Negative value
        System.out.println(ok.compareTo(okk));

        //by using c0ompare to function
        System.out.println("By Using CompareTo: ");
        if(ok.compareTo(okk)==0){
            System.out.println("Strings are Equal");
        }else {System.out.println("Strings are not equsl");}
        
        //by using equal to operator
        System.out.println("By Using Equal to: ");
        if(ok==okk){
            System.out.println("Strings are Equal");
        }else {System.out.println("Strings are not equsl");}

        //it give same answer 
        // but in competitive coding where we have to satisfied more than 3 or 4 test cases it give error

        System.out.println("By using Equal to: ");
        if(new String("Hii")==new String("Hii")){
            System.out.println("Strings are Equal");
        }else {System.out.println("Strings are not equal");}

        // we compare strings y there size number like 3 or 4
        // a<b<c<d<e



        //sub strings
        System.out.println("Sub String");
        String sentence= "my name is ritesh";
        // substring it take bigning inidex and ending index in
        // name.substring(bigning index and ending index);
        String namee=sentence.substring(11);
        String namewe=sentence.substring(11,sentence.length());
        String nameee=sentence.substring(8,10);
        System.out.println(sentence.substring(0,6)); // it print mt nam
        System.out.println(namee);
        System.out.println(namewe);
        System.out.println(nameee);
        


        //Question:  String to int
        String a= "652";
        System.out.println(a+58);
        // changing string to int 

        int ab=Integer.parseInt(a);
        System.out.println(ab+8);


        //Strings are immutable





    }
}