
public class halfAlphaPyramid {
    public static void main(String[]argu){
        /* Alphabet Half Pyramid
        A
        BB
        CCC
        DDDD
        EEEEE
        */
        int n = 5;
        char a[] = {'1' , 'A' , 'B' , 'C' , 'D' ,'E'};
        for ( int i = 0 ; i < n ; ++i ){
            for( int j = 0 ; j <= i ; ++j ){
                System.out.print(a[i+1]);
            }System.out.print('\n');
        }
    }
}
