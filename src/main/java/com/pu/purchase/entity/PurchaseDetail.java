package com.pu.purchase.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 采购明细表
 * </p>
 *
 * @author 
 * @since 2020-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("purchase_detail")
public class PurchaseDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 货品编号
     */
    private String productNo;

    /**
     * 采购单号
     */
    private String purchaseNo;

    /**
     * 采购数量
     */
    private Integer purchaseQuality;

    /**
     * 已入库数量
     */
    private Integer storageQuality;

    /**
     * 采购价格
     */
    private BigDecimal purchasePrice;

    /**
     * 理论单价
     */
    private BigDecimal price;

    /**
     * 理论到货时间(采购员)
     */
    private LocalDateTime arriveTime;


}
