package com.liuming.eshop.mapper.ordersMapper;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.entity.ordersEntity.OrdersExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String ordersId);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExampleWithBLOBs(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(String ordersId);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKeyWithBLOBs(Orders record);

    int updateByPrimaryKey(Orders record);

    List<Orders> findOrders(@Param("map") Map map);

    Orders findOrdersId(String ordersId);
}