package day14_Thread;


class MyThreadClass extends Thread{ // Thread is class in Java
	
	@Override
	public void run(){
		System.out.println("thread is running..");
	}
	
}


public class ThreadExample01 {

	public static void main(String[] args) {

		MyThreadClass refMyThreadClass = new MyThreadClass();
		Thread t1 = new Thread(refMyThreadClass);
		t1.start();
		//t1.start(); exception
		
		Thread t2 = new Thread(refMyThreadClass);
		t2.start();
		
		Thread t3 = new Thread(refMyThreadClass);
		t3.start();
		
		
		// if you want to call a thread more than 1 time, IllegalThreadStateException will appears
		
		// multi- threading is concurrent. 
	}

}
