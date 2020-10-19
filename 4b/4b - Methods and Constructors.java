/*
4b. Designed a class that demonstrates the use of constructor and destructor.
*/

class main{
	public static void main(String[] arg){
		abc obj1 = new abc();
		abc obj2 = new abc();
		abc obj3 = new abc();
	}
}

class abc{
	static int n = 0;
	
	public abc(){
		n++;
		System.out.println("constructer called: "+n);
	}
	
	protected void finalize(){
		System.out.println("destructer called: "+n);
		n--;
	}
}