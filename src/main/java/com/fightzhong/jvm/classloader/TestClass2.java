package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass2 {
	@Test
	public void test () {
		TestClass2Parent[] arr = new TestClass2Parent[1];
		System.out.println( arr.getClass() );
		System.out.println( arr.getClass().getSuperclass() );
		System.out.println( "===========================" );
		long[] arr2 = new long[1];
		System.out.println( arr.getClass() );
		System.out.println( arr.getClass().getSuperclass() );
	}
}

class TestClass2Parent {
	public final static long b1 = 5;

	static {
		System.out.println( "Parent被初始化" );
	}
}

