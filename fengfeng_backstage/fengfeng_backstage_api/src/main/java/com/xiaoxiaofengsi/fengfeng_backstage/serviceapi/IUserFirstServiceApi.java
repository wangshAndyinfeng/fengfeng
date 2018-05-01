package com.xiaoxiaofengsi.fengfeng_backstage.serviceapi;

import com.xiaoxiaofengsi.fengfeng_backstage.waientity.Message;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;

public interface IUserFirstServiceApi {

    int insert(User user);
    int insertMessage(Message message);
}
