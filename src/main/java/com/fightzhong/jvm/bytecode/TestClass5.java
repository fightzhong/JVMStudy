package com.fightzhong.jvm.bytecode;

public class TestClass5 {

	public void test (Father f) {
		System.out.println( "father..." );
	}
	
	public void test (Son s) {
		System.out.println( "son..." );
	}

	public void test (Daughter d) {
		System.out.println( "daugher..." );
	}

	public static void main (String[] args) {
		Father son = new Son();
		Father dau = new Daughter();

		new TestClass5().test( son );
		new TestClass5().test( dau );
	}
}

class Father {

}

class Son extends Father {

}

class Daughter extends Father {

}