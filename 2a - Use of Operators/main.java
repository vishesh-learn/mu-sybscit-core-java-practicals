/*
2a. Write a Java program to add two binary numbers.
*/

class main{
	public static void main(String[] args){
		String a = "10", b = "1";
		
		int n1 = Integer.parseInt(a, 2);
		
		int n2 = Integer.parseInt(b, 2);
		
		int sum = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + Integer.toBinaryString(sum));
	}
}
