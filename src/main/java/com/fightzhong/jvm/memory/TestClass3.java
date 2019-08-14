package com.fightzhong.jvm.memory;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClass3 {
	public static void main (String[] args) {
		Thread t1 = new Thread( new MyThread(), "Thread-Top" );
		Thread t2 = new Thread( new MyThread(), "Thread-Bottom" );

		t1.start();
		t2.start();
		System.out.println(  );

	}
}

class MyThread implements Runnable {
	public static ArrayList obj1 = new ArrayList();
	public static HashMap obj2 = new HashMap();
	public static boolean flag = true;

	@Override
	public void run () {
		while ( true ) {
			if ( flag ) {
				synchronized (obj1) {
					System.out.println( "A..................." );
					flag = false;
					try {
						Thread.sleep( 1000 );
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized ( obj2 ) {
						System.out.println( "B..................." );
					}
				}
			} else {
				synchronized ( obj2 ) {
					try {
						Thread.sleep( 1000 );
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println( "B..................." );
					synchronized ( obj1 ) {
						System.out.println( "A..................." );
					}
				}
			}
		}
		
	}
}
