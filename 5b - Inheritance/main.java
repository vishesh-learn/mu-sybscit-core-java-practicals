/*
5b. Write a java program to implement method overriding.
*/

class main{
	public static void main(String[] arg){
		textBook b = new textBook();
		
		b.material();
		b.pages();
	}
}

class Book{
	public void material(){
		System.out.println("Paper");
	}
	
	public void pages(){
		System.out.println(100);
	}
}

class textBook extends Book{
	public void pages(){
		System.out.println(200);
	}
}