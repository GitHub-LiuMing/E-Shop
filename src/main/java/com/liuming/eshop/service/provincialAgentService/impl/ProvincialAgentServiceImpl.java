package com.liuming.eshop.service.provincialAgentService.impl;

import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.provincialAgentEntity.ProvincialAgent;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.mapper.provincialAgentMapper.ProvincialAgentMapper;
import com.liuming.eshop.service.provincialAgentService.ProvincialAgentService;
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
 * @ClassName ProvincialAgentServiceImpl
 * @Author 鲸落
 * @date 2019.12.16 14:08
 */
@Service
public class ProvincialAgentServiceImpl implements ProvincialAgentService {
    @Resource
    private ProvincialAgentMapper provincialAgentMapper;

    @Resource
    private MemberMapper memberMapper;

    @Override
    public DataResult addProvincialAgent(ProvincialAgent provincialAgent) {
        Map map = new HashMap();
        Member member = memberMapper.selectByPrimaryKey(provincialAgent.getMemberId());
        if (member != null){
            map.put("provincialAgentName",provincialAgent.getProvincialAgentName());
            List<ProvincialAgent> provincialAgentList = provincialAgentMapper.findProvincialAgent(map);
            if (provincialAgentList.size() == 0){
                provincialAgent.setProvincialAgentId(IDUtils.getId());
                provincialAgent.setProvincialAgentStatus(1);
                provincialAgent.setProvincialAgentCreatedDate(new Date());
                provincialAgent.setProvincialAgentUpdatedDate(new Date());
                int i = provincialAgentMapper.insertSelective(provincialAgent);
                if (i > 0){
                    return DataResult.build(200,"省代新增成功");
                } else {
                    return DataResult.build(500,"省代新增失败，请核对信息后重试");
                }
            } else {
                return DataResult.build(500,"该省已有省代，请勿重复添加");
            }
        } else {
            return DataResult.build(500,"会员信息获取失败，请重新尝试");
        }
    }

    @Override
    public DataResult findProvincialAgent(ProvincialAgent provincialAgent) {
        Map map = new HashMap();
        map.put("provincialAgentId",provincialAgent.getProvincialAgentId());
        map.put("provincialAgentName",provincialAgent.getProvincialAgentName());
        map.put("memberId",provincialAgent.getMemberId());
        map.put("memberName",provincialAgent.getMemberName());
        map.put("provincialAgentStatus",provincialAgent.getProvincialAgentStatus());
        map.put("provincialAgentCreatedDate",provincialAgent.getProvincialAgentCreatedDate());
        map.put("provincialAgentUpdatedDate",provincialAgent.getProvincialAgentUpdatedDate());
        List<ProvincialAgent> provincialAgentList = provincialAgentMapper.findProvincialAgent(map);
        return DataResult.ok(provincialAgentList);
    }
}
