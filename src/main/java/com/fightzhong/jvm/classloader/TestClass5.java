package com.fightzhong.jvm.classloader;

import org.junit.Test;

public class TestClass5 {
	@Test
	public void test () {
		System.out.println( T5Parent.thread );
	}
}

interface T5Parent {
	public static final Thread thread = new ThreadChild();
}

class T5Child implements T5Parent {
	public static int a = 1;

	static {
		System.out.println( "T5Child被初始化" );
	}
}

class ThreadChild extends Thread {
	{
		System.out.println( "ThreadChild 被创建实例" );
	}
	@Override
	public void run () {
	}
}


