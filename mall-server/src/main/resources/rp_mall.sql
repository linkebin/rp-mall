/*
Navicat MySQL Data Transfer

Source Server         : 本机mysql
Source Server Version : 50712
Source Host           : localhost:3306
Source Database       : rp_mall

Target Server Type    : MYSQL
Target Server Version : 50712
File Encoding         : 65001

Date: 2019-04-30 15:25:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account_jr
-- ----------------------------
DROP TABLE IF EXISTS `account_jr`;
CREATE TABLE `account_jr` (
  `ID_` varchar(38) NOT NULL,
  `RUN_NUM` varchar(38) DEFAULT NULL COMMENT '流水号',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '时间',
  `INCOME` decimal(2,0) DEFAULT NULL COMMENT '收入',
  `EXPEN` decimal(2,0) DEFAULT NULL COMMENT '支出',
  `TYPE` int(11) DEFAULT NULL COMMENT '类型',
  `RULE` varchar(38) DEFAULT NULL COMMENT '提成规则',
  `RELATION_ID` varchar(38) DEFAULT NULL COMMENT '关联订单',
  `CUST_ID` varchar(38) DEFAULT NULL COMMENT '账号ID',
  `DELETED` varchar(38) DEFAULT NULL COMMENT '是否删除',
  `STATUS` int(11) DEFAULT NULL COMMENT '是否入账(0：否 1：是)',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of account_jr
-- ----------------------------

-- ----------------------------
-- Table structure for agency_account
-- ----------------------------
DROP TABLE IF EXISTS `agency_account`;
CREATE TABLE `agency_account` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `AGENCY_CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `AGENCY_NAME` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `OPENID` varchar(50) DEFAULT NULL COMMENT 'OPENID',
  `NICK_NAME` varchar(50) DEFAULT NULL COMMENT '微信昵称',
  `CON_NAME` varchar(38) DEFAULT NULL COMMENT '姓名/联系人',
  `ACCOUNT` varchar(38) DEFAULT NULL COMMENT '账号',
  `AGENCY_PASS` varchar(50) DEFAULT NULL COMMENT '密码',
  `AGENCY_SOURCE` int(11) DEFAULT NULL COMMENT '客户来源 ',
  `AGENCY_TYPE` int(11) DEFAULT NULL COMMENT '客户类型',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `ADDR` varchar(200) DEFAULT NULL COMMENT '地址',
  `HEAD_IMG` varchar(200) DEFAULT NULL COMMENT '头像',
  `STATUS` int(11) DEFAULT '1' COMMENT '状态 0 不可用 1 可用',
  `SEX` int(11) DEFAULT NULL COMMENT '性别 0 女 1 男',
  `NATIVE_PLACE` varchar(38) DEFAULT NULL COMMENT '籍贯',
  `C_TYPE` varchar(38) DEFAULT NULL COMMENT '证件类型',
  `C_MUM` varchar(38) DEFAULT NULL COMMENT '证件号码',
  `C_IMG` varchar(500) DEFAULT NULL COMMENT '证件图片',
  `M_STATUS` int(11) DEFAULT NULL COMMENT ' 0 未婚 1 已婚',
  `LOCATION` varchar(38) DEFAULT NULL COMMENT '地理位置',
  `BANK_INFO` varchar(50) DEFAULT NULL COMMENT '银行卡信息',
  `BANK_NUM` varchar(50) DEFAULT NULL COMMENT '银行卡号',
  `BONUS_POINTS` decimal(2,0) DEFAULT NULL COMMENT '积分',
  `ENCRYPT` varchar(38) DEFAULT NULL COMMENT '金额校验',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(11) DEFAULT '0' COMMENT '删除标识',
  `REMIND` int(11) DEFAULT NULL COMMENT '短信提醒(0：否 1要)',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of agency_account
-- ----------------------------

-- ----------------------------
-- Table structure for behavior_log
-- ----------------------------
DROP TABLE IF EXISTS `behavior_log`;
CREATE TABLE `behavior_log` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID_',
  `OPER_TYPE` varchar(38) DEFAULT NULL COMMENT '操作类型',
  `OPER_INFO` varchar(38) DEFAULT NULL COMMENT '操作内容',
  `USER_NAME` varchar(38) DEFAULT NULL COMMENT '操作人姓名',
  `OPER_TIME` datetime DEFAULT NULL COMMENT '操作时间',
  `USER_ID` varchar(38) DEFAULT NULL COMMENT '操作人id',
  `OPER_URL` text COMMENT '访问url',
  `OPER_WHEN_LONG` varchar(38) DEFAULT NULL COMMENT '操作时长',
  `URL_TYPE` varchar(38) DEFAULT NULL COMMENT '请求类型',
  `URL_METHOD` varchar(200) DEFAULT NULL COMMENT '请求方法',
  `URL_PARAM` text COMMENT '请求参数',
  `URL_RESULT` text COMMENT '请求结果',
  `SESSION_ID` varchar(200) DEFAULT NULL COMMENT 'SESSION_ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户行为日志';

-- ----------------------------
-- Records of behavior_log
-- ----------------------------

-- ----------------------------
-- Table structure for bonus_points_jr
-- ----------------------------
DROP TABLE IF EXISTS `bonus_points_jr`;
CREATE TABLE `bonus_points_jr` (
  `ID_` varchar(38) NOT NULL,
  `RUN_NUM` varchar(38) DEFAULT NULL COMMENT '流水号',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '时间',
  `INCOME` varchar(38) DEFAULT NULL COMMENT '收入',
  `EXPEN` varchar(38) DEFAULT NULL COMMENT '支出',
  `TYPE` int(11) DEFAULT NULL COMMENT '类型（1：消费赠送 2：活动赠送 3：兑换商品）',
  `RELATION_ID` varchar(38) DEFAULT NULL COMMENT '关联订单',
  `CUST_ID` varchar(38) DEFAULT NULL COMMENT '账号ID',
  `DELETED` varchar(38) DEFAULT NULL COMMENT '是否删除',
  PRIMARY KEY (`ID_`),
  KEY `FK_Reference_5` (`CUST_ID`),
  CONSTRAINT `FK_Reference_5` FOREIGN KEY (`CUST_ID`) REFERENCES `cust_account` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of bonus_points_jr
-- ----------------------------

-- ----------------------------
-- Table structure for cust_account
-- ----------------------------
DROP TABLE IF EXISTS `cust_account`;
CREATE TABLE `cust_account` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `CUST_CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `CUST_NAME` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `OPENID` varchar(50) DEFAULT NULL COMMENT 'OPENID',
  `NICK_NAME` varchar(50) DEFAULT NULL COMMENT '微信昵称',
  `CON_NAME` varchar(38) DEFAULT NULL COMMENT '姓名/联系人',
  `ACCOUNT` varchar(38) DEFAULT NULL COMMENT '账号',
  `CUST_PASS` varchar(50) DEFAULT NULL COMMENT '密码',
  `CUST_SOURCE` int(11) DEFAULT NULL COMMENT '客户来源 ',
  `CUST_TYPE` int(11) DEFAULT NULL COMMENT '客户类型',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `ADDR` varchar(200) DEFAULT NULL COMMENT '地址',
  `HEAD_IMG` varchar(200) DEFAULT NULL COMMENT '头像',
  `STATUS` int(11) DEFAULT '1' COMMENT '状态 0 不可用 1 可用',
  `SEX` int(11) DEFAULT NULL COMMENT '性别 0 女 1 男',
  `NATIVE_PLACE` varchar(38) DEFAULT NULL COMMENT '籍贯',
  `C_TYPE` varchar(38) DEFAULT NULL COMMENT '证件类型',
  `C_MUM` varchar(38) DEFAULT NULL COMMENT '证件号码',
  `C_IMG` varchar(500) DEFAULT NULL COMMENT '证件图片',
  `M_STATUS` int(11) DEFAULT NULL COMMENT ' 0 未婚 1 已婚',
  `LOCATION` varchar(38) DEFAULT NULL COMMENT '地理位置',
  `BANK_INFO` varchar(50) DEFAULT NULL COMMENT '银行卡信息',
  `BANK_NUM` varchar(50) DEFAULT NULL COMMENT '银行卡号',
  `BONUS_POINTS` decimal(2,0) DEFAULT NULL COMMENT '积分',
  `ENCRYPT` varchar(38) DEFAULT NULL COMMENT '金额校验',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(11) DEFAULT '0' COMMENT '删除标识',
  `REMIND` int(11) DEFAULT NULL COMMENT '短信提醒(0：否 1要)',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cust_account
-- ----------------------------

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID',
  `GOODS_CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `NAME` varchar(38) DEFAULT NULL COMMENT '名称',
  `TYPE` varchar(38) DEFAULT NULL COMMENT '类型',
  `NUM` int(11) DEFAULT NULL COMMENT '库存',
  `PICTURE` varchar(38) DEFAULT NULL COMMENT '主图',
  `REMARK` varchar(800) DEFAULT NULL COMMENT '介绍',
  `STATE` int(11) DEFAULT NULL COMMENT '上下架',
  `BRAND` varchar(38) DEFAULT NULL COMMENT '品牌',
  `DELETED` int(11) DEFAULT NULL COMMENT 'deleted',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods
-- ----------------------------

-- ----------------------------
-- Table structure for goods_attr_name
-- ----------------------------
DROP TABLE IF EXISTS `goods_attr_name`;
CREATE TABLE `goods_attr_name` (
  `ID_` varchar(38) NOT NULL COMMENT 'id',
  `CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `NAME` varchar(38) DEFAULT NULL COMMENT '名称',
  `GOODS_ID` varchar(38) DEFAULT NULL COMMENT '商品',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_attr_name
-- ----------------------------

-- ----------------------------
-- Table structure for goods_attr_value
-- ----------------------------
DROP TABLE IF EXISTS `goods_attr_value`;
CREATE TABLE `goods_attr_value` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID',
  `NAME` varchar(38) DEFAULT NULL COMMENT '名称',
  `ATTR_ID` varchar(38) DEFAULT NULL COMMENT '属性名ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_attr_value
-- ----------------------------

-- ----------------------------
-- Table structure for goods_img
-- ----------------------------
DROP TABLE IF EXISTS `goods_img`;
CREATE TABLE `goods_img` (
  `ID_` varchar(38) NOT NULL COMMENT 'id',
  `GOODS_ID` varchar(38) DEFAULT NULL COMMENT '商品id',
  `IMG` varchar(500) DEFAULT NULL COMMENT '商品图片',
  `SORT` int(11) DEFAULT NULL COMMENT '排序',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_img
-- ----------------------------

-- ----------------------------
-- Table structure for goods_shopcar
-- ----------------------------
DROP TABLE IF EXISTS `goods_shopcar`;
CREATE TABLE `goods_shopcar` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID_',
  `CUST_ID` varchar(38) DEFAULT NULL COMMENT '客户ID',
  `GOODS_ID` varchar(38) DEFAULT NULL COMMENT '商品ID',
  `NUMBER` int(11) DEFAULT NULL COMMENT '数量',
  `GOOD_ATTR` varchar(38) DEFAULT NULL COMMENT '商品属性',
  `PRICE` varchar(38) DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_shopcar
-- ----------------------------

-- ----------------------------
-- Table structure for goods_sku
-- ----------------------------
DROP TABLE IF EXISTS `goods_sku`;
CREATE TABLE `goods_sku` (
  `ID_` varchar(38) NOT NULL COMMENT 'id',
  `CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `GOODS_ID` varchar(38) DEFAULT NULL COMMENT '商品ID',
  `GOODS_ATTR` varchar(255) DEFAULT NULL COMMENT '商品属性',
  `PRICE` decimal(10,0) DEFAULT NULL COMMENT '零售价格',
  `PU_PRICE` decimal(10,0) DEFAULT NULL COMMENT '采购价格',
  `INTEGRAL` decimal(10,0) DEFAULT NULL COMMENT '积分价格',
  `STOCK` int(11) DEFAULT NULL COMMENT '库存',
  `BROK` decimal(10,0) DEFAULT NULL COMMENT '代理返佣',
  `AMOUNT` int(11) DEFAULT NULL COMMENT '销量',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_sku
-- ----------------------------

-- ----------------------------
-- Table structure for goods_type
-- ----------------------------
DROP TABLE IF EXISTS `goods_type`;
CREATE TABLE `goods_type` (
  `ID_` varchar(38) NOT NULL COMMENT 'id',
  `CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `NAME` varchar(38) DEFAULT NULL COMMENT '分类名称',
  `F_ID` varchar(38) DEFAULT NULL COMMENT '父级品类',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of goods_type
-- ----------------------------

-- ----------------------------
-- Table structure for notice_administration
-- ----------------------------
DROP TABLE IF EXISTS `notice_administration`;
CREATE TABLE `notice_administration` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID_',
  `NOTICE_CODE` varchar(38) DEFAULT NULL COMMENT '编号',
  `NOTICE_TITLE` text COMMENT '标题',
  `NOTICE_CONTENT` text COMMENT '内容',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '发布者',
  `VISIBLE_PERMISSIONS` varchar(38) DEFAULT NULL COMMENT '可见权限',
  `RELEASE_TIME` date DEFAULT NULL COMMENT '发布时间',
  `END_TIME` date DEFAULT NULL COMMENT '结束时间',
  `CREATE_TIME` date DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(2) DEFAULT NULL COMMENT '是否删除（0 否 1 是）',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='公告管理 ';

-- ----------------------------
-- Records of notice_administration
-- ----------------------------

-- ----------------------------
-- Table structure for order_de
-- ----------------------------
DROP TABLE IF EXISTS `order_de`;
CREATE TABLE `order_de` (
  `ID_` varchar(38) NOT NULL COMMENT 'id',
  `ORDER_ID` varchar(38) DEFAULT NULL COMMENT '对应订单',
  `GOODS_CODE` varchar(38) DEFAULT NULL COMMENT '商品编号',
  `GOODS_NAME` varchar(38) DEFAULT NULL COMMENT '商品名称',
  `GOODS_MD` varchar(38) DEFAULT NULL COMMENT '规格型号',
  `GOODS` varchar(38) DEFAULT NULL COMMENT '商品',
  `PRICE` varchar(38) DEFAULT NULL COMMENT '价格',
  `NUM` int(11) DEFAULT NULL COMMENT '数量',
  `DS` decimal(2,0) DEFAULT NULL COMMENT '折扣',
  `SUM` decimal(2,0) DEFAULT NULL COMMENT '金额',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order_de
-- ----------------------------

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID',
  `ORDER_CODE` varchar(38) DEFAULT NULL COMMENT '订单编号',
  `ORDER_TIME` datetime DEFAULT NULL COMMENT '订单时间',
  `PRDER_TYPE` varchar(38) DEFAULT NULL COMMENT '订单类型',
  `ORDER_SOURCE` varchar(38) DEFAULT NULL COMMENT '订单来源',
  `CUST_ID` varchar(38) DEFAULT NULL COMMENT '下单用户',
  `CUST_NAME` varchar(38) DEFAULT NULL COMMENT '下单用户名称',
  `AGENCY_ID` varchar(38) DEFAULT NULL COMMENT '代理ID',
  `AGENCY_NAME` varchar(38) DEFAULT NULL COMMENT '代理名称',
  `ORDER_STATE` varchar(38) DEFAULT NULL COMMENT '订单状态',
  `ORDER_SUM` decimal(2,0) DEFAULT NULL COMMENT '订单金额',
  `ADDR` varchar(255) DEFAULT NULL COMMENT '收货地址',
  `TAKE_TIME` datetime DEFAULT NULL COMMENT '收货时间',
  `DELETED` int(11) DEFAULT NULL COMMENT 'DELETED',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for pay_log
-- ----------------------------
DROP TABLE IF EXISTS `pay_log`;
CREATE TABLE `pay_log` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID',
  `ORDER_ID` varchar(38) DEFAULT NULL COMMENT '订单id',
  `ORDER_NUM` varchar(38) DEFAULT NULL COMMENT '订单号',
  `PAY_ID` varchar(38) DEFAULT NULL COMMENT '支付单号',
  `SUM` decimal(38,0) DEFAULT NULL COMMENT '金额',
  `PAY_TYPE` varchar(38) DEFAULT NULL COMMENT '支付方式',
  `RE_LOG` varchar(38) DEFAULT NULL COMMENT '返回日志',
  `PAY_TIME` datetime DEFAULT NULL COMMENT '支付时间',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pay_log
-- ----------------------------

-- ----------------------------
-- Table structure for re_addr
-- ----------------------------
DROP TABLE IF EXISTS `re_addr`;
CREATE TABLE `re_addr` (
  `ID_` varchar(38) NOT NULL COMMENT 'ID',
  `CUST_ID` varchar(38) DEFAULT NULL COMMENT '客户id',
  `ADDR` varchar(500) DEFAULT NULL COMMENT '收货地址',
  `CONN_NAME` varchar(38) DEFAULT NULL COMMENT '收货人',
  `CONN_TELL` varchar(38) DEFAULT NULL COMMENT '联系电话',
  `IS_DEFAULT` int(11) DEFAULT NULL COMMENT '是否默认',
  `DELETED` int(11) DEFAULT NULL COMMENT 'DELETED',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of re_addr
-- ----------------------------

-- ----------------------------
-- Table structure for sec_menu
-- ----------------------------
DROP TABLE IF EXISTS `sec_menu`;
CREATE TABLE `sec_menu` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `MENU_CODE` varchar(38) DEFAULT NULL COMMENT '菜单编码',
  `MENU_NAME` varchar(50) DEFAULT NULL COMMENT '菜单名称',
  `PARENT_ID` varchar(38) DEFAULT NULL COMMENT '父菜单ID',
  `MENU_TYPE` int(11) DEFAULT NULL COMMENT '菜单类型\n1:菜单\n2:按钮',
  `OPEN_TYPE` int(11) DEFAULT NULL COMMENT '打开方式\n1:模态窗口\n2:open新页面',
  `ICON` varchar(200) DEFAULT NULL COMMENT '菜单图标',
  `URL` varchar(200) DEFAULT '/' COMMENT '连接地址',
  `ENABLED` int(11) DEFAULT '1' COMMENT '是否可用  0否  1是',
  `SORT` int(11) DEFAULT NULL COMMENT '排序',
  `CREATOR` varchar(38) DEFAULT NULL,
  `CREATE_TIME` datetime DEFAULT NULL,
  `DELETED` int(11) DEFAULT '0',
  `STATE` varchar(1000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单管理（权限管理）';

-- ----------------------------
-- Records of sec_menu
-- ----------------------------

-- ----------------------------
-- Table structure for sec_menu_member
-- ----------------------------
DROP TABLE IF EXISTS `sec_menu_member`;
CREATE TABLE `sec_menu_member` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `USER_ID` varchar(38) DEFAULT NULL COMMENT '用户ID',
  `MENU_ID` varchar(38) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sec_menu_member
-- ----------------------------

-- ----------------------------
-- Table structure for sec_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `sec_menu_role`;
CREATE TABLE `sec_menu_role` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `ROLE_ID` varchar(38) DEFAULT NULL COMMENT '角色ID',
  `MENU_ID` varchar(38) DEFAULT NULL COMMENT '菜单ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sec_menu_role
-- ----------------------------

-- ----------------------------
-- Table structure for sec_org
-- ----------------------------
DROP TABLE IF EXISTS `sec_org`;
CREATE TABLE `sec_org` (
  `ID_` varchar(38) NOT NULL COMMENT '组织ID',
  `ORG_CODE` varchar(38) DEFAULT NULL COMMENT '组织编码',
  `ORG_NAME` varchar(50) DEFAULT NULL COMMENT '组织名称',
  `PARENT_ID` varchar(38) DEFAULT NULL COMMENT '父组织ID',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(11) DEFAULT '0' COMMENT '删除标识',
  `RESB_USER` varchar(38) DEFAULT NULL COMMENT '负责人ID',
  `REMARK` varchar(1000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sec_org
-- ----------------------------

-- ----------------------------
-- Table structure for sec_role
-- ----------------------------
DROP TABLE IF EXISTS `sec_role`;
CREATE TABLE `sec_role` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `ROLE_CODE` varchar(38) DEFAULT NULL COMMENT '角色编码',
  `ROLE_NAME` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '创建人',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(11) DEFAULT '0' COMMENT '删除标识',
  `STANBY_ID` varchar(38) DEFAULT NULL COMMENT '备用',
  `STATE` varchar(1000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sec_role
-- ----------------------------

-- ----------------------------
-- Table structure for sec_role_menber
-- ----------------------------
DROP TABLE IF EXISTS `sec_role_menber`;
CREATE TABLE `sec_role_menber` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `ROLE_ID` varchar(38) DEFAULT NULL COMMENT '角色ID',
  `USER_ID` varchar(38) DEFAULT NULL COMMENT '用户ID',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户所拥有的角色';

-- ----------------------------
-- Records of sec_role_menber
-- ----------------------------

-- ----------------------------
-- Table structure for sec_user
-- ----------------------------
DROP TABLE IF EXISTS `sec_user`;
CREATE TABLE `sec_user` (
  `ID_` varchar(38) NOT NULL COMMENT '主键ID',
  `USER_NAME` varchar(50) DEFAULT NULL COMMENT '用户名称',
  `ACCOUNT` varchar(38) DEFAULT NULL COMMENT '账号',
  `USER_PASS` varchar(50) DEFAULT NULL COMMENT '密码',
  `ORG_ID` varchar(255) DEFAULT NULL COMMENT '所属组织',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `ADDR` varchar(200) DEFAULT NULL COMMENT '地址',
  `HEAD_IMG` varchar(200) DEFAULT NULL COMMENT '头像',
  `STATUS` int(11) DEFAULT '1' COMMENT '状态 0 不可用 1 可用',
  `SEX` int(11) DEFAULT NULL COMMENT '性别 0 女 1 男',
  `NATIVE_PLACE` varchar(38) DEFAULT NULL COMMENT '籍贯',
  `C_TYPE` varchar(38) DEFAULT NULL COMMENT '证件类型',
  `C_MUM` varchar(38) DEFAULT NULL COMMENT '证件号码',
  `M_STATUS` int(11) DEFAULT NULL COMMENT ' 0 未婚 1 已婚',
  `CREATOR` varchar(38) DEFAULT NULL COMMENT '创建人',
  `ACCOUNT_TYPE` int(11) DEFAULT NULL COMMENT '账号类型(0:内部用户、1：外部用户)',
  `STANDBY1` varchar(38) DEFAULT NULL COMMENT '备用字段',
  `STANDBY2` varchar(38) DEFAULT NULL COMMENT '备用字段',
  `STANDBY3` varchar(38) DEFAULT NULL COMMENT '备用字段',
  `STANDBY4` varchar(38) DEFAULT NULL COMMENT '备用字段',
  `STANDBY5` varchar(38) DEFAULT NULL COMMENT '备用字段',
  `CREATE_TIME` datetime DEFAULT NULL COMMENT '创建时间',
  `DELETED` int(11) DEFAULT '0' COMMENT '删除标识',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sec_user
-- ----------------------------

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `ID_` varchar(38) NOT NULL,
  `NAME` varchar(38) DEFAULT NULL COMMENT '名字',
  PRIMARY KEY (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of supplier
-- ----------------------------

-- ----------------------------
-- Table structure for sys_message
-- ----------------------------
DROP TABLE IF EXISTS `sys_message`;
CREATE TABLE `sys_message` (
  `ID_` varchar(38) NOT NULL,
  `SEND_ID` varchar(38) DEFAULT NULL COMMENT '发送者编号',
  `REC_ID` varchar(38) DEFAULT NULL COMMENT '接受者编号',
  `MSG_TITLE` varchar(255) DEFAULT NULL COMMENT '消息标题',
  `MESSAGE` varchar(355) DEFAULT NULL COMMENT '站内信内容',
  `RED_STATUS` int(11) DEFAULT NULL COMMENT '站内信的查看状态',
  `P_DATE` datetime DEFAULT NULL COMMENT '发送时间',
  `DELETED` varchar(38) DEFAULT NULL COMMENT '删除标记',
  `MSG_URL` varchar(255) DEFAULT NULL COMMENT '消息链接',
  `MSG_TYPE` varchar(38) DEFAULT NULL COMMENT '消息类型',
  `OBJ_ID` varchar(38) DEFAULT NULL COMMENT '消息对应对象ID',
  `IS_PUSH` int(11) DEFAULT NULL COMMENT '是否推送',
  PRIMARY KEY (`ID_`),
  KEY `FK_Reference_29` (`SEND_ID`),
  CONSTRAINT `FK_Reference_29` FOREIGN KEY (`SEND_ID`) REFERENCES `sec_user` (`ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of sys_message
-- ----------------------------
