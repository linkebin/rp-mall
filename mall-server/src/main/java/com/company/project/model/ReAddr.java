package com.company.project.model;

import javax.persistence.*;

@Table(name = "re_addr")
public class ReAddr {
    /**
     * ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 客户id
     */
    @Column(name = "CUST_ID")
    private String custId;

    /**
     * 收货地址
     */
    @Column(name = "ADDR")
    private String addr;

    /**
     * 收货人
     */
    @Column(name = "CONN_NAME")
    private String connName;

    /**
     * 联系电话
     */
    @Column(name = "CONN_TELL")
    private String connTell;

    /**
     * 是否默认
     */
    @Column(name = "IS_DEFAULT")
    private Integer isDefault;

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
     * 获取客户id
     *
     * @return CUST_ID - 客户id
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置客户id
     *
     * @param custId 客户id
     */
    public void setCustId(String custId) {
        this.custId = custId;
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
     * 获取收货人
     *
     * @return CONN_NAME - 收货人
     */
    public String getConnName() {
        return connName;
    }

    /**
     * 设置收货人
     *
     * @param connName 收货人
     */
    public void setConnName(String connName) {
        this.connName = connName;
    }

    /**
     * 获取联系电话
     *
     * @return CONN_TELL - 联系电话
     */
    public String getConnTell() {
        return connTell;
    }

    /**
     * 设置联系电话
     *
     * @param connTell 联系电话
     */
    public void setConnTell(String connTell) {
        this.connTell = connTell;
    }

    /**
     * 获取是否默认
     *
     * @return IS_DEFAULT - 是否默认
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认
     *
     * @param isDefault 是否默认
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
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