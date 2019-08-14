package com.fightzhong.jvm.memory;

import java.util.ArrayList;

public class TestClass1 {
	public static void main (String[] args) {
		ArrayList<TestClass1> list = new ArrayList<>();
		while ( true ) {
			list.add( new TestClass1() );
			System.gc();
		}
	}
}
