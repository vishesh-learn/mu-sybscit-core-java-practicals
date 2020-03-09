class ThreadDemo extends Thread {

  public void run() {
	System.out.println("Thread is running !!");
  }
	
  public static void main(String[] args){
	ThreadDemo t1 = new ThreadDemo();
	ThreadDemo t2 = new ThreadDemo();
	
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