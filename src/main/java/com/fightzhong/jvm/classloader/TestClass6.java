package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass6 {
	@Test
	public void test () {
		System.out.println( T6Child.thread2 );
	}
}

interface T6Parent {
	Thread thread1 = new Thread () {
		{
			System.out.println( "父类接口被实例化" );
		}
	};
}

interface T6Child extends T6Parent {
	int a = 1;
	Thread thread2 = new Thread () {
		{
			System.out.println( "子类接口被实例化" );
		}
	};
}


