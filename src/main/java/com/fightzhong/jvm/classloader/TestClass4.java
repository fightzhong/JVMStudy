package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass4 {
	@Test
	public void test () {
		Singleton.getInstance();
		System.out.println( Singleton.a );
		System.out.println( Singleton.b );
	}
}

class Singleton {
	private static Singleton instance = new Singleton();
	public static int a = 0;
	public static int b;

	private Singleton () {
		a++;
		b++;
	}

	public static Singleton getInstance () {
		return instance;
	}
}




