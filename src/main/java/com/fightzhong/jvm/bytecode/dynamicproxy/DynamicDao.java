package com.fightzhong.jvm.bytecode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicDao implements InvocationHandler {
	private Object target;
	public DynamicDao (Object target) {
		this.target = target;
	}

	@Override
	public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println( "打印日志开始..." );
		Object result = method.invoke( target, args );
		System.out.println( "打印日志结束..." );
		return result;
	}
}
