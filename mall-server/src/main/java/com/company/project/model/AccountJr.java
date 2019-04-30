package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "account_jr")
public class AccountJr {
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
    private Short income;

    /**
     * 支出
     */
    @Column(name = "EXPEN")
    private Short expen;

    /**
     * 类型
     */
    @Column(name = "TYPE")
    private Integer type;

    /**
     * 提成规则
     */
    @Column(name = "RULE")
    private String rule;

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
     * 是否入账(0：否 1：是)
     */
    @Column(name = "STATUS")
    private Integer status;

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
    public Short getIncome() {
        return income;
    }

    /**
     * 设置收入
     *
     * @param income 收入
     */
    public void setIncome(Short income) {
        this.income = income;
    }

    /**
     * 获取支出
     *
     * @return EXPEN - 支出
     */
    public Short getExpen() {
        return expen;
    }

    /**
     * 设置支出
     *
     * @param expen 支出
     */
    public void setExpen(Short expen) {
        this.expen = expen;
    }

    /**
     * 获取类型
     *
     * @return TYPE - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取提成规则
     *
     * @return RULE - 提成规则
     */
    public String getRule() {
        return rule;
    }

    /**
     * 设置提成规则
     *
     * @param rule 提成规则
     */
    public void setRule(String rule) {
        this.rule = rule;
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

    /**
     * 获取是否入账(0：否 1：是)
     *
     * @return STATUS - 是否入账(0：否 1：是)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否入账(0：否 1：是)
     *
     * @param status 是否入账(0：否 1：是)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}