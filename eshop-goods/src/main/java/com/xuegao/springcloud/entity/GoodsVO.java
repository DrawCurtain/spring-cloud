package com.xuegao.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/20 11:41
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class GoodsVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer goodsId;

    private String goodsName;

    private BigDecimal price;

    private String description;

    private Integer account;
}

