package com.thread;

public class Test2 extends Thread{

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public synchronized void run() {
		test();
	}
	
	public static synchronized void test(){
		System.out.println("test....");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		
		t1.start();
		t2.start();
	}
	
	
}
