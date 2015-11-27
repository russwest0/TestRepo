package com.thread;

public class MySynchronized {
	//static MySynchronized obj = new MySynchronized();
	public static Object obj=new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public synchronized void run() {
				// TODO Auto-generated method stub
				int count = 10;
				while (count > 0) {
					synchronized (obj) {
						System.out.println("A....");
						count--;
						obj.notify();
						try {
							// Thread.currentThread().sleep(500);
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public synchronized void run() {
				// TODO Auto-generated method stub
				int count = 10;
				while (count > 0) {
					synchronized (obj) {
						System.out.println("B....");
						count--;
						obj.notify();
						try {
							// Thread.currentThread().sleep(500);
							obj.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}

		});

		t1.start();
		t2.start();
	}
}
