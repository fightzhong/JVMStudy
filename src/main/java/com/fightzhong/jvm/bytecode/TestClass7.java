package com.fightzhong.jvm.bytecode;

public class TestClass7 {
	public static void main (String[] args) {
	    new Suber().invoke();
	}
}

class Super {
	public void test () {
		System.out.println( "super" );
	}
	
	public void invoke () {
		test();
	}
}

class Suber extends Super {
	public void test () {
		System.out.println( "suber" );
	}
}