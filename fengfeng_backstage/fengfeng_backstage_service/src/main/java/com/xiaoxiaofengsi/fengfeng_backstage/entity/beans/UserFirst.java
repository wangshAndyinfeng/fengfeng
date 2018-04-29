package com.xiaoxiaofengsi.fengfeng_backstage.entity.beans;


import java.io.Serializable;

/**
 * @ClassName: UserFirst
* @Description: user_first表对应的java bean类
* @author:
 */
public class UserFirst implements Serializable {
    /**
     * @Fields serialVersionUID : 自动生成默认序列化ID
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields user_first.user_id :
     */
    private Integer userId;

    /**
     * @Fields user_first.username :
     */
    private String username;

    /**
     * @Fields user_first.password :
     */
    private String password;

    /**
     * @Fields user_first.remark :
     */
    private String remark;

    /**
     * @return user_first.user_id : 返回 
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId of user_first : 设置 
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return user_first.username : 返回 
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username of user_first : 设置 
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return user_first.password : 返回 
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password of user_first : 设置 
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return user_first.remark : 返回 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark of user_first : 设置 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}