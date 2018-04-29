package com.xiaoxiaofengsi.fengfeng_backstage;

import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.junit4.SpringRunner;


//@ImportResource({"classpath*:/spring/spring-aop-transaction.xml"})
//@MapperScan("com.xiaoxiaofengsi.*.dao")
//@ComponentScan("com.xiaoxiaofengsi")
@RunWith(SpringRunner.class)
@SpringBootTest(classes=FengfengBackstageSerApplication.class)
public class FengfengCommonBeanApplicationTests {

	@Autowired
	private UserFirstService service;


	@Test
	public void contextLoads() {


	}
	@Test
	public void insertUserFirst() {

		User user = new User();
		user.setUserId(123);
		user.setUsername("wsh");
		user.setPassword("123456");
		user.setRemark("第一次该springboot使用数据库");
		 int result = service.insert(user);
		 System.out.println(result);
	}

}
