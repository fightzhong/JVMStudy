package com.fightzhong.jvm.bytecode;

public class TestClass2 {
	String str = "Welcome";

	private int x = 5;

	public static Integer in = 10;
	
	public TestClass2 () {}
	
	public TestClass2 (int a) {
		System.out.println( a );
	}
	
	public static void main (String[] args) {
		TestClass2 testClass2 = new TestClass2();

		testClass2.setX(8);

		in = 20;
	}

	public synchronized void setX (int x) {
		this.x = x;
	}
	
	private void test (String str) {
		synchronized (str) {
			System.out.println( "hello, world" );
		}
	}
	
	static {
		System.out.println( "hello, world" );
	}
}
