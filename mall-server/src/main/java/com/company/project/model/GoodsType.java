package com.company.project.model;

import javax.persistence.*;

@Table(name = "goods_type")
public class GoodsType {
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
     * 分类名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 父级品类
     */
    @Column(name = "F_ID")
    private String fId;

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
     * 获取分类名称
     *
     * @return NAME - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取父级品类
     *
     * @return F_ID - 父级品类
     */
    public String getfId() {
        return fId;
    }

    /**
     * 设置父级品类
     *
     * @param fId 父级品类
     */
    public void setfId(String fId) {
        this.fId = fId;
    }
}