package com.fightzhong.jvm.gc;

public class TestClass4 {
	public static void main (String[] args) throws InterruptedException {
		int size = 1024 * 1024;
		byte[] arr1 = new byte[2 * size];

		Thread.sleep( 1000000 );
	}
}
