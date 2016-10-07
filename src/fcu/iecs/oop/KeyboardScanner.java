package fcu.iecs.oop;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a inter : ");
		int num1 = keyboard.nextInt();
		System.out.println("Enter a float point number : ");
		float num2 = keyboard.nextFloat();
		System.out.println("Enter a you name : ");
		String name = keyboard.next();
		
		float ans = num1*num2;
		
		//System.out.println("Hi " + name + ", the multiplication of " + num1 +" and " + num2 + " is " + ans + ".");
		//System.out.println("Hi %s,the multiplication of %d and %d is %f.",name,num1,num2,ans);
		System.out.printf("Hi %s,the multiplication of %d and %f is %8.2e.",name,num1,num2,ans);
	}

}
