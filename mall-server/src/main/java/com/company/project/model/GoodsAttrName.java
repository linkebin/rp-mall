package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_attr_name")
public class GoodsAttrName {
    /**
     * id
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 编号
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 商品
     */
    @Column(name = "GOODS_ID")
    private String goodsId;

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
     * 获取编号
     *
     * @return CODE - 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取商品
     *
     * @return GOODS_ID - 商品
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品
     *
     * @param goodsId 商品
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}