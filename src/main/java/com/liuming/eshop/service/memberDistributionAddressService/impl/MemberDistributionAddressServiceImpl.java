package com.liuming.eshop.service.memberDistributionAddressService.impl;

import com.liuming.eshop.entity.cityEntity.City;
import com.liuming.eshop.entity.districtEntity.District;
import com.liuming.eshop.entity.memberDistributionAddressEntity.MemberDistributionAddress;
import com.liuming.eshop.entity.memberEntity.Member;
import com.liuming.eshop.entity.provinceEntity.Province;
import com.liuming.eshop.mapper.cityMapper.CityMapper;
import com.liuming.eshop.mapper.districtMapper.DistrictMapper;
import com.liuming.eshop.mapper.memberDistributionAddressMapper.MemberDistributionAddressMapper;
import com.liuming.eshop.mapper.memberMapper.MemberMapper;
import com.liuming.eshop.mapper.provinceMapper.ProvinceMapper;
import com.liuming.eshop.service.memberDistributionAddressService.MemberDistributionAddressService;
import com.liuming.eshop.utils.DataResult;
import com.liuming.eshop.utils.IDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 
 * @ClassName MemberDistributionAddressServiceImpl
 * @Author 鲸落
 * @date 2019.12.26 17:13
 */
@Service
public class MemberDistributionAddressServiceImpl implements MemberDistributionAddressService {
    @Resource
    private MemberDistributionAddressMapper memberDistributionAddressMapper;

    @Resource
    private MemberMapper memberMapper;

    @Resource
    private DistrictMapper districtMapper;

    @Resource
    private CityMapper cityMapper;

    @Resource
    private ProvinceMapper provinceMapper;

    @Override
    public DataResult addMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress) {
        //查询会员是否存在，查询会员下是否有默认配送地址，如果该会员新增的地址设置为默认地址，那么在新增之前，要修改该会员下所有的地址为非默认地址
        Member member = memberMapper.selectByPrimaryKey(memberDistributionAddress.getMemberId());
        Map map;
        map = new HashMap();
        map.put("districtCode",memberDistributionAddress.getDistrictCode());
        List<District> district = districtMapper.findDistrict(map);
        map = new HashMap();
        map.put("cityCode",district.get(0).getCityCode());
        List<City> city = cityMapper.findCity(map);
        map = new HashMap();
        map.put("provinceCode",city.get(0).getProvinceCode());
        List<Province> province = provinceMapper.findProvince(map);
        if (StringUtils.isNotBlank(member.getMemberId())){
            map = new HashMap();
            map.put("memberId", memberDistributionAddress.getMemberId());
            map.put("defaultAddressStatus", 1);
            List<MemberDistributionAddress> memberDistributionAddressList =
                    memberDistributionAddressMapper.findMemberDistributionAddress(map);
            if (memberDistributionAddressList.size() == 0){
                memberDistributionAddress.setMemberDistributionAddressId(IDUtils.getId());
                memberDistributionAddress.setProvinceCode(Integer.valueOf(province.get(0).getProvinceCode()).intValue());
                memberDistributionAddress.setProvinceName(province.get(0).getProvinceName());
                memberDistributionAddress.setCityCode(Integer.valueOf(city.get(0).getCityCode()).intValue());
                memberDistributionAddress.setCityName(city.get(0).getCityName());
                memberDistributionAddress.setDistrictCode(Integer.valueOf(district.get(0).getDistrictCode()).intValue());
                memberDistributionAddress.setDistrictName(district.get(0).getDistrictName());
                memberDistributionAddress.setMemberDistributionAddressCreatedDate(new Date());
                memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
                int i = memberDistributionAddressMapper.insertSelective(memberDistributionAddress);
                if (i > 0){
                    return DataResult.build(200,"配送地址新增成功");
                } else {
                    return DataResult.build(500,"配送地址新增失败");
                }
            } else {
                if (memberDistributionAddress.getDefaultAddressStatus() == 0){
                    memberDistributionAddress.setMemberDistributionAddressId(IDUtils.getId());
                    memberDistributionAddress.setProvinceCode(Integer.valueOf(province.get(0).getProvinceCode()).intValue());
                    memberDistributionAddress.setProvinceName(province.get(0).getProvinceName());
                    memberDistributionAddress.setCityCode(Integer.valueOf(city.get(0).getCityCode()).intValue());
                    memberDistributionAddress.setCityName(city.get(0).getCityName());
                    memberDistributionAddress.setDistrictCode(Integer.valueOf(district.get(0).getDistrictCode()).intValue());
                    memberDistributionAddress.setDistrictName(district.get(0).getDistrictName());
                    memberDistributionAddress.setMemberDistributionAddressCreatedDate(new Date());
                    memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
                    int i = memberDistributionAddressMapper.insertSelective(memberDistributionAddress);
                    if (i > 0){
                        return DataResult.build(200,"配送地址新增成功");
                    } else {
                        return DataResult.build(500,"配送地址新增失败");
                    }
                } else {
                    //如果设置默认地址，但是系统中该用户存在默认地址，需要将原来的默认地址改为0，然后再设置新增配送地址为默认地址
                    /*MemberDistributionAddress m = new MemberDistributionAddress();
                    m.setMemberId(memberDistributionAddress.getMemberId());
                    m.setDefaultAddressStatus(0);*/
                    int i = memberDistributionAddressMapper.updateDefaultAddressStatusByMemberId(memberDistributionAddress.getMemberId());
                    if (i > 0){
                        memberDistributionAddress.setMemberDistributionAddressId(IDUtils.getId());
                        memberDistributionAddress.setProvinceCode(Integer.valueOf(province.get(0).getProvinceCode()).intValue());
                        memberDistributionAddress.setProvinceName(province.get(0).getProvinceName());
                        memberDistributionAddress.setCityCode(Integer.valueOf(city.get(0).getCityCode()).intValue());
                        memberDistributionAddress.setCityName(city.get(0).getCityName());
                        memberDistributionAddress.setDistrictCode(Integer.valueOf(district.get(0).getDistrictCode()).intValue());
                        memberDistributionAddress.setDistrictName(district.get(0).getDistrictName());
                        memberDistributionAddress.setMemberDistributionAddressCreatedDate(new Date());
                        memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
                        int ii = memberDistributionAddressMapper.insertSelective(memberDistributionAddress);
                        if (ii > 0){
                            return DataResult.build(200,"配送地址新增成功");
                        } else {
                            return DataResult.build(500,"配送地址新增失败");
                        }
                    } else {
                        return DataResult.build(500,"因已有默认配送地址，导致新增配送地址失败");
                    }
                }
            }
        } else {
            return DataResult.build(500,"该会员不存在，请刷新后重新添加收货地址");
        }
    }

    @Override
    public DataResult findMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress) {
        Map map = new HashMap();
        map.put("memberDistributionAddressId",memberDistributionAddress.getMemberDistributionAddressId());
        map.put("memberId",memberDistributionAddress.getMemberId());
        map.put("consignee",memberDistributionAddress.getConsignee());
        map.put("phone",memberDistributionAddress.getPhone());
        map.put("provinceCode",memberDistributionAddress.getProvinceCode());
        map.put("provinceName",memberDistributionAddress.getProvinceName());
        map.put("cityCode",memberDistributionAddress.getCityCode());
        map.put("cityName",memberDistributionAddress.getCityName());
        map.put("districtCode",memberDistributionAddress.getDistrictCode());
        map.put("districtName",memberDistributionAddress.getDistrictName());
        map.put("detailedAddress",memberDistributionAddress.getDetailedAddress());
        map.put("defaultAddressStatus",memberDistributionAddress.getDefaultAddressStatus());
        map.put("memberDistributionAddressStatus", 1);
        map.put("memberDistributionAddressCreatedDate",memberDistributionAddress.getMemberDistributionAddressCreatedDate());
        map.put("memberDistributionAddressUpdatedDate",memberDistributionAddress.getMemberDistributionAddressUpdatedDate());
        List<MemberDistributionAddress> memberDistributionAddressList =
                memberDistributionAddressMapper.findMemberDistributionAddress(map);
        return DataResult.ok(memberDistributionAddressList);
    }

    @Override
    public DataResult updateMemberDistributionAddress(MemberDistributionAddress memberDistributionAddress) {
        if (memberDistributionAddress.getDefaultAddressStatus() != null && memberDistributionAddress.getDefaultAddressStatus() == 1){
            Map map = new HashMap();
            map.put("memberId",memberDistributionAddress.getMemberId());
            map.put("defaultAddressStatus",memberDistributionAddress.getDefaultAddressStatus());
            List<MemberDistributionAddress> memberDistributionAddress1 = memberDistributionAddressMapper.findMemberDistributionAddress(map);
            if (memberDistributionAddress1.size() > 0){
                memberDistributionAddressMapper.updateDefaultAddressStatusByMemberId(memberDistributionAddress.getMemberId());
                memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
                int i = memberDistributionAddressMapper.updateByPrimaryKeySelective(memberDistributionAddress);
                if (i > 0){
                    return DataResult.build(200,"更新配送地址成功");
                } else {
                    return DataResult.build(200,"更新配送地址失败，请重试");
                }
            } else {
                //memberDistributionAddressMapper.updateDefaultAddressStatusByMemberId(memberDistributionAddress.getMemberId());
                memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
                int i = memberDistributionAddressMapper.updateByPrimaryKeySelective(memberDistributionAddress);
                if (i > 0){
                    return DataResult.build(200,"更新配送地址成功");
                } else {
                    return DataResult.build(200,"更新配送地址失败，请重试");
                }
            }
        } else {
            memberDistributionAddress.setMemberDistributionAddressUpdatedDate(new Date());
            int i = memberDistributionAddressMapper.updateByPrimaryKeySelective(memberDistributionAddress);
            if (i > 0){
                return DataResult.build(200,"更新配送地址成功");
            } else {
                return DataResult.build(200,"更新配送地址失败，请重试");
            }
        }
    }
}
