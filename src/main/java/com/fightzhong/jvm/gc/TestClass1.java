package com.fightzhong.jvm.gc;

public class TestClass1 {
	public static void main (String[] args) {
		int size = 1024 * 1024;
		byte[] arr1 = new byte[2 * size];
		byte[] arr2 = new byte[3 * size];
		byte[] arr3 = new byte[3 * size];
	}
}
