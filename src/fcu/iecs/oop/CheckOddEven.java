package fcu.iecs.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a inter : ");
		int num = keyboard.nextInt();
		
		if(num % 2 == 0){
			System.out.println("The input integer is Even Number.");			
		}
		else{
			System.out.println("The input integer is Odd Number.");
		}
		
	}

}
