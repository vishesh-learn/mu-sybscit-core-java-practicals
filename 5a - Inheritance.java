class main{
	public static void main(String[] arg){
		Table t1 = new Table();
		Table t2 = new Table();
		
		System.out.println("Table no. 1:");
		t1.material("Wood");
		t1.showData("red", 143);
		
		System.out.println("\nTable no. 1:");
		t2.material("Steel");
		t2.showData("blue", 257);
	}
}

class Furniture{
	public void material(String material){
		System.out.println("Material: "+material);
	}
}

class Table extends Furniture{
	public void showData(String color, int price){
		System.out.println("Color: "+color+"\nPrice: "+price);
	}
}