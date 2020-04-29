package com.liuming.eshop.mapper.ordersMapper;

import java.util.List;
import java.util.Map;

import com.liuming.eshop.entity.ordersEntity.Orders;
import com.liuming.eshop.entity.ordersEntity.OrdersExample;
import com.liuming.eshop.entity.ordersEntity.OrdersWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(String ordersId);

    int insert(OrdersWithBLOBs record);

    int insertSelective(OrdersWithBLOBs record);

    List<OrdersWithBLOBs> selectByExampleWithBLOBs(OrdersExample example);

    List<Orders> selectByExample(OrdersExample example);

    OrdersWithBLOBs selectByPrimaryKey(String ordersId);

    int updateByExampleSelective(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExampleWithBLOBs(@Param("record") OrdersWithBLOBs record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(OrdersWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(OrdersWithBLOBs record);

    int updateByPrimaryKey(Orders record);

    List<OrdersWithBLOBs> findOrders(@Param("map") Map map);

    OrdersWithBLOBs findOrdersId(String ordersId);

    List<OrdersWithBLOBs> findOrdersByIsNullMCAndToDays(@Param("format") String format);
}