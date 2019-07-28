package com.fightzhong.jvm.classloader;

public class TS2 {
	public TS2 () {
		System.out.println( "创建TS2的实例: " + this.getClass().getClassLoader() );
	}
}
