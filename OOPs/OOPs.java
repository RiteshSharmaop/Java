// package OOPs;
class Pens{
    // properties or blue print
    String color;
    String type;  //bollpoint, gel
    int price;
    
    //Functions  or Methods 
    public void write(){
        System.out.println("Writing Somthing");
    }

    public void penInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println(this.price);
        System.out.println();
    }
    // public void printColor() {
    //     System.out.println(this.color);
    // }
    // public void printType() {
    //     System.out.println(this.type);
    // }
    // public void printPrice() {
    //     System.out.println(this.price);
    // }
}

class Student{
    String name;
    int age;
    int id;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }

    // Non-Parameterized constructor 
    // it mean jab bhi student name ka constructor bana in objects tab ye function call hui
    Student(){
        System.out.println("Constructor called! ");
    }

    // Parameterized constructor 
    Student(String name, int age,int id){
        this.name = name;
        this.age = age;
        this.id =id;
    }


}
public class OOPs {
    //Objects
    public static void main(String[] args) {
        Pens pen1 = new Pens();   // it is Special type of function and this is known as Constructor
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.price = 60;

        Pens pen2 = new Pens();
        pen2.color= "black";
        pen2.type = "ballpoint";
        pen2.price = 90;

        
        // pen1.printColor();
        // pen1.printType();
        // pen1.printPrice();
        // pen2.printColor();
        // pen2.printType();
        // pen2.printPrice();
        pen1.penInfo();
        pen2.penInfo();

        
        
        
        // Parameterized constructor 
        Student std1 = new Student("alok",16,84541);


        std1.printInfo();
        

    }
}