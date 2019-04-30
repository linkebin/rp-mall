package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "notice_administration")
public class NoticeAdministration {
    /**
     * ID_
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 编号
     */
    @Column(name = "NOTICE_CODE")
    private String noticeCode;

    /**
     * 发布者
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 可见权限
     */
    @Column(name = "VISIBLE_PERMISSIONS")
    private String visiblePermissions;

    /**
     * 发布时间
     */
    @Column(name = "RELEASE_TIME")
    private Date releaseTime;

    /**
     * 结束时间
     */
    @Column(name = "END_TIME")
    private Date endTime;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 是否删除（0 否 1 是）
     */
    @Column(name = "DELETED")
    private Integer deleted;

    /**
     * 标题
     */
    @Column(name = "NOTICE_TITLE")
    private String noticeTitle;

    /**
     * 内容
     */
    @Column(name = "NOTICE_CONTENT")
    private String noticeContent;

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
     * 获取编号
     *
     * @return NOTICE_CODE - 编号
     */
    public String getNoticeCode() {
        return noticeCode;
    }

    /**
     * 设置编号
     *
     * @param noticeCode 编号
     */
    public void setNoticeCode(String noticeCode) {
        this.noticeCode = noticeCode;
    }

    /**
     * 获取发布者
     *
     * @return CREATOR - 发布者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置发布者
     *
     * @param creator 发布者
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取可见权限
     *
     * @return VISIBLE_PERMISSIONS - 可见权限
     */
    public String getVisiblePermissions() {
        return visiblePermissions;
    }

    /**
     * 设置可见权限
     *
     * @param visiblePermissions 可见权限
     */
    public void setVisiblePermissions(String visiblePermissions) {
        this.visiblePermissions = visiblePermissions;
    }

    /**
     * 获取发布时间
     *
     * @return RELEASE_TIME - 发布时间
     */
    public Date getReleaseTime() {
        return releaseTime;
    }

    /**
     * 设置发布时间
     *
     * @param releaseTime 发布时间
     */
    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    /**
     * 获取结束时间
     *
     * @return END_TIME - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
     * 获取是否删除（0 否 1 是）
     *
     * @return DELETED - 是否删除（0 否 1 是）
     */
    public Integer getDeleted() {
        return deleted;
    }

    /**
     * 设置是否删除（0 否 1 是）
     *
     * @param deleted 是否删除（0 否 1 是）
     */
    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取标题
     *
     * @return NOTICE_TITLE - 标题
     */
    public String getNoticeTitle() {
        return noticeTitle;
    }

    /**
     * 设置标题
     *
     * @param noticeTitle 标题
     */
    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    /**
     * 获取内容
     *
     * @return NOTICE_CONTENT - 内容
     */
    public String getNoticeContent() {
        return noticeContent;
    }

    /**
     * 设置内容
     *
     * @param noticeContent 内容
     */
    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }
}