package com.xiaoxiaofengsi.fengfeng_backstage.service.impl;

import com.xiaoxiaofengsi.fengfeng_backstage.dao.UserMapper;
import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserFirstServiceImpl implements UserFirstService{

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insert(User user){

        log.debug("----进入insert()---"+user.toString());
        int result = userMapper.add(user);
        log.debug("----出来insert()---"+result);
        return result;
    };
}
