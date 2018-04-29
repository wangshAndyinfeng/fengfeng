package com.xiaoxiaofengsi.fengfeng_backstage.dao;


import com.xiaoxiaofengsi.fengfeng_backstage.entity.beans.UserFirst;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: UserFirstMapper
* @Description: user_first表对应的dao操作Mapper映射类
* @author: wangwc5
 */
@Repository
public interface UserFirstMapper {
//    /**
//    * @Title UserFirstMapper.countByExample
//    * @Description: 根据查询条件，计算user_first个数
//    * @param example 通用查询条件类
//    * @return int 结果个数
//     */
//    int countByExample(Criteria example);
//
//    /**
//    * @Title UserFirstMapper.deleteByExample
//    * @Description: 根据查询条件，删除user_first
//    * @param example 通用查询条件类
//    * @return int  删除个数
//     */
//    int deleteByExample(Criteria example);

    /**
    * @Title UserFirstMapper.deleteByPrimaryKey
    * @Description: 根据属性名称，删除user_first
    * @param userId userId
    * @return int  删除个数
     */
    int deleteByPrimaryKey(Integer userId);

    /**
    * @Title UserFirstMapper.insert
    * @Description: 插入一个user_first
    * @param record user_first的bean对象
    * @return int  插入个数
     */
    int insert(UserFirst record);

    /**
    * @Title UserFirstMapper.insertSelective
    * @Description: 插入一个只有部分字段的user_first
    * @param record 只含部分字段的user_first的bean对象
    * @return int  插入个数
     */
    int insertSelective(UserFirst record);

//    /**
//    * @Title UserFirstMapper.selectByExample
//    * @Description: 根据查询条件类，返回user_first结果集
//    * @param example 通用查询条件类
//    * @return List<UserFirst>user_first结果集
//     */
//    List<UserFirst> selectByExample(Criteria example);

    /**
    * @Title UserFirstMapper.selectByPrimaryKey
    * @Description: 根据主键类，返回user_first
    * @param userId userId
    * @return UserFirst bean对象
     */
    UserFirst selectByPrimaryKey(Integer userId);

//    /**
//    * @Title UserFirstMapper.updateByExampleSelective
//    * @Description: 根据查询条件更新user_first部分字段
//    * @param record 要更新成为的UserFirst对象
//    * @param criteria 更新记录的查询条件
//    * @return int 更新记录数
//     */
//    int updateByExampleSelective(@Param("record") UserFirst record, @Param("example") Criteria criteria);
//
//    /**
//    * @Title UserFirstMapper.updateByExample
//    * @Description: 根据查询条件更新user_first全表字段
//    * @param record 要更新成为的UserFirst对象
//    * @param criteria 更新记录的查询条件
//    * @return int 更新记录数
//     */
//    int updateByExample(@Param("record") UserFirst record, @Param("example") Criteria criteria);

    /**
    * @Title UserFirstMapper.updateByPrimaryKeySelective
    * @Description: 根据主键更新user_first部分字段
    * @param record 要更新成为的UserFirst对象
    * @return int 更新记录数
     */
    int updateByPrimaryKeySelective(UserFirst record);

    /**
    * @Title UserFirstMapper.updateByPrimaryKey
    * @Description: 根据主键更新user_first全部字段
    * @param record 要更新成为的UserFirst对象
    * @return int 更新记录数
     */
    int updateByPrimaryKey(UserFirst record);
}