package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass3 {
	@Test
	public void test () {
		System.out.println( TestClass3P.a );
		TestClass3P.a++;
		System.out.println( TestClass3P.a );
	}
}


class TestClass3P {
	public static int a;
}
