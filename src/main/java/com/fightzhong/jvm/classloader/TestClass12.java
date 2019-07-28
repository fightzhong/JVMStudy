package com.fightzhong.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class TestClass12 {
	@Deprecated
	public static void main (String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		MyClassLoader2 loader = new MyClassLoader2( "loader1", ClassLoader.getSystemClassLoader() );
		loader.setPrefix( "C:\\Users\\zhongshenglong\\Desktop\\" );
		Class<?> cls = loader.loadClass( "com.fightzhong.jvm.classloader.TS1" );
		System.out.println( cls.getClassLoader() );

		cls.newInstance();
	}
}