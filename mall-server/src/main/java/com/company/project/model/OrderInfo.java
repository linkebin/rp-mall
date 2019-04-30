package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_info")
public class OrderInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_CODE")
    private String orderCode;

    /**
     * 订单时间
     */
    @Column(name = "ORDER_TIME")
    private Date orderTime;

    /**
     * 订单类型
     */
    @Column(name = "PRDER_TYPE")
    private String prderType;

    /**
     * 订单来源
     */
    @Column(name = "ORDER_SOURCE")
    private String orderSource;

    /**
     * 下单用户
     */
    @Column(name = "CUST_ID")
    private String custId;

    /**
     * 下单用户名称
     */
    @Column(name = "CUST_NAME")
    private String custName;

    /**
     * 代理ID
     */
    @Column(name = "AGENCY_ID")
    private String agencyId;

    /**
     * 代理名称
     */
    @Column(name = "AGENCY_NAME")
    private String agencyName;

    /**
     * 订单状态
     */
    @Column(name = "ORDER_STATE")
    private String orderState;

    /**
     * 订单金额
     */
    @Column(name = "ORDER_SUM")
    private Short orderSum;

    /**
     * 收货地址
     */
    @Column(name = "ADDR")
    private String addr;

    /**
     * 收货时间
     */
    @Column(name = "TAKE_TIME")
    private Date takeTime;

    /**
     * DELETED
     */
    @Column(name = "DELETED")
    private Integer deleted;

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
     * 获取订单编号
     *
     * @return ORDER_CODE - 订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置订单编号
     *
     * @param orderCode 订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * 获取订单时间
     *
     * @return ORDER_TIME - 订单时间
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * 设置订单时间
     *
     * @param orderTime 订单时间
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * 获取订单类型
     *
     * @return PRDER_TYPE - 订单类型
     */
    public String getPrderType() {
        return prderType;
    }

    /**
     * 设置订单类型
     *
     * @param prderType 订单类型
     */
    public void setPrderType(String prderType) {
        this.prderType = prderType;
    }

    /**
     * 获取订单来源
     *
     * @return ORDER_SOURCE - 订单来源
     */
    public String getOrderSource() {
        return orderSource;
    }

    /**
     * 设置订单来源
     *
     * @param orderSource 订单来源
     */
    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    /**
     * 获取下单用户
     *
     * @return CUST_ID - 下单用户
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置下单用户
     *
     * @param custId 下单用户
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取下单用户名称
     *
     * @return CUST_NAME - 下单用户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置下单用户名称
     *
     * @param custName 下单用户名称
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取代理ID
     *
     * @return AGENCY_ID - 代理ID
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * 设置代理ID
     *
     * @param agencyId 代理ID
     */
    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    /**
     * 获取代理名称
     *
     * @return AGENCY_NAME - 代理名称
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * 设置代理名称
     *
     * @param agencyName 代理名称
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * 获取订单状态
     *
     * @return ORDER_STATE - 订单状态
     */
    public String getOrderState() {
        return orderState;
    }

    /**
     * 设置订单状态
     *
     * @param orderState 订单状态
     */
    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    /**
     * 获取订单金额
     *
     * @return ORDER_SUM - 订单金额
     */
    public Short getOrderSum() {
        return orderSum;
    }

    /**
     * 设置订单金额
     *
     * @param orderSum 订单金额
     */
    public void setOrderSum(Short orderSum) {
        this.orderSum = orderSum;
    }

    /**
     * 获取收货地址
     *
     * @return ADDR - 收货地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置收货地址
     *
     * @param addr 收货地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取收货时间
     *
     * @return TAKE_TIME - 收货时间
     */
    public Date getTakeTime() {
        return takeTime;
    }

    /**
     * 设置收货时间
     *
     * @param takeTime 收货时间
     */
    public void setTakeTime(Date takeTime) {
        this.takeTime = takeTime;
    }

    /**
     * 获取DELETED
     *
     * @return DELETED - DELETED
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置DELETED
     *
     * @param deleted DELETED
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}