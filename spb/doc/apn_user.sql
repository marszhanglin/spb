/*
Navicat MySQL Data Transfer

Source Server         : 本机localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-03-30 14:13:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for apn_user
-- ----------------------------
DROP TABLE IF EXISTS `apn_user`;
CREATE TABLE `apn_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` datetime DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `name` varchar(64) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `updated_date` datetime DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apn_user
-- ----------------------------
INSERT INTO `apn_user` VALUES ('1', '2016-02-08 14:33:13', null, '111', '53471bf437024b9a8c60465152efef01', null, 'ce878c21cd8e4eafb075c8bcc560fa80');
INSERT INTO `apn_user` VALUES ('2', '2016-02-08 15:40:37', null, null, 'aaec95a943214f58a1170004ba8eadd5', null, 'b72acf3bcc784e9eb079054da803e90e');
