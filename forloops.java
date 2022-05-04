
public class forloops {
    public static void main(String argu[]) {
        for (int counter = 0; counter < 3 ; counter= counter + 1) {//insted of counter we cane write or give any name or alphabet
            System.out.println("Ritesh Sharma");
        }
        // counter++ => counter +counter +1
        for(int i=0; i<11; i++){
            System.out.println(i);
        }

        //to print numbers in same line
        for(int i=0; i<11; i++){
            System.out.print(i+" ");
        }

        //or
        for(int i=0; i<11; i++){
            System.out.print(i);
        }


        //   Print value
        //   *
        //   **
        //   ***
        //   ****
        //   *****
        for (int v=0;v<4;v++){
            System.out.println("*");
            v++;
        }
    }
}
