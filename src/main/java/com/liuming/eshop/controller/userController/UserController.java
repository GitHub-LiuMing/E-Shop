package com.liuming.eshop.controller.userController;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.service.userService.UserService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 用户
 * @ClassName UserController
 * @Author 鲸落
 * @date 2019.12.11 15:47
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * @Description 新增用户
     * @param user
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.11 16:00
     */
    @RequestMapping("/addUser")
    public DataResult addUser(User user){
        if(StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserPassword())){
            return userService.addUser(user);
        } else {
            return DataResult.build(50,"用户名和密码不得为空");
        }
    }

    /**
     * @Description 查询用户
     * @param user
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.11 18:16
     */
    @RequestMapping("/findUser")
    public DataResult findUser(User user){
        return userService.findUser(user);
    }

    @RequestMapping("/loginUser")
    public DataResult loginUser(User user){
        if (StringUtils.isNotBlank(user.getUserName()) && StringUtils.isNotBlank(user.getUserPassword())){
            return userService.loginUser(user);
        } else {
            return DataResult.build(500,"用户名或密码不得为空");
        }
    }
}
