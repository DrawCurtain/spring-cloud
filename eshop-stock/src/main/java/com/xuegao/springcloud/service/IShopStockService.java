package com.xuegao.springcloud.service;

import com.xuegao.springcloud.entity.ShopStock;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xuegao.springcloud.entity.StockAddDTO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
public interface IShopStockService extends IService<ShopStock> {

    Integer getAccountById(Integer goodsId);

    Integer addStockApi(StockAddDTO stockAddDTO);
}
