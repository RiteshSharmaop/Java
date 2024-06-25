
class Bike{
    int avg;
    int modelNo;
    String Brand;
    Bike( int modelNo,int avg , String Brand){
        System.out.println("Bike Constructor Called!");
        this.modelNo = modelNo;
        this.avg = avg;
        this.Brand = Brand;
    }
    void constructorDone(){
        System.out.println("Constructor Created!!!");
    }
}
class q9 {
    public static void main(String[] args ){
        Bike hayabusa = new Bike(5,56,"Hero");
        hayabusa.constructorDone();
    }
}
