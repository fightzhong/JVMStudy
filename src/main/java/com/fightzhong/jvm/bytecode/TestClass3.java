package com.fightzhong.jvm.bytecode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

public class TestClass3 {
	public void test () throws Exception {
		try {
			InputStream is = new FileInputStream( "test.txt" );

			ServerSocket serverSocket = new ServerSocket(9999);
			serverSocket.accept();
		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		} catch (Exception ex) {

		} finally {
			System.out.println( "finally" );
		}
	}
}
