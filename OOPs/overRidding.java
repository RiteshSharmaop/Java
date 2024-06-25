class a{
    void abs(){
        System.out.println("hello students");
    }
    
}
class b extends a{
    // overrid
    super.abs();
    void abs(){
        System.out.println("hello world");
    }
}
class c extends b{
    void abs(){
        System.out.println("hello sv");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        a first = new a();
        b sec = new b();
        c third = new c();
        first.abs();
        sec.abs();
        third.abs();
    }
}