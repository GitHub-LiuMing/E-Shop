package com.liuming.eshop.service.payService;

import com.liuming.eshop.utils.DataResult;

public interface PayService {
    DataResult toPay(String ordersId);
}
