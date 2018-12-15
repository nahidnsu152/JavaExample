//Convert user input decimal number to binary,octal or hexadecimal.

import java.util.Scanner;

public class NumberConversion {
	
	int decimal;
	Scanner userInput = new Scanner(System.in);
	void toBinary() {
		System.out.println("Please enter your Decimal Number: ");
		decimal = userInput.nextInt();
		String binary = Integer.toBinaryString(decimal);
		System.out.println(decimal+ " binary number is = "+binary);
	}
	
	void toOctal() {
		System.out.println("Please enter your Decimal Number: ");
		decimal = userInput.nextInt();
		String octal = Integer.toOctalString(decimal);
		System.out.println(decimal+ " Octal number is = "+octal);
	}
	
	void toHexa() {
		System.out.println("Please enter your Decimal Number: ");
		decimal = userInput.nextInt();
		String Hexadecimal = Integer.toHexString(decimal);
		System.out.println(decimal+ " Hexadecimal number is = "+Hexadecimal);
	}

	public static void main(String[] args) {
		NumberConversion obj = new NumberConversion();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("1. Decimal to Binary\n2. Decimal to Octal\n3. Decimal to Hexadecimal\n\n");
		System.out.println("Please enter a value to convert: ");
		int choice = userInput.nextInt();
		
		
		if(choice == 1 ) {
			obj.toBinary();
		}
		else if (choice == 2) {
			obj.toOctal();
		}
		
		else if( choice == 3) {
			obj.toHexa();
		}
		
		else {
			System.out.println("Wrong Input, Please run the programe again and enter a value between 1-3");
		}
	}
}
