/*
2c. Write a Java program to reverse a string.
*/

class main{
	public static void main(String[] arg){
		String str = "text", strr = "";
		int i, a = str.length() - 1;
		
		for(i=a; i>=0; i--)
			strr += str.charAt(i);
		
		System.out.println("String: "+str+"\nReversed string: "+strr);
	}
}