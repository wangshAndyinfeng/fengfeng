package com.xiaoxiaofengsi.fengfeng_backstage.dao;

import com.xiaoxiaofengsi.fengfeng_backstage.waientity.Message;
import com.xiaoxiaofengsi.fengfeng_backstage.waientity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageMapper {

//    @Select("SELECT * FROM USER_FIRST WHERE user_id = #{id}")
//    User getUserById(Integer id);
//
//    @Select("SELECT * FROM USER_FIRST")
//    public List<User> getUserList();

    @Insert("insert into MESSAGE_INFO(budget) values(#{budgetValue})")
    public int add(Message message);

//    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
//    public int update(@Param("id") Integer id, @Param("user") User user);
//
//    @Delete("DELETE from tb_user where id = #{id} ")
//    public int delete(Integer id);
}
