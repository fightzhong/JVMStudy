package com.fightzhong.jvm.bytecode.dynamicproxy;

public interface IDao {
	/**
	 * 查询数据库中人的个数
	 * @return
	 */
	int findPersonNumber();

	/**
	 * 根据性别查询人的个数
	 * @return
	 */
	int findPersonBySex(String sex);
}
