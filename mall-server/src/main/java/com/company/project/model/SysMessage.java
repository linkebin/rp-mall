package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_message")
public class SysMessage {
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 发送者编号
     */
    @Column(name = "SEND_ID")
    private String sendId;

    /**
     * 接受者编号
     */
    @Column(name = "REC_ID")
    private String recId;

    /**
     * 消息标题
     */
    @Column(name = "MSG_TITLE")
    private String msgTitle;

    /**
     * 站内信内容
     */
    @Column(name = "MESSAGE")
    private String message;

    /**
     * 站内信的查看状态
     */
    @Column(name = "RED_STATUS")
    private Integer redStatus;

    /**
     * 发送时间
     */
    @Column(name = "P_DATE")
    private Date pDate;

    /**
     * 删除标记
     */
    @Column(name = "DELETED")
    private String deleted;

    /**
     * 消息链接
     */
    @Column(name = "MSG_URL")
    private String msgUrl;

    /**
     * 消息类型
     */
    @Column(name = "MSG_TYPE")
    private String msgType;

    /**
     * 消息对应对象ID
     */
    @Column(name = "OBJ_ID")
    private String objId;

    /**
     * 是否推送
     */
    @Column(name = "IS_PUSH")
    private Integer isPush;

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
     * 获取发送者编号
     *
     * @return SEND_ID - 发送者编号
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * 设置发送者编号
     *
     * @param sendId 发送者编号
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    /**
     * 获取接受者编号
     *
     * @return REC_ID - 接受者编号
     */
    public String getRecId() {
        return recId;
    }

    /**
     * 设置接受者编号
     *
     * @param recId 接受者编号
     */
    public void setRecId(String recId) {
        this.recId = recId;
    }

    /**
     * 获取消息标题
     *
     * @return MSG_TITLE - 消息标题
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * 设置消息标题
     *
     * @param msgTitle 消息标题
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    /**
     * 获取站内信内容
     *
     * @return MESSAGE - 站内信内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置站内信内容
     *
     * @param message 站内信内容
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取站内信的查看状态
     *
     * @return RED_STATUS - 站内信的查看状态
     */
    public Integer getRedStatus() {
        return redStatus;
    }

    /**
     * 设置站内信的查看状态
     *
     * @param redStatus 站内信的查看状态
     */
    public void setRedStatus(Integer redStatus) {
        this.redStatus = redStatus;
    }

    /**
     * 获取发送时间
     *
     * @return P_DATE - 发送时间
     */
    public Date getpDate() {
        return pDate;
    }

    /**
     * 设置发送时间
     *
     * @param pDate 发送时间
     */
    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }

    /**
     * 获取删除标记
     *
     * @return DELETED - 删除标记
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * 设置删除标记
     *
     * @param deleted 删除标记
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    /**
     * 获取消息链接
     *
     * @return MSG_URL - 消息链接
     */
    public String getMsgUrl() {
        return msgUrl;
    }

    /**
     * 设置消息链接
     *
     * @param msgUrl 消息链接
     */
    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl;
    }

    /**
     * 获取消息类型
     *
     * @return MSG_TYPE - 消息类型
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型
     *
     * @param msgType 消息类型
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    /**
     * 获取消息对应对象ID
     *
     * @return OBJ_ID - 消息对应对象ID
     */
    public String getObjId() {
        return objId;
    }

    /**
     * 设置消息对应对象ID
     *
     * @param objId 消息对应对象ID
     */
    public void setObjId(String objId) {
        this.objId = objId;
    }

    /**
     * 获取是否推送
     *
     * @return IS_PUSH - 是否推送
     */
    public Integer getIsPush() {
        return isPush;
    }

    /**
     * 设置是否推送
     *
     * @param isPush 是否推送
     */
    public void setIsPush(Integer isPush) {
        this.isPush = isPush;
    }
}