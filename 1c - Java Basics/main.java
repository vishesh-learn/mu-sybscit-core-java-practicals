/*
1c. Write a Java program to print the area and perimeter of a circle.
*/

import java.util.Scanner;

class main{
	public static void main(String args[]){
		Scanner Sc = new Scanner(System.in);

		final float PI = 3.14f;

		System.out.println("Circle\nRadius: ");

		float r = Sc.nextInt();

		float a = PI * r * r;

		float p = 2 * PI * r;

		System.out.println("Area: " + a);
		System.out.println("Perimeter: " + p);
	}
}