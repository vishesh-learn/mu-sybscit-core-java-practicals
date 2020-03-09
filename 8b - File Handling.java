import java.io.*;

class main{
	public static void main(String[] arg)throws Exception{
		FileInputStream fis = new FileInputStream("My name in binary.txt");
		FileOutputStream fos = new FileOutputStream("text.txt");
		
		int i;
		while((i = fis.read()) != -1)
			fos.write((char)i);
		
		fis.close();
		fos.close();
		
		System.out.println("Content copied successfully");
	}
}