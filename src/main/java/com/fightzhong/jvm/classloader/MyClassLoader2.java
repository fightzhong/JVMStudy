package com.fightzhong.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class MyClassLoader2 extends ClassLoader {

	private String loaderName;
	private String prefix = "";
	private String subfix = ".class";

	public MyClassLoader2 (String loaderName, ClassLoader parent) {
		super(parent);
		this.loaderName = loaderName;
	}

	public MyClassLoader2 (ClassLoader parent){
		super(parent);
	}

	public MyClassLoader2 (String loaderName) {
		this.loaderName = loaderName;
	}

	public void setPrefix (String prefix) {
		this.prefix = prefix;
	}

	public String getLoaderName () {
		return loaderName;
	}

	@Override
	protected Class<?> findClass (String name) {
		byte[] classData = loadClassData( name );
		return defineClass( name, classData, 0, classData.length );
	}

	private byte[] loadClassData (String name) {
		name = fixTheClassName( name );
		FileInputStream fileInputStream = null;
		ByteArrayOutputStream baos = null;
		byte[] classData = null;

		try {
			fileInputStream =  new FileInputStream( name );
			baos = new ByteArrayOutputStream();
			int len;
			while ( ( len = fileInputStream.read() ) != -1 ) {
				baos.write( len );
			}

			classData = baos.toByteArray();
		} catch ( Exception ex ) {
			ex.printStackTrace();
		}

		return classData;
	}

	private String fixTheClassName (String name) {
		name = name.replace( ".", "/" );
		return prefix + name + subfix;
	}
}
