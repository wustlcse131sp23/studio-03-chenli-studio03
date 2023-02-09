package studio3;
import java.util.Scanner;
public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Find primes up to what??");
		int max = in.nextInt();
		boolean isPrime = true;
		int numPrimes = 0;
		for (int i = 3; i<=max; i++) {
			isPrime = true;
			
			//Determine if it's prime
			for (int j = 2; j<i; j++) {
				int k = i;
				while (k>0) {
					k = k-j;
				}
				if (k==0){
					isPrime = false;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
				numPrimes++;
			}
			
		}
		System.out.println();
		System.out.println(numPrimes + " primes");
	}
}
