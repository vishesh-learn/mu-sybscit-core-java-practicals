class main{
	public static void main(String[] arg){
		Bicycle b = new Bicycle();
		Car c = new Car();
		
		b.move();
		b.fuel();
		
		c.move();
		c.fuel();
	}
}

abstract class Vehicle{
	public void move(){
		System.out.println("Vehicle move");
	}
}

class Bicycle extends Vehicle{
	public void fuel(){
		System.out.println("Human power");
	}
}

class Car extends Vehicle{
	public void fuel(){
		System.out.println("Petrol");
	}
}