package com.fightzhong.jvm.bytecode;

public class TestClass6 {
	public static void main (String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();

		apple.test();
		orange.test();
	}
}

class Fruit {
	public void test () {
		System.out.println( "fruit..." );
	}
}

class Apple extends Fruit {
	@Override
	public void test () {
		System.out.println( "apple..." );
	}
}

class Orange extends Fruit {
	@Override
	public void test () {
		System.out.println( "orange..." );
	}
}