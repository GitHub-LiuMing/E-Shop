package com.liuming.eshop.controller.qiniuController;

import com.liuming.eshop.service.qiniuService.QiniuService;
import com.liuming.eshop.utils.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @Description 七牛云图片上传
 * @ClassName QiniuController
 * @Author 张孙峰
 * @date 2019.09.18 14:21
 */
@RestController
@RequestMapping("/qiniu")
public class QiniuController {
    @Autowired
    private QiniuService qiniuService;

    /**
     * @Description 图片上传
     * @param file 上传文件
     * @param request
     * @return com.liuming.eshop.utils.DataResult
     * @Author 张孙峰
     * @Date 2019.09.20 14:08
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public DataResult uploadImage(@RequestParam("file") MultipartFile file, HttpServletRequest request) throws IOException {
        String imageUrl = qiniuService.upload(file);
        return DataResult.ok(imageUrl);
    }
}
