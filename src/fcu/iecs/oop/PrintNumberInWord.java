package fcu.iecs.oop;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a integer:");
		int num = keyboard.nextInt();
		
		
		if(1<=num && num<=9){
			if(num==1){
				System.out.println("The input integer is ¡§One¡¨.");
			}
			else if(num==2){
				System.out.println("The input integer is ¡§Two¡¨.");
			}
			else if(num==3){
				System.out.println("The input integer is ¡§Three¡¨.");
			}
			else if(num==4){
				System.out.println("The input integer is ¡§Four¡¨.");
			}
			else if(num==5){
				System.out.println("The input integer is ¡§Five¡¨.");
			}
			else if(num==6){
				System.out.println("The input integer is ¡§Six¡¨.");
			}
			else if(num==7){
				System.out.println("The input integer is ¡§Seven¡¨.");
			}
			else if(num==8){
				System.out.println("The input integer is ¡§Eight¡¨.");
			}
			else {
				System.out.println("The input integer is ¡§Nine¡¨.");
			}
			
		}
		else{
			System.out.println("The input integer is ¡§OTHER¡¨.");
		}

	}

}
