package com.company;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.company.service.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.company.dao")
public class UserTest {
 
	@Autowired
	IUserService userService;
	
	@Test
	public void test1() {
		
		System.out.println(userService.login("xll", "123").getUsername());
		
		System.out.println(userService.findlist().size());
	}
	
}
