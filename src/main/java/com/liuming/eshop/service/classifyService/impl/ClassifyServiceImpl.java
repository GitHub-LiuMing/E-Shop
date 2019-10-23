package com.liuming.eshop.service.classifyService.impl;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.mapper.classifyMapper.ClassifyMapper;
import com.liuming.eshop.service.classifyService.ClassifyService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Description 
 * @ClassName ClassifyServiceImpl
 * @Author 鲸落
 * @date 2019.08.06 15:30
 */
@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public DataResult addClassify(Classify classify) {
        if (StringUtils.isNotBlank(classify.getClassifyName())){
            classify.setClassifyId(IDUtils.getId());
            classify.setClassifyStatus(1);
            classify.setClassifyCreateDate(new Date());
            classify.setClassifyModifiedDate(new Date());
            int i = classifyMapper.insertSelective(classify);
            if (i > 0){
                return DataResult.ok();
            }
            return DataResult.build(500,"新增分类失败");
        }
        return DataResult.build(500,"分类名称不得为空");
    }

    @Override
    public DataResult findClassify() {
        List<Classify> classifyList = classifyMapper.findClassify();
        return DataResult.ok(classifyList);
    }
}
