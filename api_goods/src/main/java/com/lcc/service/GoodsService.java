package com.lcc.service;

import com.lcc.entity.Goods;

import java.util.List;

/**
 * Created by lcc on 2017/1/2.
 */
public interface GoodsService {

    /**
     * 根据偏移量查询可用商品列表
     */
    List<Goods> getGoodsList(int offset, int limit);

    /**
     * 商品购买
     * 是否用存储过程提高并发能力
     */
    void buyGoods(long userPhone, long goodsId, boolean useProcedure);

    /**
     * 仅仅是为了测试下分布式事务
     */
    void testDistributedTransaction(long goodsid);
}
