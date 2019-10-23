package com.liuming.eshop.controller.userController;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.service.userService.UserService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 用户
 * @ClassName UserController
 * @Author 鲸落
 * @date 2019.08.01 17:42
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @Description
     * @param user 添加用户
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.02 10:23
     */
    @RequestMapping("/addUser")
    public DataResult addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    /**
     * @Description 查询用户
     * @param pageNum
     * @param PageSize
     * @param user
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.08.06 16:49
     */
    @RequestMapping("/findUserList")
    public DataResult findUserList(@RequestParam(defaultValue = "1") int pageNum,
                               @RequestParam(defaultValue = "10") int PageSize, @RequestBody User user){
        return userService.findUserList(pageNum, PageSize, user);
    }
}
