//Fibonacci numbers from 0 to n 
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
		
		System.out.println("How many number do you want to see in febonacci series? ");
		int n = userInput.nextInt();
		int first_number = 0;
		int second_number = 1;
		int fibonacci;
		System.out.print(first_number+" "+second_number+" ");
		for (int i=3; i<=n; i++) {
			fibonacci= first_number+second_number;
			System.out.print(fibonacci+" ");
			first_number = second_number;
			second_number = fibonacci;	
		}
		

	}

}
