package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass8 {
	@Test
	public void test () {
		System.out.println( TestClass8P.a );
	}
}

class TestClass8P {
	public static final int a = (int)( Math.random() * 3 );
	
	static {
		System.out.println( "TestClass8P static block" );
	}
}
