package String_Builders;



public class StringByuilding{
    public static void main(String[] args) {    
        StringBuilder sb = new StringBuilder("ritesh");
        System.out.println(sb);

        //printing index
        System.out.println(sb.charAt(0));
        
         //by using loop we print characters
        for (int i =0;i<sb.length();i++){
            System.out.println(sb.charAt(i));
        }

        // changing character or set character at index
        // name.setCharAt(index, character);
        // StringBuilder sb = new StringBuilder("ritesh");
        sb.setCharAt(2, 'T');   // index start with 0
        System.out.println(sb);
        sb.setCharAt(0, 'R' );
        System.out.println(sb);

        //inserting character  (insert)
        sb.insert(0, "s");
        // sb.insert(0, "ritesh");
        System.out.println(sb);

        //inserting charagter between name or value
        sb.insert(4,"e");
        System.out.println(sb);  // inserting s  between value


        //deleting character between value
        //sb.delete (indes to start , index to end (non exclusive))
        sb.delete(4,5);
        sb.delete(0,1);
        System.out.println(sb);



        // append 
        sb.append("s");
        // sb.append("sisijisj");
        System.out.println(sb);

        StringBuilder ss= new StringBuilder("h");
        ss.append('e');  //str = str+e
        ss.append('l');  //str = str+l
        ss.append('l');  //str = str+l
        ss.append('o');  //str = str+o 
        
        System.out.println(ss);
        System.out.println(ss.length());
        
        
        //Question
        StringBuilder s= new StringBuilder("hello");
        for (int i=0;i<s.length()/2;i++){
            int front=i;
            int back=s.length() - 1 - i; //5-1-i
    
            char frontChar= s.charAt(front);

            // System.out.println("op: "+frontChar);
            char backChar= s.charAt(back);

            s.setCharAt(front, backChar);
            s.setCharAt(back, frontChar);
        }
        System.out.println(s);




     StringBuilder ko = new StringBuilder("tony");
     //Insert char
     ko.insert(0, 'S');
     System.out.println(ko);


        

        
        





    }

}