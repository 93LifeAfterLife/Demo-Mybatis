package com.demo;

import javax.annotation.Resource;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 定义启动类
 * @author Administrator
 */
@Configuration
@EnableConfigurationProperties(MybatisProperties.class)
public class MybatisAutoConfiguration {
	static {
		System.out.println("Self-innovate framework demo-mybatis start!");
	}
	
	@Resource
	MybatisProperties mybatisProperties;
	
	/**
	 * 创建sqlSessionFactory对象, 放在spring容器中
	 * @return
	 */
	@Bean
	public SqlSessionFactory init() {
		System.out.println("init hello =" + mybatisProperties.getHello());
		return new SqlSessionFactory();
	}
}
