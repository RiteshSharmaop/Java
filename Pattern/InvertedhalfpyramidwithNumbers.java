// package Pattern;
public class InvertedhalfpyramidwithNumbers {
    public static void main(String[]argu){
        int n=5;
        //outer loop
        for(int i =1;i<=n;i++){
            //innner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
                }
            System.out.println();
        }
    }
}

