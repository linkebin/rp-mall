package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cust_account")
public class CustAccount {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 编号
     */
    @Column(name = "CUST_CODE")
    private String custCode;

    /**
     * 客户名称
     */
    @Column(name = "CUST_NAME")
    private String custName;

    /**
     * OPENID
     */
    @Column(name = "OPENID")
    private String openid;

    /**
     * 微信昵称
     */
    @Column(name = "NICK_NAME")
    private String nickName;

    /**
     * 姓名/联系人
     */
    @Column(name = "CON_NAME")
    private String conName;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 密码
     */
    @Column(name = "CUST_PASS")
    private String custPass;

    /**
     * 客户来源 
     */
    @Column(name = "CUST_SOURCE")
    private Integer custSource;

    /**
     * 客户类型
     */
    @Column(name = "CUST_TYPE")
    private Integer custType;

    /**
     * 手机号码
     */
    @Column(name = "MOBILE")
    private String mobile;

    /**
     * 邮箱
     */
    @Column(name = "EMAIL")
    private String email;

    /**
     * 地址
     */
    @Column(name = "ADDR")
    private String addr;

    /**
     * 头像
     */
    @Column(name = "HEAD_IMG")
    private String headImg;

    /**
     * 状态 0 不可用 1 可用
     */
    @Column(name = "STATUS")
    private Integer status;

    /**
     * 性别 0 女 1 男
     */
    @Column(name = "SEX")
    private Integer sex;

    /**
     * 籍贯
     */
    @Column(name = "NATIVE_PLACE")
    private String nativePlace;

    /**
     * 证件类型
     */
    @Column(name = "C_TYPE")
    private String cType;

    /**
     * 证件号码
     */
    @Column(name = "C_MUM")
    private String cMum;

    /**
     * 证件图片
     */
    @Column(name = "C_IMG")
    private String cImg;

    /**
     *  0 未婚 1 已婚
     */
    @Column(name = "M_STATUS")
    private Integer mStatus;

    /**
     * 地理位置
     */
    @Column(name = "LOCATION")
    private String location;

    /**
     * 银行卡信息
     */
    @Column(name = "BANK_INFO")
    private String bankInfo;

    /**
     * 银行卡号
     */
    @Column(name = "BANK_NUM")
    private String bankNum;

    /**
     * 积分
     */
    @Column(name = "BONUS_POINTS")
    private Short bonusPoints;

    /**
     * 金额校验
     */
    @Column(name = "ENCRYPT")
    private String encrypt;

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
     * 短信提醒(0：否 1要)
     */
    @Column(name = "REMIND")
    private Integer remind;

    /**
     * 获取主键ID
     *
     * @return ID_ - 主键ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取编号
     *
     * @return CUST_CODE - 编号
     */
    public String getCustCode() {
        return custCode;
    }

    /**
     * 设置编号
     *
     * @param custCode 编号
     */
    public void setCustCode(String custCode) {
        this.custCode = custCode;
    }

    /**
     * 获取客户名称
     *
     * @return CUST_NAME - 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 设置客户名称
     *
     * @param custName 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * 获取OPENID
     *
     * @return OPENID - OPENID
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置OPENID
     *
     * @param openid OPENID
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 获取微信昵称
     *
     * @return NICK_NAME - 微信昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置微信昵称
     *
     * @param nickName 微信昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取姓名/联系人
     *
     * @return CON_NAME - 姓名/联系人
     */
    public String getConName() {
        return conName;
    }

    /**
     * 设置姓名/联系人
     *
     * @param conName 姓名/联系人
     */
    public void setConName(String conName) {
        this.conName = conName;
    }

    /**
     * 获取账号
     *
     * @return ACCOUNT - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return CUST_PASS - 密码
     */
    public String getCustPass() {
        return custPass;
    }

    /**
     * 设置密码
     *
     * @param custPass 密码
     */
    public void setCustPass(String custPass) {
        this.custPass = custPass;
    }

    /**
     * 获取客户来源 
     *
     * @return CUST_SOURCE - 客户来源 
     */
    public Integer getCustSource() {
        return custSource;
    }

    /**
     * 设置客户来源 
     *
     * @param custSource 客户来源 
     */
    public void setCustSource(Integer custSource) {
        this.custSource = custSource;
    }

    /**
     * 获取客户类型
     *
     * @return CUST_TYPE - 客户类型
     */
    public Integer getCustType() {
        return custType;
    }

    /**
     * 设置客户类型
     *
     * @param custType 客户类型
     */
    public void setCustType(Integer custType) {
        this.custType = custType;
    }

    /**
     * 获取手机号码
     *
     * @return MOBILE - 手机号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号码
     *
     * @param mobile 手机号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱
     *
     * @return EMAIL - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取地址
     *
     * @return ADDR - 地址
     */
    public String getAddr() {
        return addr;
    }

    /**
     * 设置地址
     *
     * @param addr 地址
     */
    public void setAddr(String addr) {
        this.addr = addr;
    }

    /**
     * 获取头像
     *
     * @return HEAD_IMG - 头像
     */
    public String getHeadImg() {
        return headImg;
    }

    /**
     * 设置头像
     *
     * @param headImg 头像
     */
    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }

    /**
     * 获取状态 0 不可用 1 可用
     *
     * @return STATUS - 状态 0 不可用 1 可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0 不可用 1 可用
     *
     * @param status 状态 0 不可用 1 可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取性别 0 女 1 男
     *
     * @return SEX - 性别 0 女 1 男
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 0 女 1 男
     *
     * @param sex 性别 0 女 1 男
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取籍贯
     *
     * @return NATIVE_PLACE - 籍贯
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置籍贯
     *
     * @param nativePlace 籍贯
     */
    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    /**
     * 获取证件类型
     *
     * @return C_TYPE - 证件类型
     */
    public String getcType() {
        return cType;
    }

    /**
     * 设置证件类型
     *
     * @param cType 证件类型
     */
    public void setcType(String cType) {
        this.cType = cType;
    }

    /**
     * 获取证件号码
     *
     * @return C_MUM - 证件号码
     */
    public String getcMum() {
        return cMum;
    }

    /**
     * 设置证件号码
     *
     * @param cMum 证件号码
     */
    public void setcMum(String cMum) {
        this.cMum = cMum;
    }

    /**
     * 获取证件图片
     *
     * @return C_IMG - 证件图片
     */
    public String getcImg() {
        return cImg;
    }

    /**
     * 设置证件图片
     *
     * @param cImg 证件图片
     */
    public void setcImg(String cImg) {
        this.cImg = cImg;
    }

    /**
     * 获取 0 未婚 1 已婚
     *
     * @return M_STATUS -  0 未婚 1 已婚
     */
    public Integer getmStatus() {
        return mStatus;
    }

    /**
     * 设置 0 未婚 1 已婚
     *
     * @param mStatus  0 未婚 1 已婚
     */
    public void setmStatus(Integer mStatus) {
        this.mStatus = mStatus;
    }

    /**
     * 获取地理位置
     *
     * @return LOCATION - 地理位置
     */
    public String getLocation() {
        return location;
    }

    /**
     * 设置地理位置
     *
     * @param location 地理位置
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * 获取银行卡信息
     *
     * @return BANK_INFO - 银行卡信息
     */
    public String getBankInfo() {
        return bankInfo;
    }

    /**
     * 设置银行卡信息
     *
     * @param bankInfo 银行卡信息
     */
    public void setBankInfo(String bankInfo) {
        this.bankInfo = bankInfo;
    }

    /**
     * 获取银行卡号
     *
     * @return BANK_NUM - 银行卡号
     */
    public String getBankNum() {
        return bankNum;
    }

    /**
     * 设置银行卡号
     *
     * @param bankNum 银行卡号
     */
    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    /**
     * 获取积分
     *
     * @return BONUS_POINTS - 积分
     */
    public Short getBonusPoints() {
        return bonusPoints;
    }

    /**
     * 设置积分
     *
     * @param bonusPoints 积分
     */
    public void setBonusPoints(Short bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    /**
     * 获取金额校验
     *
     * @return ENCRYPT - 金额校验
     */
    public String getEncrypt() {
        return encrypt;
    }

    /**
     * 设置金额校验
     *
     * @param encrypt 金额校验
     */
    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
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
     * 获取短信提醒(0：否 1要)
     *
     * @return REMIND - 短信提醒(0：否 1要)
     */
    public Integer getRemind() {
        return remind;
    }

    /**
     * 设置短信提醒(0：否 1要)
     *
     * @param remind 短信提醒(0：否 1要)
     */
    public void setRemind(Integer remind) {
        this.remind = remind;
    }
}