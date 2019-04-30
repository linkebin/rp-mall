package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_img")
public class GoodsImg {
    /**
     * id
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 商品id
     */
    @Column(name = "GOODS_ID")
    private String goodsId;

    /**
     * 商品图片
     */
    @Column(name = "IMG")
    private String img;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

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
     * 获取商品id
     *
     * @return GOODS_ID - 商品id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取商品图片
     *
     * @return IMG - 商品图片
     */
    public String getImg() {
        return img;
    }

    /**
     * 设置商品图片
     *
     * @param img 商品图片
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}