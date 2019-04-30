package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bonus_points_jr")
public class BonusPointsJr {
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 流水号
     */
    @Column(name = "RUN_NUM")
    private String runNum;

    /**
     * 时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 收入
     */
    @Column(name = "INCOME")
    private String income;

    /**
     * 支出
     */
    @Column(name = "EXPEN")
    private String expen;

    /**
     * 类型（1：消费赠送 2：活动赠送 3：兑换商品）
     */
    @Column(name = "TYPE")
    private Integer type;

    /**
     * 关联订单
     */
    @Column(name = "RELATION_ID")
    private String relationId;

    /**
     * 账号ID
     */
    @Column(name = "CUST_ID")
    private String custId;

    /**
     * 是否删除
     */
    @Column(name = "DELETED")
    private String deleted;

    /**
     * @return ID_
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取流水号
     *
     * @return RUN_NUM - 流水号
     */
    public String getRunNum() {
        return runNum;
    }

    /**
     * 设置流水号
     *
     * @param runNum 流水号
     */
    public void setRunNum(String runNum) {
        this.runNum = runNum;
    }

    /**
     * 获取时间
     *
     * @return CREATE_TIME - 时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置时间
     *
     * @param createTime 时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取收入
     *
     * @return INCOME - 收入
     */
    public String getIncome() {
        return income;
    }

    /**
     * 设置收入
     *
     * @param income 收入
     */
    public void setIncome(String income) {
        this.income = income;
    }

    /**
     * 获取支出
     *
     * @return EXPEN - 支出
     */
    public String getExpen() {
        return expen;
    }

    /**
     * 设置支出
     *
     * @param expen 支出
     */
    public void setExpen(String expen) {
        this.expen = expen;
    }

    /**
     * 获取类型（1：消费赠送 2：活动赠送 3：兑换商品）
     *
     * @return TYPE - 类型（1：消费赠送 2：活动赠送 3：兑换商品）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型（1：消费赠送 2：活动赠送 3：兑换商品）
     *
     * @param type 类型（1：消费赠送 2：活动赠送 3：兑换商品）
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取关联订单
     *
     * @return RELATION_ID - 关联订单
     */
    public String getRelationId() {
        return relationId;
    }

    /**
     * 设置关联订单
     *
     * @param relationId 关联订单
     */
    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    /**
     * 获取账号ID
     *
     * @return CUST_ID - 账号ID
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置账号ID
     *
     * @param custId 账号ID
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取是否删除
     *
     * @return DELETED - 是否删除
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除
     *
     * @param deleted 是否删除
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}