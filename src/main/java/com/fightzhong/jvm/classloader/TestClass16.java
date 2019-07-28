package com.fightzhong.jvm.classloader;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.ServiceLoader;

public class TestClass16 {
	public static void main (String[] args) throws Exception {
		MyClassLoader2 loader = new MyClassLoader2("test");
		loader.setPrefix( "C:\\Users\\zhongshenglong\\Desktop\\" );
		Thread.currentThread().setContextClassLoader( loader );
		Class<?> cls = loader.loadClass( "com.fightzhong.jvm.classloader.TS1" );
		cls.newInstance();
		Class.forName( "com.mysql.cj.jdbc.Driver" );
	}
}