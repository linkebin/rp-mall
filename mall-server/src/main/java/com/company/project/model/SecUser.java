package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sec_user")
public class SecUser {
    /**
     * 主键ID
     */
    @Id
    @Column(name = "ID_")
    private String id;

    /**
     * 用户名称
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 密码
     */
    @Column(name = "USER_PASS")
    private String userPass;

    /**
     * 所属组织
     */
    @Column(name = "ORG_ID")
    private String orgId;

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
     *  0 未婚 1 已婚
     */
    @Column(name = "M_STATUS")
    private Integer mStatus;

    /**
     * 创建人
     */
    @Column(name = "CREATOR")
    private String creator;

    /**
     * 账号类型(0:内部用户、1：外部用户)
     */
    @Column(name = "ACCOUNT_TYPE")
    private Integer accountType;

    /**
     * 备用字段
     */
    @Column(name = "STANDBY1")
    private String standby1;

    /**
     * 备用字段
     */
    @Column(name = "STANDBY2")
    private String standby2;

    /**
     * 备用字段
     */
    @Column(name = "STANDBY3")
    private String standby3;

    /**
     * 备用字段
     */
    @Column(name = "STANDBY4")
    private String standby4;

    /**
     * 备用字段
     */
    @Column(name = "STANDBY5")
    private String standby5;

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
     * 获取用户名称
     *
     * @return USER_NAME - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * @return USER_PASS - 密码
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 设置密码
     *
     * @param userPass 密码
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * 获取所属组织
     *
     * @return ORG_ID - 所属组织
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置所属组织
     *
     * @param orgId 所属组织
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
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
     * 获取账号类型(0:内部用户、1：外部用户)
     *
     * @return ACCOUNT_TYPE - 账号类型(0:内部用户、1：外部用户)
     */
    public Integer getAccountType() {
        return accountType;
    }

    /**
     * 设置账号类型(0:内部用户、1：外部用户)
     *
     * @param accountType 账号类型(0:内部用户、1：外部用户)
     */
    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    /**
     * 获取备用字段
     *
     * @return STANDBY1 - 备用字段
     */
    public String getStandby1() {
        return standby1;
    }

    /**
     * 设置备用字段
     *
     * @param standby1 备用字段
     */
    public void setStandby1(String standby1) {
        this.standby1 = standby1;
    }

    /**
     * 获取备用字段
     *
     * @return STANDBY2 - 备用字段
     */
    public String getStandby2() {
        return standby2;
    }

    /**
     * 设置备用字段
     *
     * @param standby2 备用字段
     */
    public void setStandby2(String standby2) {
        this.standby2 = standby2;
    }

    /**
     * 获取备用字段
     *
     * @return STANDBY3 - 备用字段
     */
    public String getStandby3() {
        return standby3;
    }

    /**
     * 设置备用字段
     *
     * @param standby3 备用字段
     */
    public void setStandby3(String standby3) {
        this.standby3 = standby3;
    }

    /**
     * 获取备用字段
     *
     * @return STANDBY4 - 备用字段
     */
    public String getStandby4() {
        return standby4;
    }

    /**
     * 设置备用字段
     *
     * @param standby4 备用字段
     */
    public void setStandby4(String standby4) {
        this.standby4 = standby4;
    }

    /**
     * 获取备用字段
     *
     * @return STANDBY5 - 备用字段
     */
    public String getStandby5() {
        return standby5;
    }

    /**
     * 设置备用字段
     *
     * @param standby5 备用字段
     */
    public void setStandby5(String standby5) {
        this.standby5 = standby5;
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
}