
class Adder{  
    int add(int a,int b){
        return a+b;
    }  
    int add(int a,int b,int c){
        return a+b+c;
    }  
}  
class q10 {
    public static void main(String[] args){ 
        Adder first = new Adder(); 
        int TwoParameter = first.add(12,1);  
        int ThreeParameter = first.add(11,45,23);  
        System.out.println(TwoParameter);    
        System.out.println(ThreeParameter);    
    
    }
}
