
import java.util.Scanner;
import primespackage.Prime;

public class TwinsPrime {
	public static void main(String args[]) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		sc.close();		
		System.out.println("Twin prime numbers: ");
		for(i = n1; i <= n2; i++) {
			if(Prime.checkPrime(i) & Prime.checkPrime(i+2) & i > 1)
			{
				System.out.println("(" + i + "," + (i+2) + ")");
			}
		}
	}
}

