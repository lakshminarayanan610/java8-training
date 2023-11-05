package com.sample;

class Hi implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Hi");
			try { Thread.sleep(500); } catch(Exception e) {}
			}
		}
}

class Hello implements Runnable {
	
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Hello");
			try { Thread.sleep(500); } catch(Exception e) {}
			}
		}
}

public class ThreadSample {

	public static void main(String[] args) {
		
		new Thread(() -> {
			for (int i=0; i<5; i++) {
			System.out.println("Hi");
		try { Thread.sleep(500);
		} catch(Exception e) {}
		}
		}
		).start();
		new Thread(() -> {
			for (int i=0; i<5; i++) {
			System.out.println("Hello");
		try { Thread.sleep(500); 
		} catch(Exception e) {}
		}
		}).start();		

	}

}
