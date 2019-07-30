package com.itheima.jdbc.demo1;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcDemo1 {
	
	@Test
	public void demo1() {
		//�������ӳ�
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring4_day03");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		//����JDBCģ��
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("insert into account values (null,?,?)", "����",10000d);
		
	}

}
