package com.lcc.core.good.dao;

import com.lcc.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;



public interface OrderDao {

    /**
     * 插入订单明细
     */
    int insertOrder(@Param("userId") long userId,@Param("goodsId") long goodsId, @Param("title")String title);


    /**
     * 根据偏移量查询订单列表
     */
    List<Order> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}