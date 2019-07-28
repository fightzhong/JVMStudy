package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass7 {
	@Test
	public void test () throws ClassNotFoundException {
		// 通过Class对象来加载String类
		Class<?> stringClass = Class.forName("java.lang.String");
		System.out.println( stringClass.getClassLoader() );

		// 通过Class对象来加载自己写的类
		Class<?> t7Class = Class.forName( "com.fightzhong.jvm.classloader.T7" );
		System.out.println( t7Class.getClassLoader() );
		
		// 通过Class对象来加载ClassLoader
		Class<?> classLoaderClass = Class.forName( "java.lang.ClassLoader" );
		System.out.println( classLoaderClass.getClassLoader() );
	}
}

class T7 {

}