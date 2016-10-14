package fcu.iecs.oop;

import java.util.Scanner;

public class StringComparator{

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int num = 1;
		
		while(num==1)
		{
			System.out.println("Enter a string1 : ");
			String string1 = keyboard.next();
			System.out.println("Enter a string2 : ");
			String string2 = keyboard.next();

			if(string1.equalsIgnoreCase(string2)){
				System.out.println("The two strings are the same.");
				break;
			}
			else{
				System.out.println("The two strings are not the same.");
			}
		}
		
		
		
		
		keyboard.close();
	}
}