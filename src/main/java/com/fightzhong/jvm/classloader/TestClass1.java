package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass1 {
	@Test
	public void test1 () {
		System.out.println( Child.str );
	}

	@Test
	public void test2 () {
		System.out.println( Child.a );
	}

	@Test
	public void test3 () {
		Child.test();
	}
}


class Parent {
	public static String str = "parent";
	public static int a = 1;

	static {
		System.out.println( "父类被初始化" );
	}
	
	public static void test () {
		System.out.println( "父类test执行" );
	}
}

class Child extends Parent {
	public static int a = 2;

	static {
		System.out.println( "子类被初始化" );
	}
	
	public static void test () {
		System.out.println( "子类test执行" );
	}
}

