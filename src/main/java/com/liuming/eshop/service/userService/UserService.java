package com.liuming.eshop.service.userService;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.utils.DataResult;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    DataResult addUser(User user);

    DataResult findUser(User user);

    DataResult loginUser(User user);
}
