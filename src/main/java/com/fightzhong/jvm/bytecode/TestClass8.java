package com.fightzhong.jvm.bytecode;

public class TestClass8 {
	public static int test () {
		int a = 4;
		int b = 5;
		int c = 6;
		int d = 7;

		int result = ( a + b ) * c / d;
		return result;
	}

	public static void main (String[] args) {
	   TestClass8.test();
	}
}
