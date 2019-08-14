package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SqlSessionFactory;

@RestController
public class DemoController {
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@RequestMapping("/demo-mybatis")
	public String demo() {
		return sessionFactory.getSqlSession();
	}
}
