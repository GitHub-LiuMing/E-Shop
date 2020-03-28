package com.liuming.eshop.controller.excelController;

import com.liuming.eshop.entity.userEntity.User;
import com.liuming.eshop.mapper.userMapper.UserMapper;
import com.liuming.eshop.service.userService.UserService;
import com.liuming.eshop.utils.ExcelUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Description 导入导出Excel
 * @ClassName ExcelController
 * @Author 张孙峰
 * @date 2019.12.19 11:34
 */
@RestController
@RequestMapping("/excel")
public class ExcelController {
    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    /**
     * @Description 该功能已完成，但只支持用户上传，其他类别暂不支持
     * @param file
     * @param map
     * @return java.lang.String
     * @Author 鲸落
     * @Date 2019.12.23 14:21
     */
    @RequestMapping("/importExcel")
    @ResponseBody
    public String importExcel(@RequestParam("file") MultipartFile file, Map<String, Object> map) {
        String name = file.getOriginalFilename();
        if (name.length() < 6 || !name.substring(name.length() - 5).equals(".xlsx")) {
            return "文件格式错误";
        }
        List<User> list = null;
        try {
            list = ExcelUtils.excelToShopIdList(file.getInputStream());
            if (list == null || list.size() <= 0) {
                return "导入的数据为空";
            }
            //excel的数据保存到数据库
            try {
                for (User excel : list) {
                    User user = new User();
                    user.setUserId(excel.getUserId());
                    user.setUserName(excel.getUserName());
                    user.setUserPassword(excel.getUserPassword());
                    user.setUserHeadImgUrl(excel.getUserHeadImgUrl());
                    user.setUserType(excel.getUserType());
                    user.setUserStatus(excel.getUserStatus());
                    user.setUserCreateDate(excel.getUserCreateDate());
                    user.setUserUpdateDate(excel.getUserUpdateDate());
                    userMapper.insertSelective(user);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return e.getMessage();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        return "保存成功";
    }

    @RequestMapping(value = "/exportExcel")
    public void exportExcel() {
    }
}
