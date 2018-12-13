//Finding Prime Number From M to N

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int m,n,count=0;
		System.out.println("Please enter initial number: ");
		m = userInput.nextInt();
		
		System.out.println("Please enter final number: ");
		n = userInput.nextInt();
		
		for (int i=m; i<=n; i++) {
			for (int j=2; j<=i-1; j++) {
				if (i%j==0) {
					count++;
					break;
				}
				
			}
			
			if (count==0) {
				System.out.println(i);
			}
			count = 0;
		}
		

	}

}
