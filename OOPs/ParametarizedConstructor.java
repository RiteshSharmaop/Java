
    

class Student{
    String name;
    int age;
    int id;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.id);
    }
    
    // Parameterized constructor 
    Student(String name, int age,int id){
        this.name = name;
        this.age = age;
        this.id =id;
    }


}



public class ParametarizedConstructor {
        //Objects
        public static void main(String[] args) {
            
            // Parameterized constructor 

            Student s1 = new Student("Ritesh", 18, 20013);
    
            s1.printInfo();
            
    
        }

    
}
