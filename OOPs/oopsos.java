public class a
{
    void abc()
   {
     System.out.println("hello students");
   }
}

class secondclass extends a
{
    public void abc()
   {
    super.abc();
     System.out.println("hello world");
   }
}
class thirdclass extends secondclass
{
    public void abc()
   {
     
     System.out.println("hello sv");
   }
}
class finalclass      
{   
public static void main(String args[])
   {
    a cse = new a();
    secondclass x = new secondclass();
     cse.abc();  
     x.abc(); 
     }
}