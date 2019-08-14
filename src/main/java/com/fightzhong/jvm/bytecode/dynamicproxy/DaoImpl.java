package com.fightzhong.jvm.bytecode.dynamicproxy;

public class DaoImpl implements IDao {
	@Override
	public int findPersonNumber () {
		System.out.println( "查询数据库中人的个数" );
		return 0;
	}

	@Override
	public int findPersonBySex (String sex) {
		System.out.println( "根据性别查询数据库中人的个数" );
		return 0;
	}
}
