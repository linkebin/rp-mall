package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "behavior_log")
public class BehaviorLog {
    /**
     * ID_
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 操作类型
     */
    @Column(name = "OPER_TYPE")
    private String operType;

    /**
     * 操作内容
     */
    @Column(name = "OPER_INFO")
    private String operInfo;

    /**
     * 操作人姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 操作时间
     */
    @Column(name = "OPER_TIME")
    private Date operTime;

    /**
     * 操作人id
     */
    @Column(name = "USER_ID")
    private String userId;

    /**
     * 操作时长
     */
    @Column(name = "OPER_WHEN_LONG")
    private String operWhenLong;

    /**
     * 请求类型
     */
    @Column(name = "URL_TYPE")
    private String urlType;

    /**
     * 请求方法
     */
    @Column(name = "URL_METHOD")
    private String urlMethod;

    /**
     * SESSION_ID
     */
    @Column(name = "SESSION_ID")
    private String sessionId;

    /**
     * 访问url
     */
    @Column(name = "OPER_URL")
    private String operUrl;

    /**
     * 请求参数
     */
    @Column(name = "URL_PARAM")
    private String urlParam;

    /**
     * 请求结果
     */
    @Column(name = "URL_RESULT")
    private String urlResult;

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
     * 获取操作类型
     *
     * @return OPER_TYPE - 操作类型
     */
    public String getOperType() {
        return operType;
    }

    /**
     * 设置操作类型
     *
     * @param operType 操作类型
     */
    public void setOperType(String operType) {
        this.operType = operType;
    }

    /**
     * 获取操作内容
     *
     * @return OPER_INFO - 操作内容
     */
    public String getOperInfo() {
        return operInfo;
    }

    /**
     * 设置操作内容
     *
     * @param operInfo 操作内容
     */
    public void setOperInfo(String operInfo) {
        this.operInfo = operInfo;
    }

    /**
     * 获取操作人姓名
     *
     * @return USER_NAME - 操作人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置操作人姓名
     *
     * @param userName 操作人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取操作时间
     *
     * @return OPER_TIME - 操作时间
     */
    public Date getOperTime() {
        return operTime;
    }

    /**
     * 设置操作时间
     *
     * @param operTime 操作时间
     */
    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    /**
     * 获取操作人id
     *
     * @return USER_ID - 操作人id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置操作人id
     *
     * @param userId 操作人id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取操作时长
     *
     * @return OPER_WHEN_LONG - 操作时长
     */
    public String getOperWhenLong() {
        return operWhenLong;
    }

    /**
     * 设置操作时长
     *
     * @param operWhenLong 操作时长
     */
    public void setOperWhenLong(String operWhenLong) {
        this.operWhenLong = operWhenLong;
    }

    /**
     * 获取请求类型
     *
     * @return URL_TYPE - 请求类型
     */
    public String getUrlType() {
        return urlType;
    }

    /**
     * 设置请求类型
     *
     * @param urlType 请求类型
     */
    public void setUrlType(String urlType) {
        this.urlType = urlType;
    }

    /**
     * 获取请求方法
     *
     * @return URL_METHOD - 请求方法
     */
    public String getUrlMethod() {
        return urlMethod;
    }

    /**
     * 设置请求方法
     *
     * @param urlMethod 请求方法
     */
    public void setUrlMethod(String urlMethod) {
        this.urlMethod = urlMethod;
    }

    /**
     * 获取SESSION_ID
     *
     * @return SESSION_ID - SESSION_ID
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * 设置SESSION_ID
     *
     * @param sessionId SESSION_ID
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * 获取访问url
     *
     * @return OPER_URL - 访问url
     */
    public String getOperUrl() {
        return operUrl;
    }

    /**
     * 设置访问url
     *
     * @param operUrl 访问url
     */
    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    /**
     * 获取请求参数
     *
     * @return URL_PARAM - 请求参数
     */
    public String getUrlParam() {
        return urlParam;
    }

    /**
     * 设置请求参数
     *
     * @param urlParam 请求参数
     */
    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }

    /**
     * 获取请求结果
     *
     * @return URL_RESULT - 请求结果
     */
    public String getUrlResult() {
        return urlResult;
    }

    /**
     * 设置请求结果
     *
     * @param urlResult 请求结果
     */
    public void setUrlResult(String urlResult) {
        this.urlResult = urlResult;
    }
}