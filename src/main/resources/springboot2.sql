/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : springboot2

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-08-23 23:42:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `teacher_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '学生1', '2017-08-23 23:05:28', '1');
INSERT INTO `student` VALUES ('2', '学生2', '2017-08-23 23:05:40', '1');
INSERT INTO `student` VALUES ('3', '学生3', '2017-08-23 23:05:51', '1');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` varchar(40) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('03c311b7243046d6b6484ca1d1c5099c', '批量录入1503502726839', '2017-08-23 23:38:46');
INSERT INTO `teacher` VALUES ('1', '老师1', '2017-08-23 22:31:21');
INSERT INTO `teacher` VALUES ('1344e7d777ab4db4bca9756a304889bb', '批量录入1503502765035', '2017-08-23 23:39:25');
INSERT INTO `teacher` VALUES ('506f4db32630419b802c75b517c54058', '批量录入1503502780594', '2017-08-23 23:39:40');
INSERT INTO `teacher` VALUES ('537cd8182c0e4ab5a99ba7c2e72f7b3e', '批量录入1503502765035', '2017-08-23 23:39:25');
INSERT INTO `teacher` VALUES ('5f4b8e13a7f240bb808442f4361587f8', '批量录入1503502780406', '2017-08-23 23:39:40');
INSERT INTO `teacher` VALUES ('8c5f5ca88df64ee5ab4bc77ec6a77289', '批量录入1503502727330', '2017-08-23 23:38:47');
INSERT INTO `teacher` VALUES ('996d0d42362c422faecae739c31990fb', '批量录入1503502780406', '2017-08-23 23:39:40');
INSERT INTO `teacher` VALUES ('a8de44640748409b9c5d691132f23d7e', '批量录入1503502780594', '2017-08-23 23:39:40');
INSERT INTO `teacher` VALUES ('a9aa5ffd629543d29975ace4c3adf83a', '批量录入1503502765213', '2017-08-23 23:39:25');
INSERT INTO `teacher` VALUES ('bcc633f0ef8b4fb5887b72fcd3006107', '批量录入1503502726839', '2017-08-23 23:38:46');
INSERT INTO `teacher` VALUES ('ccc193b93f5448fab8569740d037f7f3', '批量录入1503502765213', '2017-08-23 23:39:25');
INSERT INTO `teacher` VALUES ('d12bd76559cb4a6b82fd2fd6a3233e06', '批量录入1503502727329', '2017-08-23 23:38:47');

-- ----------------------------
-- Table structure for `teacher_info`
-- ----------------------------
DROP TABLE IF EXISTS `teacher_info`;
CREATE TABLE `teacher_info` (
  `id` varchar(32) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `work_year` int(11) DEFAULT NULL,
  `favorite` varchar(255) DEFAULT NULL,
  `marry` varchar(255) DEFAULT NULL,
  `teacher_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_info
-- ----------------------------
INSERT INTO `teacher_info` VALUES ('1', '1', '1', '1', '1', '1');
