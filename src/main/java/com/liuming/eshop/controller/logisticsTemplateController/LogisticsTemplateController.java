package com.liuming.eshop.controller.logisticsTemplateController;

import com.liuming.eshop.entity.logisticsTemplateEntity.LogisticsTemplate;
import com.liuming.eshop.service.logisticsTemplateService.LogisticsTemplateService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 物流模板
 * @ClassName LogisticsTemplateController
 * @Author 鲸落
 * @date 2019.12.27 15:34
 */
@RestController
@RequestMapping("/logisticsTemplate")
public class LogisticsTemplateController {
    @Resource
    private LogisticsTemplateService logisticsTemplateService;

    /**
     * @param logisticsTemplate
     * @return com.liuming.eshop.utils.DataResult
     * @Description 新增物流模板
     * @Author 鲸落
     * @Date 2019.12.27 15:39
     */
    @RequestMapping("/addLogisticsTemplate")
    public DataResult addLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        if (StringUtils.isNotBlank(logisticsTemplate.getLogisticsTemplateName())) {
            return logisticsTemplateService.addLogisticsTemplate(logisticsTemplate);
        } else {
            return DataResult.build(500, "物流模板名称不得为空");
        }
    }

    /**
     * @param logisticsTemplate
     * @return com.liuming.eshop.utils.DataResult
     * @Description 查询物流模板
     * @Author 鲸落
     * @Date 2019.12.27 16:09
     */
    @RequestMapping("/findLogisticsTemplate")
    public DataResult findLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        return logisticsTemplateService.findLogisticsTemplate(logisticsTemplate);
    }

    /**
     * @param logisticsTemplate
     * @return com.liuming.eshop.utils.DataResult
     * @Description 更新物流模板
     * @Author 鲸落
     * @Date 2019.12.27 16:37
     */
    @RequestMapping("/updateLogisticsTemplate")
    public DataResult updateLogisticsTemplate(LogisticsTemplate logisticsTemplate) {
        if (StringUtils.isNotBlank(logisticsTemplate.getLogisticsTemplateId())) {
            return logisticsTemplateService.updateLogisticsTemplate(logisticsTemplate);
        } else {
            return DataResult.build(500, "物流模板不存在");
        }
    }
}
