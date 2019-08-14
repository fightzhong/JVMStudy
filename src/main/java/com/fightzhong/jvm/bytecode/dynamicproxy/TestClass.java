package com.fightzhong.jvm.bytecode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestClass {
	public static void main (String[] args) {
		IDao dao = new DaoImpl();
		System.getProperties().put(  "sun.misc.ProxyGenerator.saveGeneratedFiles", "true"  );

		IDao proxyDao = (IDao) Proxy.newProxyInstance(dao.getClass().getClassLoader(), dao.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println( "打印日志开始..." );
				Object result = method.invoke( dao, args );
				System.out.println( "打印日志结束..." );
				return result;
			}
		});

		System.out.println( proxyDao.getClass() );
		System.out.println( proxyDao.findPersonBySex( "男" ) );;

	}
}
