package OOPs;

class Pen{
    // properties or blue print
    String color;
    String type;  //bollpoint, gel
    
    //Functions  or Methods
    public void write(){
        System.out.println("Writing Somthing");
    }
}

public class ClassAndObjects {
    //Objects
    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write(); //write function calls

    }
}
