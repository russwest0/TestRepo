package com.thread;

public class MyThreadLocal {
	private ThreadLocal<Integer> threadLocal=new ThreadLocal<Integer>(){
		public Integer initialValue(){
			return 0;
		}
	};
	
	public int getNext(){
		threadLocal.set(threadLocal.get()+1);
		return threadLocal.get();
	}
	
	public static void main(String[] args){
		MyThreadLocal thread_local=new MyThreadLocal();
		Thread t1=new Thread(thread_local.new MyThread(thread_local));
		Thread t2=new Thread(thread_local.new MyThread(thread_local));
		Thread t3=new Thread(thread_local.new MyThread(thread_local));
		
		t1.start();
		t2.start();
		t3.start();
		
	}
	
	//ÄÚ²¿Àà
	private class MyThread implements Runnable{

		private MyThreadLocal thread;
		
		public MyThread(MyThreadLocal thread){
			this.thread=thread;
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i =0 ;i<3;i++){
				System.out.println("Thread"+Thread.currentThread().getName()+"-"+thread.getNext());
			}
		}
		
	}
	
	

}
