package com.xuegao.springcloud.controller;


import com.xuegao.springcloud.common.core.domain.CommonResult;
import com.xuegao.springcloud.entity.GoodsAddDTO;
import com.xuegao.springcloud.entity.GoodsVO;
import com.xuegao.springcloud.entity.ShopGoods;
import com.xuegao.springcloud.service.IShopGoodsService;
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
@RequestMapping("/shop-goods")
public class ShopGoodsController {

    @Autowired
    private IShopGoodsService goodsService;

    @PostMapping(value = "/add")
    public CommonResult addGoods(@RequestBody GoodsAddDTO goodsAddDTO) {
        return this.goodsService.addGoods(goodsAddDTO);
    }

    @GetMapping(value = "/get/by-id")
    public CommonResult<GoodsVO> getGoodsById(@RequestParam Integer goodsId) {
        return this.goodsService.getGoodsById(goodsId);
    }

}

