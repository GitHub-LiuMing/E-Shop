package com.liuming.eshop.service.qiniuService.Impl;

import com.liuming.eshop.service.qiniuService.QiniuService;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * @Description 七牛云图片上传
 * @ClassName QiniuServiceImpl
 * @Author 鲸落
 * @date 2019.09.18 14:35
 */
@Service
public class QiniuServiceImpl implements QiniuService {
    private static final Logger logger = LoggerFactory.getLogger(QiniuService.class);

    // 设置好账号的ACCESS_KEY和SECRET_KEY
    private static final String ACCESS_KEY = "LA5ssCNyYTuQJ-85eSqGU_MUVvb7-f0rUXo7BtoK";
    private static final String SECRET_KEY = "FACXLUN1sELLAL3UqfBC1HC8pHzVl8zc0W1Q6SKQ";
    private static final String bucketname = "shengshihuipuimage";

    // 密钥配置
    private static final Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);

    // 构造一个带指定Zone对象的配置类,不同的七云牛存储区域调用不同的zone
    Configuration cfg = new Configuration(Zone.zone0());
    // ...其他参数参考类注释
    UploadManager uploadManager = new UploadManager(cfg);

    // 域名
    private static String QINIU_IMAGE_DOMAIN = "http://image.sxsshp.com/";

    // 简单上传，使用默认策略，只需要设置上传的空间名就可以了
    public String getUpToken() {
        return auth.uploadToken(bucketname);
    }

    //普通上传
    @Override
    public String upload(MultipartFile file) throws IOException {
        // 创建上传对象
        UploadManager uploadManager = new UploadManager(cfg);
        int dotPos = file.getOriginalFilename().lastIndexOf(".");
        if (dotPos < 0) {
            return null;
        }

        String fileExt = file.getOriginalFilename().substring(dotPos + 1).toLowerCase();

        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + "." + fileExt;

        try {
            // 调用put方法上传
            Response res = uploadManager.put(file.getBytes(), fileName, auth.uploadToken(bucketname));
            // 打印返回的信息
            //System.out.println(res.bodyString());
        } catch (QiniuException e) {
            Response r = e.response;
            // 请求失败时打印的异常的信息
            //System.out.println(r.toString());
            try {
                // 响应的文本信息
                System.out.println(r.bodyString());
            } catch (QiniuException e1) {
                //ignore
            }
        }
        String imageUrl = QINIU_IMAGE_DOMAIN + fileName;
        return imageUrl;
    }
}
