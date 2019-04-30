package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_attr_value")
public class GoodsAttrValue {
    /**
     * ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 属性名ID
     */
    @Column(name = "ATTR_ID")
    private String attrId;

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
     * 获取属性名ID
     *
     * @return ATTR_ID - 属性名ID
     */
    public String getAttrId() {
        return attrId;
    }

    /**
     * 设置属性名ID
     *
     * @param attrId 属性名ID
     */
    public void setAttrId(String attrId) {
        this.attrId = attrId;
    }
}