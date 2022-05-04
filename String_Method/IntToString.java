public class IntToString {
    public static void main(String[]args){
        //toString
        int num=123;
        String  numbers =Integer.toString(num);
        System.out.println(numbers);

        //num is int but numbers is String.
        System.out.println(num+6);

        //numbers is String
        System.out.println(numbers+6);   //Concatination
        
    }
}
