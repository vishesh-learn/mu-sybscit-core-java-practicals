/*
1a. Write a Java program that takes a number as input and prints its multiplication
table upto 10.
*/

import java.util.Scanner;

class main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer: ");
		
		int n = sc.nextInt();
		
		System.out.println("\nMultiplication table upto 10: ");

		int i;
		for(i=1;i<=10;i++){
			System.out.println(n*i);
		}
	}
}