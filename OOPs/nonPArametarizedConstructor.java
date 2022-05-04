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
    
}  

public class nonPArametarizedConstructor {
    public static void main(String[] args){
        
        Student std1 = new Student();
        // Non-Parameterized constructor 
        std1.name= "Ritesh";
        std1.age=18;
        std1.id=48484848; 
        std1.printInfo();
        
    }
    
    
}