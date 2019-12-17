package com.liuming.eshop.controller.provincialAgentController;

import com.liuming.eshop.entity.provincialAgentEntity.ProvincialAgent;
import com.liuming.eshop.service.provincialAgentService.ProvincialAgentService;
import com.liuming.eshop.utils.DataResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description 省代(店铺基本信息)
 * @ClassName ProvincialAgentController
 * @Author 鲸落
 * @date 2019.12.16 14:09
 */
@RestController
@RequestMapping("/provincialAgent")
public class ProvincialAgentController {
    @Resource
    private ProvincialAgentService provincialAgentService;

    /**
     * @Description 新增省代
     * @param provincialAgent
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.17 14:03
     */
    @RequestMapping("/addProvincialAgent")
    public DataResult addProvincialAgent(ProvincialAgent provincialAgent){
        if (StringUtils.isNotBlank(provincialAgent.getProvincialAgentName()) && StringUtils.isNotBlank(provincialAgent.getMemberId()) && StringUtils.isNotBlank(provincialAgent.getMemberName())){
            return provincialAgentService.addProvincialAgent(provincialAgent);
        } else {
            return DataResult.build(500,"省代名称、会员ID、会员名不得为空");
        }
    }

    /**
     * @Description 查询省代
     * @param provincialAgent
     * @return com.liuming.eshop.utils.DataResult
     * @Author 鲸落
     * @Date 2019.12.17 14:03
     */
    @RequestMapping("/findProvincialAgent")
    public DataResult findProvincialAgent(ProvincialAgent provincialAgent){
        return provincialAgentService.findProvincialAgent(provincialAgent);
    }
}
