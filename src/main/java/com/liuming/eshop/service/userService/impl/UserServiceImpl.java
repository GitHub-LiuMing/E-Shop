package com.liuming.eshop.service.userService.impl;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.mapper.userMapper.UserMapper;
import com.liuming.eshop.service.userService.UserService;
import com.liuming.eshop.utils.BCrypt;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
import java.util.*;

/**
 * @Description 
 * @ClassName UserServiceImpl
 * @Author 张孙峰
 * @date 2019.12.11 15:48
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public DataResult addUser(User user) {
        user.setUserId(IDUtils.getId());
        user.setUserPassword(BCrypt.hashpw(user.getUserPassword(), BCrypt.gensalt()));
        user.setUserCreateDate(new Date());
        user.setUserUpdateDate(new Date());
        int i = userMapper.insertSelective(user);
        if (i > 0){
            return DataResult.build(200,"用户新增成功");
        } else {
            return DataResult.build(500,"用户新增失败，请重试");
        }
    }

    @Override
    public DataResult findUser(User user) {
        Map map = new HashMap();
        map.put("userName", user.getUserName());
        map.put("userStatus", 1);
        List<User> userList = userMapper.findUserList(map);
        return DataResult.ok(userList);
    }

    @Override
    public DataResult loginUser(User user) {
        Map map = new HashMap();
        map.put("userName", user.getUserName());
        List<User> userList = userMapper.findUserList(map);
        if (userList.size() > 0){
            boolean checkpw = BCrypt.checkpw(user.getUserPassword(), userList.get(0).getUserPassword());
            if (checkpw){
                return DataResult.ok(userList.get(0));
            } else {
                return DataResult.build(500,"用户名密码错误");
            }
        } else {
            return DataResult.build(500,"该用户不存在");
        }
    }
}
