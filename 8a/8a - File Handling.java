/*
8a. Write a java program to open a file and display the contents in the console
window.
*/

import java.io.*;

class main{
	public static void main(String[] arg)throws Exception{
		FileReader fr = new FileReader("My name in binary.txt");
		
		int i;
		while((i = fr.read()) != -1)
			System.out.print((char)i);
	}
}