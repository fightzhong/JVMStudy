package com.fightzhong.jvm.memory;

public class TestClass2 {
	public static int count = 0;
	public void test () throws InterruptedException {
		count++;
		Thread.currentThread().sleep(300 );
		test();
	}
	public static void main (String[] args) {
		try {
			new TestClass2().test();
		} catch (Throwable ex) {
			System.out.println( count );
			ex.printStackTrace();
		}
	}
}
