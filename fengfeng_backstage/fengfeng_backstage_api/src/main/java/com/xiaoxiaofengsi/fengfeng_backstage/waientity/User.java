package com.xiaoxiaofengsi.fengfeng_backstage.waientity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public User(){

    }

    public User(Integer userId, String username, String password, String remark) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.remark = remark;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
