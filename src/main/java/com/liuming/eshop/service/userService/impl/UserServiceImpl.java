package com.liuming.eshop.service.userService.impl;

import com.github.pagehelper.PageHelper;
import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.mapper.userMapper.UserMapper;
import com.liuming.eshop.service.userService.UserService;
import com.liuming.eshop.utils.BCrypt;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.PageBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @ClassName UserServiceImpl
 * @Author 鲸落
 * @date 2019.08.01 17:40
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * @param user 添加用户
     * @return com.liuming.eshop.utils.DataResult
     * @Description
     * @Author 鲸落
     * @Date 2019.08.02 17:00
     */
    @Override
    @Transient
    public DataResult addUser(User user) {
        //判断新增用户的时候是否有必填项Phone
        if (StringUtils.isNotBlank(user.getWechatOpenId())) {
            //查询用户的WechatOpenId是否存在
            User userByWechatOpenId = userMapper.selectByWechatOpenId(user.getWechatOpenId());
            if (userByWechatOpenId != null) {
                return DataResult.build(500, "该微信账号已注册");
            }
            //查询用户表最后一组数据的ID
            User userByKeyDecsLimit1 = userMapper.selectByKeyDecsLimit1();
            if (userByKeyDecsLimit1 != null) {
                user.setUserId(userByKeyDecsLimit1.getUserId() + 1);
            } else {
                user.setUserId(1);
            }
            //设定用户密码
            if (StringUtils.isBlank(user.getPassword())) {
                return DataResult.build(500, "用户密码不得为空");
            }
            String hashpw = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
            user.setPassword(hashpw);
            user.setUserType(0);
            user.setCreatedDate(new Date());
            user.setUpdatedDate(new Date());
            int i = userMapper.insertSelective(user);
            if (i > 0) {
                return DataResult.ok("用户新增成功");
            }
            return DataResult.build(500, "用户新增失败，请重试");
        }
        return DataResult.build(500, "微信信息获取失败");
    }

    @Override
    public DataResult findUserList(int pageNum, int PageSize, User user) {
        if (pageNum > 0 && PageSize >= 1){
            Map map = new HashMap();
            map.put("userId", user.getUserId());
            map.put("userName", user.getUserName());
            map.put("userType", user.getUserType());
            map.put("wechatName", user.getWechatName());
            map.put("phone", user.getPhone());
            map.put("province", user.getProvince());
            map.put("city", user.getCity());
            //设置分页信息
            PageHelper.startPage(pageNum, PageSize);
            //查询符合条件数据
            List<User> userList = userMapper.findUserList(map);
            //查询符合条件数据总数
            int userListCount = userMapper.findUserListCount(map);
            PageBean<User> userPageBean = new PageBean<>(pageNum, PageSize, userListCount);
            userPageBean.setItems(userList);
            return DataResult.ok(userPageBean);
        } else {
            Map map = new HashMap();
            map.put("userId", user.getUserId());
            map.put("userName", user.getUserName());
            map.put("userType", user.getUserType());
            map.put("wechatName", user.getWechatName());
            map.put("phone", user.getPhone());
            map.put("province", user.getProvince());
            map.put("city", user.getCity());
            List<User> userList = userMapper.findUserList(map);
            return DataResult.ok(userList);
        }
    }
}
