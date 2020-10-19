/*
5c. Write a java program to implement multiple inheritance.
*/

class main{
	public static void main(String[] arg){
		textBook b = new textBook();
		
		b.material();
		b.pages();
		System.out.println(b.read());
	}
}

interface read{
	String book = "Los Santos";
	
	String read();
}

class Book{
	public void material(){
		System.out.println("Paper");
	}
}

class textBook extends Book implements read{
	public void pages(){
		System.out.println(200);
	}
	
	public String read(){
		return "Reading book: "+book;
	}
}