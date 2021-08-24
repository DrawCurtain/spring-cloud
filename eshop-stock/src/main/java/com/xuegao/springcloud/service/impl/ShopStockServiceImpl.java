package com.xuegao.springcloud.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.xuegao.springcloud.entity.ShopStock;
import com.xuegao.springcloud.entity.StockAddDTO;
import com.xuegao.springcloud.mapper.ShopStockMapper;
import com.xuegao.springcloud.service.IShopStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
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
public class ShopStockServiceImpl extends ServiceImpl<ShopStockMapper, ShopStock> implements IShopStockService {
    /**
     * 添加库存-直接返回主键
     *
     * @param stockAddDTO
     * @return
     */
    @Override
    public Integer addStockApi(StockAddDTO stockAddDTO) {
        ShopStock stock = new ShopStock();
        stock.setGoodsId(stockAddDTO.getGoodsId());
        stock.setInventory(stockAddDTO.getAccount());
        log.info("准备添加库存,参数:{}", stock.toString());
        this.baseMapper.insert(stock);
        Integer stockId =stock.getStockId();
        log.info("添加库存成功,stockId:{}", stockId);
        return stockId;
    }

    /**
     * 根据商品ID获取商品库存
     *
     * @param goodsId
     * @return
     */
    @Override
    public Integer getAccountById(Integer goodsId) {
        ShopStock stock = this.getOne(Wrappers.<ShopStock>lambdaQuery().eq(ShopStock::getGoodsId, goodsId));
        Integer account = stock.getInventory();
        return account;
    }


}
