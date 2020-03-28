package com.liuming.eshop.service.changeService;

import com.liuming.eshop.entity.changeEntity.Change;
import com.liuming.eshop.utils.DataResult;

public interface ChangeService {
    DataResult addChange(Change change);

    DataResult findChange(Change change);
}
