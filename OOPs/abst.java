import java.util.*;
    abstract class abst{
    abstract void run();
}
    class car extends abst{
    void run(){
        System.out.println("Car");
    }
   
}
class runn{
     public static void main(String args[])
    {
        abst obj = new car();
        // bike obj2 = new bike();
        obj.run();
        // obj2.start();

    }
}
