package com.liuming.eshop.service.memberDistributionAddressService;

import com.liuming.eshop.entity.memberDistributionAddressEntity.MemberDistributionAddress;
import com.liuming.eshop.utils.DataResult;

public interface MemberDistributionAddressService {
    DataResult addMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress);

    DataResult findMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress);

    DataResult updateMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress);
}
