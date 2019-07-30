package com.itheima.jdbc.demo1;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate ;
	
	
	@Test
	public void Jdbcdemo2() {
		//创建JDBC模板
		jdbcTemplate.update("insert into account values (null,?,?)", "王啦44",10000d);
		
	}

}
