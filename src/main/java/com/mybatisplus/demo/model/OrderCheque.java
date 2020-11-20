package com.mybatisplus.demo.model;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @类描述
 * @time 2020/11/20  10:47
 * @author yangxin
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderCheque {
    private Long id;

    /**
    * 收款单号
    */
    private String chequeNo;

    /**
    * 订单编号
    */
    private String orderNo;

    /**
    * NC客户编号
    */
    private String ncCustomerCode;

    /**
    * 付款公司名称
    */
    private String paymentCompanyName;

    /**
    * 收款渠道
    */
    private Short chequeChannel;

    /**
    * 收款单号
    */
    private String serialNo;

    /**
    * 收款凭证
    */
    private String chequeVoucher;

    /**
    * 收款日期
    */
    private Date chequeDate;

    /**
    * 收款金额
    */
    private BigDecimal chequePrice;

    /**
    * 收款确认人
    */
    private String chequeUser;

    /**
    * 收款确认人 ID
    */
    private String chequeUserId;

    /**
    * 备注
    */
    private String remarks;

    /**
    * 是否删除
    */
    private Boolean isDeleted;

    /**
    * 添加时间
    */
    private Date addDt;

    /**
    * 修改时间
    */
    private Date updateDt;

    /**
    * 收款退款类型 1是收款 2是退款
    */
    private Boolean chequeType;

    /**
    * 订单来源0是易博营销/1三茅线上/2企业微信
    */
    private Boolean orderSource;

    /**
    * 客户编码
    */
    private String customerIdCode;

    /**
    * 客户名称
    */
    private String customerName;
}