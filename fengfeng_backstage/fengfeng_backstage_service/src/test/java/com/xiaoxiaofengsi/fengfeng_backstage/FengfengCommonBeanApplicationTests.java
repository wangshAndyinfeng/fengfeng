package com.xiaoxiaofengsi.fengfeng_backstage;

import com.xiaoxiaofengsi.fengfeng_backstage.redisDao.RedisDao;
import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

	public static Logger logger= LoggerFactory.getLogger(FengfengCommonBeanApplicationTests.class);
	@Autowired
	private UserFirstService service;


	@Autowired
	RedisDao redisDao;
	@Test
	public void testRedis(){
		redisDao.setKey("name","forezp");
		redisDao.setKey("age","11");
		logger.info(redisDao.getValue("name"));
		logger.info(redisDao.getValue("age"));
	}

	@Test
	public void contextLoads() {


	}
	@Test
	public void insertUserFirst() {

		User user = new User();
		user.setUserId(66123);
		user.setUsername("wsh");
		user.setPassword("123456");
		user.setRemark("第一次该springboot使用数据库");
		 int result = service.insert(user);
		 System.out.println(result);
	}

}
