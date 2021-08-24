package com.xuegao.springcloud.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class ShopGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "goods_id", type = IdType.AUTO)
    private Integer goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 商品介绍
     */
    private String description;

    /**
     * 创建用户
     */
    private Integer createUser;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新用户
     */
    private Integer updateUser;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 状态
     */
    private Integer status;


}
