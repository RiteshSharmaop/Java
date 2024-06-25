public class college {
    public static void main(String args[]){
        Human Arun = new Human();
        // Arun.getGender("Male");
        Arun.bg("O+");
        System.out.println(Arun.Gender);
        System.out.println(Arun.BG);
        System.out.println(Arun.legs);
        Arun.walk();
        System.out.println(Arun.avgHeight(5));

        

    }
}

class Human{
    // Data menbers

    int legs; // 4 byte
    int eyes;
    String Gender = "Male";
    String BG;

    // constructor
    // Human(int a){
    //     System.out.println("Contructor Called");
    //     System.out.println("you Value is " + a);
    // }

    // Data Methods
    void getGender(String gen){
        Gender = gen;
    }
    void bg(String  Blood){
        BG = Blood;
    }
    void walk(){
        System.out.println("4 Legs");
    }
    int avgHeight(int h){
        return h;
    }
    int avgHeight(int h , int w ){
        return h+w;
    }
    int avgHeight(int h , int w ,int k){
        return h+w+k;
    }
}

// class Boys extends Human  {
//     void walk(){
//         System.out.println("2 Legs");
//     }
    
// }
// class Girls extends Human  {
//     void walk(){
//         System.out.println("2 Legs");
//     }
// }


