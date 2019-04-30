package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "order_de")
public class OrderDe {
    /**
     * id
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 对应订单
     */
    @Column(name = "ORDER_ID")
    private String orderId;

    /**
     * 商品编号
     */
    @Column(name = "GOODS_CODE")
    private String goodsCode;

    /**
     * 商品名称
     */
    @Column(name = "GOODS_NAME")
    private String goodsName;

    /**
     * 规格型号
     */
    @Column(name = "GOODS_MD")
    private String goodsMd;

    /**
     * 商品
     */
    @Column(name = "GOODS")
    private String goods;

    /**
     * 价格
     */
    @Column(name = "PRICE")
    private String price;

    /**
     * 数量
     */
    @Column(name = "NUM")
    private Integer num;

    /**
     * 折扣
     */
    @Column(name = "DS")
    private Short ds;

    /**
     * 金额
     */
    @Column(name = "SUM")
    private Short sum;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 获取id
     *
     * @return ID_ - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取对应订单
     *
     * @return ORDER_ID - 对应订单
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置对应订单
     *
     * @param orderId 对应订单
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取商品编号
     *
     * @return GOODS_CODE - 商品编号
     */
    public String getGoodsCode() {
        return goodsCode;
    }

    /**
     * 设置商品编号
     *
     * @param goodsCode 商品编号
     */
    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    /**
     * 获取商品名称
     *
     * @return GOODS_NAME - 商品名称
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * 设置商品名称
     *
     * @param goodsName 商品名称
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    /**
     * 获取规格型号
     *
     * @return GOODS_MD - 规格型号
     */
    public String getGoodsMd() {
        return goodsMd;
    }

    /**
     * 设置规格型号
     *
     * @param goodsMd 规格型号
     */
    public void setGoodsMd(String goodsMd) {
        this.goodsMd = goodsMd;
    }

    /**
     * 获取商品
     *
     * @return GOODS - 商品
     */
    public String getGoods() {
        return goods;
    }

    /**
     * 设置商品
     *
     * @param goods 商品
     */
    public void setGoods(String goods) {
        this.goods = goods;
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

    /**
     * 获取数量
     *
     * @return NUM - 数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置数量
     *
     * @param num 数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取折扣
     *
     * @return DS - 折扣
     */
    public Short getDs() {
        return ds;
    }

    /**
     * 设置折扣
     *
     * @param ds 折扣
     */
    public void setDs(Short ds) {
        this.ds = ds;
    }

    /**
     * 获取金额
     *
     * @return SUM - 金额
     */
    public Short getSum() {
        return sum;
    }

    /**
     * 设置金额
     *
     * @param sum 金额
     */
    public void setSum(Short sum) {
        this.sum = sum;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}