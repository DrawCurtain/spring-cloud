package com.xuegao.springcloud.entity;

import lombok.*;

import java.io.Serializable;

/**
 * @author xuegang
 * @version 1.0
 * @description:
 * @date 2021/8/20 10:57
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class StockAddDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer goodsId;

    private Integer account;

}

