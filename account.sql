/*
Navicat MySQL Data Transfer

Source Server         : 333
Source Server Version : 50551
Source Host           : localhost:3306
Source Database       : 11

Target Server Type    : MYSQL
Target Server Version : 50551
File Encoding         : 65001

Date: 2017-11-15 16:18:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(2) NOT NULL AUTO_INCREMENT,
  `number` int(4) NOT NULL,
  `money` double(4,0) NOT NULL,
  `type` varchar(255) NOT NULL,
  `createtime` datetime NOT NULL,
  `resource` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('7', '4002', '23', '转出', '2017-11-15 11:03:12', '4007');
INSERT INTO `account` VALUES ('8', '4002', '23', '转出', '2017-11-15 11:09:03', '4007');
INSERT INTO `account` VALUES ('9', '4002', '23', '转出', '2017-11-15 11:10:48', '4007');
INSERT INTO `account` VALUES ('10', '4002', '23', '转出', '2017-11-15 11:24:33', '4007');
INSERT INTO `account` VALUES ('11', '4002', '23', '转出', '2017-11-15 11:25:02', '4007');
INSERT INTO `account` VALUES ('12', '4002', '23', '转出', '2017-11-15 11:26:25', '4007');
INSERT INTO `account` VALUES ('13', '4002', '23', '转出', '2017-11-15 11:27:09', '4007');
INSERT INTO `account` VALUES ('14', '4002', '23', '转出', '2017-11-15 11:27:59', '4007');
INSERT INTO `account` VALUES ('15', '4002', '23', '转出', '2017-11-15 11:28:45', '4007');
INSERT INTO `account` VALUES ('16', '4002', '23', '转出', '2017-11-15 11:29:37', '4007');
INSERT INTO `account` VALUES ('17', '4002', '23', '转出', '2017-11-15 11:33:02', '4007');
INSERT INTO `account` VALUES ('18', '4002', '23', '转出', '2017-11-15 11:33:38', '4007');
INSERT INTO `account` VALUES ('19', '4002', '66', '转出', '2017-11-15 11:40:41', '4002');
INSERT INTO `account` VALUES ('20', '4002', '23', '转出', '2017-11-15 11:41:51', '4007');
INSERT INTO `account` VALUES ('21', '4060', '23', '转出', '2017-11-15 11:53:59', '4067');
INSERT INTO `account` VALUES ('22', '4060', '23', '转出', '2017-11-15 11:54:34', '4067');
INSERT INTO `account` VALUES ('23', '4060', '23', '转出', '2017-11-15 11:55:09', '4067');
INSERT INTO `account` VALUES ('24', '4060', '30', '转出', '2017-11-15 12:00:46', '4050');
INSERT INTO `account` VALUES ('25', '4060', '300', '转出', '2017-11-15 12:01:57', '4050');
INSERT INTO `account` VALUES ('26', '4060', '300', '转出', '2017-11-15 12:02:40', '4050');
INSERT INTO `account` VALUES ('27', '4060', '300', '转出', '2017-11-15 12:05:11', '4050');
INSERT INTO `account` VALUES ('28', '4060', '300', '转出', '2017-11-15 12:07:07', '4050');
INSERT INTO `account` VALUES ('29', '4060', '23', '转出', '2017-11-15 12:14:59', '4067');
