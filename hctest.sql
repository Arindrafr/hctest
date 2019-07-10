/*
Navicat MySQL Data Transfer

Source Server         : Local Dev
Source Server Version : 50725
Source Host           : localhost:3306
Source Database       : hctest

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2019-07-10 11:35:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `orderName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', 'Promo');
INSERT INTO `order` VALUES ('2', 'Category');
INSERT INTO `order` VALUES ('3', 'Flashsale');
INSERT INTO `order` VALUES ('4', 'History');
INSERT INTO `order` VALUES ('5', 'News');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'userA');
INSERT INTO `user` VALUES ('2', 'userB');
INSERT INTO `user` VALUES ('3', 'userC');

-- ----------------------------
-- Table structure for user_order
-- ----------------------------
DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) DEFAULT NULL,
  `userOrder` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_order
-- ----------------------------
INSERT INTO `user_order` VALUES ('1', 'userA', '1,2,3,4,5');
INSERT INTO `user_order` VALUES ('2', 'userB', '1,5,3,2,5');
INSERT INTO `user_order` VALUES ('3', 'userC', '1,3,2,5,4');
SET FOREIGN_KEY_CHECKS=1;
