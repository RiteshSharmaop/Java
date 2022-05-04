public class variables {
    public static void main(String[] args) {
        //variables
        String name = ("Ritesh");
        String lastname =(" Sharma");
        int a =25;
        int b = 10;  //we cal also type same datatype variable in same line
        int sum = a+b;
        int diff = a-b;
        int mult=a*b;  
        String fullname= name+ lastname;
        double price = 18.18;
        System.out.println(name + lastname);
        System.out.println(fullname);
        System.out.println(price);
        System.out.println(a +  b);
    
        System.out.println(sum);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(a * b);
        System.out.println(mult);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("\n");
        a=20;
        b=30; 
        lastname="op";
        System.out.println( name + lastname);
        System.out.println(a +  b);
        System.out.println('\n');

        // Quiz
        int a1=10;
        int b1=5;
        int calculate= (a1*b1)/(a1-b1);
        System.out.println("Calculate: "+calculate);
        //correct 

        int x1=23 ,y=65,z=54,ok=63;
        System.out.println(x1);  //print int
        //System.out.println(y,z);  // it give an error because we didn't print(two or more then two value in same line)
    
        int $=65;  // we can also contain values in special characters like $ and _
        String _1="ritesh";    // by using backslash we have to add some digits or letters or word

        System.out.println($+_1+y+z+ok);
        //TypeCasting
        //type casting basikly two type
        //*Widening Casting
        int _ok=68;
        float  afloat=_ok;
        System.out.println(afloat);

        /*
        float pp=65.35f;
        int pp2=pp;
        System.out.println(pp2);      //it throw an error becaues in widing casting we cannot convert float or double to int or other
        */

        //Narawing Casting
        double kp =6.952d;
        int kp2=(int)kp;
        System.out.println(kp);
        System.out.println(kp2);


        float og=65.36f;
        int og2=(int)og;
        System.out.println(og);
        System.out.println(og2);




    }
}
