package com.liuming.eshop.mapper.userMapper;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.entity.userEntity.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> findUserList(@Param("map") Map map);

    int findUserListCount(@Param("map") Map map);

    User selectByWechatOpenId(@Param("wechatOpenId") String wechatOpenId);

    User selectByKeyDecsLimit1();
}