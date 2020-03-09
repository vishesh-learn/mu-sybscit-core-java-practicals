import java.util.*;
import java.io.*;

class main{
	public static void main(String[] arg)throws Exception{
		String name;
		int rollno;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = s.nextLine();
		
		System.out.print("Rollno: ");
		rollno = s.nextInt();
		
		FileWriter fw = new FileWriter("Student.txt");
		
		fw.write("Name: "+name+"\r\nRollno: "+rollno);
		
		fw.close();
	}
}