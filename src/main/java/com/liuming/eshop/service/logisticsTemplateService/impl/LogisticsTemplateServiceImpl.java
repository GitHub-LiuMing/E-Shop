package com.liuming.eshop.service.logisticsTemplateService.impl;

import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplate;
import com.liuming.eshop.mapper.logisticsTemplateMapper.LogisticsTemplateMapper;
import com.liuming.eshop.service.logisticsTemplateService.LogisticsTemplateService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @ClassName LogisticsTemplateServiceImpl
 * @Author 鲸落
 * @date 2019.12.27 15:34
 */
@Service
public class LogisticsTemplateServiceImpl implements LogisticsTemplateService {
    @Resource
    private LogisticsTemplateMapper logisticsTemplateMapper;

    @Override
    public DataResult addLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        if (logisticsTemplate.getLogisticsType() == 1){
            //物流模式为2的时候，必须填写物流件数和物流费用，否则无法保存
            if (logisticsTemplate.getLogisticsMode() == 2 && logisticsTemplate.getLogisticsNumber() != null && logisticsTemplate.getLogisticsCost() != null) {
                logisticsTemplate.setLogisticsTemplateId(IDUtils.getId());
                logisticsTemplate.setLogisticsTemplateCreatedDate(new Date());
                logisticsTemplate.setLogisticsTemplateUpdatedDate(new Date());
                int i = logisticsTemplateMapper.insertSelective(logisticsTemplate);
                if (i > 0) {
                    return DataResult.build(200, "物流模板新增成功");
                } else {
                    return DataResult.build(500, "物流模板新增失败，请重试");
                }
            } else if (logisticsTemplate.getLogisticsMode() == 1) {
                logisticsTemplate.setLogisticsTemplateId(IDUtils.getId());
                logisticsTemplate.setLogisticsTemplateCreatedDate(new Date());
                logisticsTemplate.setLogisticsTemplateUpdatedDate(new Date());
                int i = logisticsTemplateMapper.insertSelective(logisticsTemplate);
                if (i > 0) {
                    return DataResult.build(200, "物流模板新增成功");
                } else {
                    return DataResult.build(500, "物流模板新增失败，请重试");
                }
            } else {
                return DataResult.build(500, "请检查物流模式（物流模式选择配置运费选项则必须填写物流件数和物流费用）");
            }
        } else if(logisticsTemplate.getLogisticsType() == 2) {
            logisticsTemplate.setLogisticsTemplateId(IDUtils.getId());
            logisticsTemplate.setLogisticsTemplateCreatedDate(new Date());
            logisticsTemplate.setLogisticsTemplateUpdatedDate(new Date());
            int i = logisticsTemplateMapper.insertSelective(logisticsTemplate);
            if (i > 0) {
                return DataResult.build(200, "物流模板新增成功");
            } else {
                return DataResult.build(500, "物流模板新增失败，请重试");
            }
        } else {
            return DataResult.build(500, "请检查物流类型");
        }
    }

    @Override
    public DataResult findLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        Map map = new HashMap();
        map.put("logisticsTemplateId", logisticsTemplate.getLogisticsTemplateId());
        map.put("logisticsTemplateName", logisticsTemplate.getLogisticsTemplateName());
        map.put("logisticsType", logisticsTemplate.getLogisticsType());
        map.put("logisticsMode", logisticsTemplate.getLogisticsMode());
        map.put("logisticsNumber", logisticsTemplate.getLogisticsNumber());
        map.put("logisticsCost", logisticsTemplate.getLogisticsCost());
        map.put("logisticsTemplateStatus", logisticsTemplate.getLogisticsTemplateStatus());
        map.put("logisticsTemplateCreatedDate", logisticsTemplate.getLogisticsTemplateCreatedDate());
        map.put("logisticsTemplateUpdatedDate", logisticsTemplate.getLogisticsTemplateUpdatedDate());
        List<LogisticsTemplate> logisticsTemplateList = logisticsTemplateMapper.findLogisticsTemplate(map);
        return DataResult.ok(logisticsTemplateList);
    }

    @Override
    public DataResult updateLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        logisticsTemplate.setLogisticsTemplateUpdatedDate(new Date());
        int i = logisticsTemplateMapper.updateByPrimaryKeySelective(logisticsTemplate);
        if (i > 0) {
            return DataResult.build(200, "物流模板更新成功");
        } else {
            return DataResult.build(500, "物流模板更新失败");
        }
    }
}
