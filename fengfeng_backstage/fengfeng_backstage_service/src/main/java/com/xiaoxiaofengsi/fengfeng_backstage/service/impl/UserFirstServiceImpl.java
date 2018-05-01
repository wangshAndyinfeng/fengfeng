package com.xiaoxiaofengsi.fengfeng_backstage.service.impl;

import com.xiaoxiaofengsi.fengfeng_backstage.dao.MessageMapper;
import com.xiaoxiaofengsi.fengfeng_backstage.dao.UserMapper;
import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.Message;
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

    @Autowired
    private MessageMapper messageMapper;

    @Override
    public int insert(User user){

        log.debug("----进入insert()---"+user.toString());
        int result = userMapper.add(user);
        log.debug("----出来insert()---"+result);
        return result;
    }

    @Override
    public int insertMessage(Message message) {
        log.debug("----进入insert()---"+message.toString());
        int result = messageMapper.add(message);
        log.debug("----出来insert()---"+result);
        return result;
    }

    ;
}
