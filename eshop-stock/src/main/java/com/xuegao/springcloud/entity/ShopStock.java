package com.xuegao.springcloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xuegang
 * @since 2021-08-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ShopStock implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "stock_id", type = IdType.AUTO)
    private Integer stockId;

    /**
     * 商品表主键
     */
    private Integer goodsId;

    /**
     * 库存量
     */
    private Integer inventory;

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

    private Integer status;


}
