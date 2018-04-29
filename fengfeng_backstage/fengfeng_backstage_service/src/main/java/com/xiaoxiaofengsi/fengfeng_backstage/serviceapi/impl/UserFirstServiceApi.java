package com.xiaoxiaofengsi.fengfeng_backstage.serviceapi.impl;

import com.xiaoxiaofengsi.fengfeng_backstage.service.UserFirstService;
import com.xiaoxiaofengsi.fengfeng_backstage.serviceapi.IUserFirstServiceApi;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userfirstservice")
public class UserFirstServiceApi implements IUserFirstServiceApi {

    Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserFirstService userFirstService;

    @Override
    public int insert(User user){

        log.debug("----进入insert()---"+user.toString());
        int result = userFirstService.insert(user);
        log.debug("----出来insert()---"+result);
        return result;
    };
}
