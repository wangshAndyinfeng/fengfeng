package com.xiaoxiaofengsi.fengfeng_backstage.redisDao;

import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {  
  
    @Autowired
    private StringRedisTemplate template;
  
    public  void setKey(String key,String value){  
        ValueOperations<String, String> ops = template.opsForValue();
         HashOperations<String, String, String> ops1 = template.opsForHash();
        String use1 = "user1";
        ops1.put(use1,"age","8");
        ops1.put(use1,"name","wangsh");

        ops.set(key,value,1, TimeUnit.MINUTES);//1分钟过期
    }  
  
    public String getValue(String key){  
        ValueOperations<String, String> ops = this.template.opsForValue();  
        return ops.get(key);  
    }

    public String getValue1(String key1,String key2){
        HashOperations<String, String, String> ops1 = this.template.opsForHash();
        return ops1.get(key1,key2);
    }
}  