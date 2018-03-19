package com.ck.java8.misc;

public class ThreadCreation7vs8 {

	public static void main(String[] args) {
		Thread classicThreadCreation=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Classic Thread creation...!!!");
			}
		});
		Thread lambdaThreadCreation=new Thread(()->System.out.println("Lambda Thread creation...!!!"));
		
		classicThreadCreation.start();
		lambdaThreadCreation.start();
	}
}
