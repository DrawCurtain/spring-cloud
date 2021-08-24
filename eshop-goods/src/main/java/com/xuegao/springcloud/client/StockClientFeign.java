package com.xuegao.springcloud.client;

import com.xuegao.springcloud.entity.StockAddDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: 三分恶
 * @Date: 2021/5/26
 * @Description: 库存服务feign客户端
 **/
@FeignClient(value = "stock-service")
public interface StockClientFeign {

    /**
     * 调用添加库存接口
     *
     * @param stockAddDTO
     * @return
     */
    @PostMapping(value = "/shop-stock/api/add")
    Integer addStock(@RequestBody StockAddDTO stockAddDTO);

    /**
     * 调用根据商品ID获取库存量接口
     *
     * @param goodsId
     * @return
     */
    @GetMapping(value = "/shop-stock/api/account/get")
    Integer getAccountById(@RequestParam(value = "goodsId") Integer goodsId);
}

