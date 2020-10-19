/*
7c. Write a java program to implement multithreading.
*/

class Multithread{ 
	public static void main(String[] args){
		for(int i=0; i<3; i++){
			MultithreadingDemo mt = new MultithreadingDemo();
			mt.start();
		}
	}
}

class MultithreadingDemo extends Thread { 
	public void run(){
		System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
	}
}
