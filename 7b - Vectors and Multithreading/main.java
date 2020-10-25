/*
7b. Write a java program to implement thread life cycle.
*/

class main extends Thread {

  public void run() {
	System.out.println("Thread is running !!");
  }
	
  public static void main(String[] args){
	main t1 = new main();
	main t2 = new main();
	
	System.out.println("T1 ==> " + t1.getState());
	System.out.println("T2 ==> " + t2.getState());
		
	t1.start();
	System.out.println("T1 ==> " + t1.getState());
	System.out.println("T2 ==> " + t2.getState());

	t2.start();
	System.out.println("T1 ==> " + t1.getState());
	System.out.println("T2 ==> " + t2.getState());
    }
}