package com.liuming.eshop.service.classifyService;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.utils.DataResult;

public interface ClassifyService {
    DataResult addClassify(Classify classify);

    DataResult findClassify();
}
