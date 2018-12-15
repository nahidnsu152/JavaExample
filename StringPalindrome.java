// This code will check if user input string is palindrome or not

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter your string to check Palindrome: ");
		String s1 = new String(userInput.nextLine());
		StringBuffer sb = new StringBuffer(s1);
		String s2 = sb.reverse().toString();
		
		if (s2.equals(s1)) {
			System.out.println(s1 + " is a Palindrome String");
		}
		else {
			System.out.println(s1 + " is not a Palindrome String");
		}

	}

}
