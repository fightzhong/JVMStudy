package com.fightzhong.jvm.memory;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class TestClass4 {
	public static void main (String[] args) throws Exception {
		ArrayList<Class> classlist = new ArrayList<>();
		while ( true ) {
			TestClass4Loader loader = new TestClass4Loader( ClassLoader.getSystemClassLoader().getParent() );
			loader.setAddress( "C:/Users/zhongshenglong/Desktop/Notes/JVMStudy/target/classes/" );
			Class<?> c = loader.loadClass( "com.fightzhong.jvm.memory.TestClass4_" );
			classlist.add( c );
		}
	}
}

class TestClass4Loader extends ClassLoader {
	private String pre = "";
	private String sub = ".class";

	public TestClass4Loader (ClassLoader parent) {
		super( parent );
	}

	public void setAddress (String abstractAddress) {
		this.pre = abstractAddress;
	}

	@Override
	protected Class<?> findClass (String name) throws ClassNotFoundException {
		byte[] data = loadClassData( name );
		return defineClass( name, data, 0, data.length );
	}

	private byte[] loadClassData (String name) {
		try {
			String className = name.replace( ".", "/" );
			className = pre + className + sub;

			FileInputStream fis = new FileInputStream( className );
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			byte[] data = new byte[10];
			int len = 0;
			while ( ( len = fis.read( data ) ) != -1 ) {
				baos.write( data, 0, len );
			}

			byte[] byteArr = baos.toByteArray();

			return byteArr;
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}
}

class TestClass4_ {
}