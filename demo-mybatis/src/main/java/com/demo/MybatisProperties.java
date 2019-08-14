package com.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 	当前类定义自研框架的配置属性, 这些属性可以在引入了jar包
 * 	的项目中的yml/properties 文件中覆盖配置
 * @author Administrator
 */
@ConfigurationProperties(prefix = "com.demo.mybatis")
public class MybatisProperties {
	/**
	 * yml文件覆盖方式:
	 * com:
	 * 	demo:
	 * 		mybatis:
	 * 			hello: ReHello 
	 * 			world: ReWorld
	 */
	private String hello = "hello";
	private String world = "world";
	public String getHello() {
		return hello;
	}
	public void setHello(String hello) {
		this.hello = hello;
	}
	public String getWorld() {
		return world;
	}
	public void setWorld(String world) {
		this.world = world;
	}
}
