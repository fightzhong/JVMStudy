package com.fightzhong.jvm.gc;

public class TestClass6 {
	public static void main (String[] args) throws InterruptedException {
		byte[] arr1 = new byte[1024 * 1024];

		test();
		System.out.println(" 第1次垃圾回收1111111111111111 ");

		test();
		System.out.println(" 第2次垃圾回收2222222222222222 ");

		test();
		System.out.println(" 第3次垃圾回收333333333333333 ");

		test();
		System.out.println(" 第4次垃圾回收444444444444444 ");

		byte[] arr3 = new byte[1024 * 1024];
		byte[] arr4 = new byte[1024 * 1024];
		byte[] arr5 = new byte[1024 * 1024];


		test();
		System.out.println(" 第5次垃圾回收5555555555555555 ");


		test();
		System.out.println(" 第6次垃圾回收6666666666666666 ");

	}

	public static void test () {
		for ( int i = 0; i < 40; i ++ ) {
			byte[] arr = new byte[1024 * 1024];
		}
	}
}
