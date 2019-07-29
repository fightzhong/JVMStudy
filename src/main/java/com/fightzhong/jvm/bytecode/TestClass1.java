package com.fightzhong.jvm.bytecode;

public final class TestClass1 {
	public double price = 100.0;

	private String name = "zhangsan";
	private final int age = 111;

	static {
		System.out.println( "hehe" );
	}
	
	{
		System.out.println( "haha" );
	}
	
	public void sayAge () {
		System.out.println( age );
	}

	public String getName () {
		return name;
	}

	public static void main (String[] args) {

	}
}
