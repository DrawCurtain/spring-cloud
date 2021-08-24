package com.xuegao.springcloud.controller;


import com.xuegao.springcloud.entity.StockAddDTO;
import com.xuegao.springcloud.service.IShopStockService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
@RestController
@RequestMapping("/shop-stock/api")
@Slf4j
public class ShopStockController {
    @Autowired
    private IShopStockService shopStockService;

    @PostMapping(value = "/add")
    public Integer addStock(@RequestBody StockAddDTO stockAddDTO) {
        log.info("client call add stock interface,param:{}", stockAddDTO);
        return this.shopStockService.addStockApi(stockAddDTO);
    }

    @GetMapping(value = "/account/get")
    public Integer getAccountById(@RequestParam Integer goodsId) {
        return this.shopStockService.getAccountById(goodsId);
    }
}



