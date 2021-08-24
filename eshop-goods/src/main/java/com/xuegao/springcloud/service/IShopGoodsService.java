package com.xuegao.springcloud.service;

import com.xuegao.springcloud.common.core.domain.CommonResult;
import com.xuegao.springcloud.entity.GoodsAddDTO;
import com.xuegao.springcloud.entity.GoodsVO;
import com.xuegao.springcloud.entity.ShopGoods;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
public interface IShopGoodsService extends IService<ShopGoods> {

    CommonResult addGoods(GoodsAddDTO goodsAddDTO);

    CommonResult<GoodsVO> getGoodsById(Integer goodsId);
}
