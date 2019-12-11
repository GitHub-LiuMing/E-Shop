package com.liuming.eshop.service.sysLogService.impl;

import com.liuming.eshop.entity.sysLogEntity.SysLog;
import com.liuming.eshop.mapper.sysLogMapper.SysLogMapper;
import com.liuming.eshop.service.sysLogService.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @ClassName Ming Liu
 * @Author User
 * @date 2019.10.26 15:17
 */
@Service
public class SysLogServiceImpl implements SysLogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    @Override
    public int insertLog(SysLog entity) {
        // TODO Auto-generated method stub
        return sysLogMapper.insert(entity);
    }
}
