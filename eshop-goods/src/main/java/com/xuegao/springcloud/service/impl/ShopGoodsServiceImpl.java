package com.xuegao.springcloud.service.impl;

import com.xuegao.springcloud.client.StockClientFeign;
import com.xuegao.springcloud.common.core.domain.CommonResult;
import com.xuegao.springcloud.entity.GoodsAddDTO;
import com.xuegao.springcloud.entity.GoodsVO;
import com.xuegao.springcloud.entity.ShopGoods;
import com.xuegao.springcloud.entity.StockAddDTO;
import com.xuegao.springcloud.mapper.ShopGoodsMapper;
import com.xuegao.springcloud.service.IShopGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
@Service
@Slf4j
public class ShopGoodsServiceImpl extends ServiceImpl<ShopGoodsMapper, ShopGoods> implements IShopGoodsService {
    @Autowired
    private StockClientFeign stockClientFeign;

    /**
     * 添加商品
     *
     * @param goodsAddDTO
     * @return
     */
    @Override
    public CommonResult addGoods(GoodsAddDTO goodsAddDTO) {
//        ShopGoods shopGoods = new ShopGoods();
//        BeanUtils.copyProperties(goodsAddDTO, shopGoods);
//        this.baseMapper.insert(shopGoods);
//        log.info("添加商品，商品主键：{}", shopGoods.getGoodsId());
//        log.info(shopGoods.toString());
        StockAddDTO stockAddDTO = StockAddDTO.builder().goodsId(goodsAddDTO.getGoodsId()).account(goodsAddDTO.getAccount()).build();
        log.info("准备添加库存，参数：{}", stockAddDTO.toString());
        Integer stockId = stockClientFeign.addStock(stockAddDTO);
        log.info("添加库存结束，库存主键:{}", stockId);
        return CommonResult.ok();
    }

    /**
     * 获取商品
     *
     * @param goodsId
     * @return
     */
    @Override
    public CommonResult<GoodsVO> getGoodsById(Integer goodsId) {
        GoodsVO goodsVO = new GoodsVO();
        //获取商品基本信息
        ShopGoods shopGoods = this.baseMapper.selectById(goodsId);
        BeanUtils.copyProperties(shopGoods, goodsVO);
        //获取商品库存数量
        Integer account = this.stockClientFeign.getAccountById(goodsId);
        log.info("商品数量:{}", account);
        goodsVO.setAccount(account);
        return CommonResult.ok(goodsVO);
    }
}
