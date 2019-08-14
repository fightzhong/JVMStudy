package com.fightzhong.jvm.gc;

import java.io.IOException;

public class TestClass8 {
	public static void main (String[] args) throws InterruptedException {
		int size = 1024 * 1024;
		byte[] arr1 = new byte[4 * size];
		System.out.println( "1111111111111" );

		byte[] arr2 = new byte[4 * size];
		System.out.println( "2222222222222" );

		byte[] arr3 = new byte[4 * size];
		System.out.println( "3333333333333" );

		byte[] arr4 = new byte[2 * size];
		System.out.println( "4444444444444" );

	}
}
