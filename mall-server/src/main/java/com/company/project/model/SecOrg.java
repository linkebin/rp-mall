package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_org")
public class SecOrg {
    /**
     * 组织ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 组织编码
     */
    @Column(name = "ORG_CODE")
    private String orgCode;

    /**
     * 组织名称
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 父组织ID
     */
    @Column(name = "PARENT_ID")
    private String parentId;

    /**
     * 创建人
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 删除标识
     */
    @Column(name = "DELETED")
    private Integer deleted;

    /**
     * 负责人ID
     */
    @Column(name = "RESB_USER")
    private String resbUser;

    /**
     * 说明
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 获取组织ID
     *
     * @return ID_ - 组织ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置组织ID
     *
     * @param id 组织ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取组织编码
     *
     * @return ORG_CODE - 组织编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置组织编码
     *
     * @param orgCode 组织编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取组织名称
     *
     * @return ORG_NAME - 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名称
     *
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取父组织ID
     *
     * @return PARENT_ID - 父组织ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置父组织ID
     *
     * @param parentId 父组织ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取创建人
     *
     * @return CREATOR - 创建人
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(String creator) {
        this.creator = creator;
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

    /**
     * 获取删除标识
     *
     * @return DELETED - 删除标识
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标识
     *
     * @param deleted 删除标识
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取负责人ID
     *
     * @return RESB_USER - 负责人ID
     */
    public String getResbUser() {
        return resbUser;
    }

    /**
     * 设置负责人ID
     *
     * @param resbUser 负责人ID
     */
    public void setResbUser(String resbUser) {
        this.resbUser = resbUser;
    }

    /**
     * 获取说明
     *
     * @return REMARK - 说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置说明
     *
     * @param remark 说明
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
}