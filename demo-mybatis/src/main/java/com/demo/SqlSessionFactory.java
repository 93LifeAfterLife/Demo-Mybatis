package com.demo;

/**
 * 自研框架的核心类, SpringBoot项目中依赖此框架jar包, 需要使用SqlSessionFactory
 * @author Administrator
 */
public class SqlSessionFactory {
	public SqlSessionFactory() {
		System.out.println("Execute SqlSessionFactory constructor");
	}
	
	public String getSqlSession() {
		return "sqlSession";
	}
}
