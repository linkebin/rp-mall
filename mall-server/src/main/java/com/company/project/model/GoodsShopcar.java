package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_shopcar")
public class GoodsShopcar {
    /**
     * ID_
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 客户ID
     */
    @Column(name = "CUST_ID")
    private String custId;

    /**
     * 商品ID
     */
    @Column(name = "GOODS_ID")
    private String goodsId;

    /**
     * 数量
     */
    @Column(name = "NUMBER")
    private Integer number;

    /**
     * 商品属性
     */
    @Column(name = "GOOD_ATTR")
    private String goodAttr;

    /**
     * 价格
     */
    @Column(name = "PRICE")
    private String price;

    /**
     * 获取ID_
     *
     * @return ID_ - ID_
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID_
     *
     * @param id ID_
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取客户ID
     *
     * @return CUST_ID - 客户ID
     */
    public String getCustId() {
        return custId;
    }

    /**
     * 设置客户ID
     *
     * @param custId 客户ID
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * 获取商品ID
     *
     * @return GOODS_ID - 商品ID
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品ID
     *
     * @param goodsId 商品ID
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取数量
     *
     * @return NUMBER - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取商品属性
     *
     * @return GOOD_ATTR - 商品属性
     */
    public String getGoodAttr() {
        return goodAttr;
    }

    /**
     * 设置商品属性
     *
     * @param goodAttr 商品属性
     */
    public void setGoodAttr(String goodAttr) {
        this.goodAttr = goodAttr;
    }

    /**
     * 获取价格
     *
     * @return PRICE - 价格
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(String price) {
        this.price = price;
    }
}