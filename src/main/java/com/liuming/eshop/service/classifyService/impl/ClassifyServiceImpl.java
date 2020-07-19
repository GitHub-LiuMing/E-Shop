package com.liuming.eshop.service.classifyService.impl;

import com.liuming.eshop.entity.classifyEntity.Classify;
import com.liuming.eshop.mapper.classifyMapper.ClassifyMapper;
import com.liuming.eshop.service.classifyService.ClassifyService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName ClassifyServiceImpl
 * @Author 鲸落
 * @date 2019.08.06 15:30
 */
@Service
public class ClassifyServiceImpl implements ClassifyService {
    @Resource
    private ClassifyMapper classifyMapper;

    @Override
    public DataResult addClassify(Classify classify) {
        if (StringUtils.isNotBlank(classify.getClassifyName())){
            classify.setClassifyId(IDUtils.getId());
            classify.setClassifyStatus(1);
            classify.setClassifyCreateDate(new Date());
            classify.setClassifyUpdateDate(new Date());
            int i = classifyMapper.insertSelective(classify);
            if (i > 0){
                return DataResult.ok();
            }
            return DataResult.build(500,"新增分类失败");
        }
        return DataResult.build(500,"分类名称不得为空");
    }

    @Override
    public DataResult findClassify(Classify classify) {
        Map map = new HashMap();
        map.put("classifyId",classify.getClassifyId());
        map.put("classifyName",classify.getClassifyName());
        map.put("classifyUrl",classify.getClassifyUrl());
        map.put("classifyStatus",classify.getClassifyStatus());
        map.put("classifyCreateDate",classify.getClassifyCreateDate());
        map.put("classifyUpdateDate",classify.getClassifyUpdateDate());
        map.put("classifyDesc",classify.getClassifyDesc());
        List<Classify> classifyList = classifyMapper.findClassify(map);
        return DataResult.ok(classifyList);
    }
}
