package com.xiaoxiaofengsi.fengfeng_backstage.dao;

import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("SELECT * FROM USER_FIRST WHERE user_id = #{id}")
    User getUserById(Integer id);

    @Select("SELECT * FROM USER_FIRST")
    public List<User> getUserList();

    @Insert("insert into USER_FIRST(user_id, username, password, remark) values(#{userId}, #{username}, #{password}, #{remark})")
    public int add(User user);

//    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
//    public int update(@Param("id") Integer id, @Param("user") User user);
//
//    @Delete("DELETE from tb_user where id = #{id} ")
//    public int delete(Integer id);
}
