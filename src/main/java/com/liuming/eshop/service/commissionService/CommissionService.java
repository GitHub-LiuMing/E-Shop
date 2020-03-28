package com.liuming.eshop.service.commissionService;

import com.liuming.eshop.entity.commissionEntity.Commission;
import com.liuming.eshop.utils.DataResult;

public interface CommissionService {
    DataResult addCommission(Commission commission);

    DataResult findCommission(Commission commission);
}
