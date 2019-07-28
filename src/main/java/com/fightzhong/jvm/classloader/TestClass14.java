package com.fightzhong.jvm.classloader;

public class TestClass14 {
	public static void main (String[] args) throws Exception {
		System.out.println( System.getProperty( "sun.boot.class.path" ) );
		System.out.println( System.getProperty( "java.ext.dirs" ) );
		System.out.println( System.getProperty( "java.class.path" ) );
		
		System.out.println( TestClass14.class.getClassLoader() );
		TestClass15 testClass15 = new TestClass15();
		System.out.println( testClass15.getClass().getClassLoader() );
	}
}

