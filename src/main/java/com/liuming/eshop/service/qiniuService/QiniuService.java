package com.liuming.eshop.service.qiniuService;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface QiniuService {
    String upload(MultipartFile file) throws IOException;
}
