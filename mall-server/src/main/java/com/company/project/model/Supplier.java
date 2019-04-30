package com.company.project.model;

import javax.persistence.*;

public class Supplier {
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 名字
     */
    @Column(name = "NAME")
    private String name;

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
     * 获取名字
     *
     * @return NAME - 名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name 名字
     */
    public void setName(String name) {
        this.name = name;
    }
}