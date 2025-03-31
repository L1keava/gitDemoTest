/*
 Navicat Premium Data Transfer

 Source Server         : mysql_local
 Source Server Type    : MySQL
 Source Server Version : 50726 (5.7.26)
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50726 (5.7.26)
 File Encoding         : 65001

 Date: 31/03/2025 14:27:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `sage` int(11) NOT NULL,
  `ssex` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (1, '张三', 18, '男');
INSERT INTO `stu` VALUES (2, '李四', 19, '女');
INSERT INTO `stu` VALUES (3, '王五', 20, '男');

-- ----------------------------
-- Table structure for td_student
-- ----------------------------
DROP TABLE IF EXISTS `td_student`;
CREATE TABLE `td_student`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `stuzy` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `stuno` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of td_student
-- ----------------------------
INSERT INTO `td_student` VALUES (1, '王甲', 'A', '101', 10, '15555555555', '男');
INSERT INTO `td_student` VALUES (2, '王乙', 'A', '102', 11, '100567', '男');
INSERT INTO `td_student` VALUES (3, '小丙', 'B', '103', 20, '12321', '女');
INSERT INTO `td_student` VALUES (4, '小丁', 'A', '104', 21, '23132131', '男');
INSERT INTO `td_student` VALUES (5, '小二', 'A', '105', 32, '32133124', '男');
INSERT INTO `td_student` VALUES (6, '张三', 'B', '106', 32, '15123414', '女');
INSERT INTO `td_student` VALUES (7, '李四', 'B', '107', 21, '2314321', '女');
INSERT INTO `td_student` VALUES (8, '王五', 'C', '108', 44, '1231313', '女');

SET FOREIGN_KEY_CHECKS = 1;
