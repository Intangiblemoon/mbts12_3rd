/*


Source Host           : localhost:3306
Source Database       : mbts

Target Server Type    : MYSQL


*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '这是id',
  `name` varchar(255) DEFAULT NULL COMMENT '名字',
  `sex` varchar(16) DEFAULT NULL COMMENT '性别',
  `age` int(4) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '进化 皮卡丘', '男', '20');
INSERT INTO `user` VALUES ('2', '杰尼龟', '男', '6');
INSERT INTO `user` VALUES ('3', '小霞', '女', '16');
INSERT INTO `user` VALUES ('5', 'text', '男', '18');
