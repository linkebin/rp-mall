package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "pay_log")
public class PayLog {
    /**
     * ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 订单id
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 订单号
     */
    @Column(name = "ORDER_NUM")
    private String orderNum;

    /**
     * 支付单号
     */
    @Column(name = "PAY_ID")
    private String payId;

    /**
     * 金额
     */
    @Column(name = "SUM")
    private BigDecimal sum;

    /**
     * 支付方式
     */
    @Column(name = "PAY_TYPE")
    private String payType;

    /**
     * 返回日志
     */
    @Column(name = "RE_LOG")
    private String reLog;

    /**
     * 支付时间
     */
    @Column(name = "PAY_TIME")
    private Date payTime;

    /**
     * 获取ID
     *
     * @return ID_ - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单id
     *
     * @return ORDER_ID - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单号
     *
     * @return ORDER_NUM - 订单号
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * 设置订单号
     *
     * @param orderNum 订单号
     */
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * 获取支付单号
     *
     * @return PAY_ID - 支付单号
     */
    public String getPayId() {
        return payId;
    }

    /**
     * 设置支付单号
     *
     * @param payId 支付单号
     */
    public void setPayId(String payId) {
        this.payId = payId;
    }

    /**
     * 获取金额
     *
     * @return SUM - 金额
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * 设置金额
     *
     * @param sum 金额
     */
    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    /**
     * 获取支付方式
     *
     * @return PAY_TYPE - 支付方式
     */
    public String getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(String payType) {
        this.payType = payType;
    }

    /**
     * 获取返回日志
     *
     * @return RE_LOG - 返回日志
     */
    public String getReLog() {
        return reLog;
    }

    /**
     * 设置返回日志
     *
     * @param reLog 返回日志
     */
    public void setReLog(String reLog) {
        this.reLog = reLog;
    }

    /**
     * 获取支付时间
     *
     * @return PAY_TIME - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}