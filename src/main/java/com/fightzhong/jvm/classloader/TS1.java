package com.fightzhong.jvm.classloader;

public class TS1 {
	public TS1 () {
		try {
			System.out.println( "创建TS1的实例: " + this.getClass().getClassLoader() );
			Class.forName( "com.fightzhong.jvm.classloader.TS2", true, Thread.currentThread().getContextClassLoader() ).newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
