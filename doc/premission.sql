/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : premission

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-04-08 01:16:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `parent_id` int(32) DEFAULT NULL COMMENT '资源父ID',
  `name` varchar(64) NOT NULL COMMENT '资源名称',
  `perms` varchar(64) DEFAULT NULL COMMENT '权限标识符',
  `type` char(1) NOT NULL COMMENT '类型：0：目录，1：菜单，2：按钮',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
INSERT INTO `sys_resource` VALUES ('1', '0', '系统管理', null, '0');
INSERT INTO `sys_resource` VALUES ('2', '1', '用户管理', 'sys:users', '1');
INSERT INTO `sys_resource` VALUES ('3', '1', '角色管理', 'sys:roles', '1');
INSERT INTO `sys_resource` VALUES ('4', '2', '添加用户', 'sys:user:insert', '2');
INSERT INTO `sys_resource` VALUES ('5', '2', '删除用户', 'sys:user:delete', '2');
INSERT INTO `sys_resource` VALUES ('6', '2', '修改用户', 'sys:user:update', '2');
INSERT INTO `sys_resource` VALUES ('7', '2', '查询用户', 'sys:user:list', '2');
INSERT INTO `sys_resource` VALUES ('8', '3', '添加角色', 'sys:role:insert', '2');
INSERT INTO `sys_resource` VALUES ('9', '3', '删除角色', 'sys:role:delete', '2');
INSERT INTO `sys_resource` VALUES ('10', '3', '修改角色', 'sys:role:update', '2');
INSERT INTO `sys_resource` VALUES ('11', '3', '查询角色', 'sys:role:list', '2');
INSERT INTO `sys_resource` VALUES ('12', '3', '角色详情', 'sys:role:detail', '2');
INSERT INTO `sys_resource` VALUES ('13', '2', '用户详情', 'sys:user:detail', '2');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(64) NOT NULL COMMENT '角色名',
  `grade` tinyint(2) NOT NULL COMMENT '角色等级',
  `remark` varchar(256) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('7', '超级管理员', '1', '超级管理员,全站管理');

-- ----------------------------
-- Table structure for sys_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_resource`;
CREATE TABLE `sys_role_resource` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `role_id` int(32) NOT NULL COMMENT '角色id',
  `resource_id` int(32) NOT NULL COMMENT '资源id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_resource
-- ----------------------------
INSERT INTO `sys_role_resource` VALUES ('3', '7', '1');
INSERT INTO `sys_role_resource` VALUES ('4', '7', '2');
INSERT INTO `sys_role_resource` VALUES ('5', '7', '3');
INSERT INTO `sys_role_resource` VALUES ('6', '7', '4');
INSERT INTO `sys_role_resource` VALUES ('7', '7', '5');
INSERT INTO `sys_role_resource` VALUES ('8', '7', '6');
INSERT INTO `sys_role_resource` VALUES ('9', '7', '7');
INSERT INTO `sys_role_resource` VALUES ('10', '7', '8');
INSERT INTO `sys_role_resource` VALUES ('11', '7', '9');
INSERT INTO `sys_role_resource` VALUES ('12', '7', '10');
INSERT INTO `sys_role_resource` VALUES ('13', '7', '11');

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `account` varchar(64) NOT NULL COMMENT '账号',
  `password` varchar(128) NOT NULL COMMENT '密码',
  `salt` varchar(128) NOT NULL COMMENT '盐',
  `forbidden` char(1) NOT NULL COMMENT '是否禁用 0：否；1：是',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('4', 'admin', 'admin', 'd3ce866c2a856303a182c9e595d498f5', '8e7386142591cfa96ef7c293b5dfe72c', '0');

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_id` int(32) NOT NULL COMMENT '用户ID',
  `role_id` int(32) NOT NULL COMMENT '资源ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('4', '4', '7');
