package com.xiaoxiaofengsi.fengfeng_backstage;

import com.xiaoxiaofengsi.fengfeng_backstage.redisDao.RedisDao;
import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.Message;
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
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;


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

    @Autowired
    private StringRedisTemplate template;
	@Test
	public void testRedis(){
//		redisDao.setKey("name","forezp");
//		redisDao.setKey("age","11");
////		String s = redisDao.getValue1("use1","name");
//		logger.info("---------"+redisDao.getValue1("user1","name"));
//		logger.info("---------"+redisDao.getValue("name"));
//		logger.info("---------"+redisDao.getValue("age"));
        Map map = new HashMap();
        map.put("myheart","12345");
        template.convertAndSend("PUSH_MESSAGE", map.toString());
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

	@Test
	public void insertMessag(){
		Message message = new Message();
		message.setBudgetValue("汪思获傻屌");
		int result = service.insertMessage(message);
		System.out.println(result);
	}

}
