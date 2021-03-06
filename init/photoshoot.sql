/*
Navicat MySQL Data Transfer

Source Server         : ss
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : photoshoot

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2017-12-12 10:59:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ps_collection
-- ----------------------------
DROP TABLE IF EXISTS `ps_collection`;
CREATE TABLE `ps_collection` (
  `collection_id` int(11) NOT NULL AUTO_INCREMENT,
  `collection_userid` int(11) NOT NULL,
  `collection_tagid` int(11) DEFAULT NULL,
  `collection_photo_location` varchar(150) DEFAULT NULL,
  `collection_photoname` varchar(12) DEFAULT NULL,
  `collection_photointroduction` varchar(150) DEFAULT NULL,
  `collection_price` decimal(10,1) DEFAULT NULL,
  `collection_photoinformation` varchar(100) DEFAULT NULL,
  `collection_adress` char(12) DEFAULT NULL,
  `collection_flag` tinyint(1) NOT NULL DEFAULT '1',
  `collection_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `collection_updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `collection_small_photo_location` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`collection_id`),
  KEY `collection_userid` (`collection_userid`),
  KEY `fk_ps_collection_ps_collection_1` (`collection_tagid`),
  CONSTRAINT `fk_ps_collection_ps_collection_1` FOREIGN KEY (`collection_tagid`) REFERENCES `ps_tag` (`tag_id`),
  CONSTRAINT `fk_ps_collection_ps_collection_2` FOREIGN KEY (`collection_userid`) REFERENCES `ps_user` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=187 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_collection
-- ----------------------------
INSERT INTO `ps_collection` VALUES ('1', '1', '5', 'images/2017/09/09/111832674.webp', '美女', 'this is a photo', '100.0', 'used mobilephone', 'ZhuHai', '1', '2017-07-26 09:55:47', '2017-11-08 09:44:07', null);
INSERT INTO `ps_collection` VALUES ('2', '1', '1', 'images/2017/09/16/041818353.webp', 'dsad', null, '111.0', null, null, '2', '2017-10-12 11:32:25', '2017-11-08 09:44:16', null);
INSERT INTO `ps_collection` VALUES ('3', '1', '1', 'images/2017/09/17/053255228.jpg', 'sadf', null, '111.0', null, null, '1', '2017-10-12 11:32:25', '2017-11-08 10:47:14', null);
INSERT INTO `ps_collection` VALUES ('4', '1', '1', 'images/2017/09/27/023814730.webp', 'asdf', null, '111.0', null, null, '1', '2017-10-12 11:32:25', '2017-11-08 09:44:29', null);
INSERT INTO `ps_collection` VALUES ('14', '1', null, 'images/2017/10/19/105132482.webp', 'sad', null, null, null, null, '1', '2017-10-19 10:18:21', '2017-11-08 09:46:57', null);
INSERT INTO `ps_collection` VALUES ('15', '3', null, 'images/2017/10/19/105132482.webp', null, null, null, null, null, '1', '2017-10-19 10:51:33', '2017-11-08 09:46:59', null);
INSERT INTO `ps_collection` VALUES ('16', '3', null, 'images/2017/10/19/105132482.webp', null, null, null, null, null, '1', '2017-10-19 10:51:33', '2017-11-08 09:47:01', null);
INSERT INTO `ps_collection` VALUES ('17', '3', null, 'images/2017/10/19/105132482.webp', null, null, null, null, null, '1', '2017-10-19 10:51:33', '2017-11-08 09:47:03', null);
INSERT INTO `ps_collection` VALUES ('18', '3', null, 'images/2017/10/19/105157309.webp', null, null, null, null, null, '1', '2017-10-19 10:51:57', '2017-11-08 09:47:08', null);
INSERT INTO `ps_collection` VALUES ('19', '3', null, 'images/2017/10/19/105157309.webp', null, null, null, null, null, '1', '2017-10-19 10:51:57', '2017-11-08 09:47:14', null);
INSERT INTO `ps_collection` VALUES ('20', '3', null, 'images/2017/10/19/105157309.webp', null, null, null, null, null, '1', '2017-10-19 10:51:57', '2017-11-08 09:47:17', null);
INSERT INTO `ps_collection` VALUES ('21', '3', null, 'images/2017/10/20/085325965.webp', null, null, null, null, null, '1', '2017-10-20 09:03:22', '2017-11-08 09:53:04', null);
INSERT INTO `ps_collection` VALUES ('22', '3', null, 'images/2017/10/20/085325965.webp', null, null, null, null, null, '1', '2017-10-20 09:03:22', '2017-11-08 09:53:09', null);
INSERT INTO `ps_collection` VALUES ('23', '1', null, 'images/2017/10/20/085420958.webp', null, null, null, null, null, '1', '2017-10-20 09:44:05', '2017-11-08 09:53:17', null);
INSERT INTO `ps_collection` VALUES ('24', '1', null, 'images/2017/10/20/085420958.webp', null, null, null, null, null, '1', '2017-10-20 09:44:05', '2017-11-08 09:53:20', null);
INSERT INTO `ps_collection` VALUES ('102', '1', null, 'images/2017/11/08/104301482.webp', null, null, null, null, null, '1', '2017-11-08 10:43:41', '2017-11-08 10:43:41', null);
INSERT INTO `ps_collection` VALUES ('103', '1', null, 'images/2017/11/08/104731855.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('104', '1', null, 'images/2017/11/08/104738871.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('105', '1', null, 'images/2017/11/08/104739591.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('106', '1', null, 'images/2017/11/08/104740284.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('107', '1', null, 'images/2017/11/08/104743428.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('108', '1', null, 'images/2017/11/08/104743437.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('109', '1', null, 'images/2017/11/08/104743446.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('110', '1', null, 'images/2017/11/08/104743454.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('111', '1', null, 'images/2017/11/08/104743464.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('112', '1', null, 'images/2017/11/08/104743473.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('113', '1', null, 'images/2017/11/08/104743481.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('114', '1', null, 'images/2017/11/08/104743489.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('115', '1', null, 'images/2017/11/08/104743498.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('116', '1', null, 'images/2017/11/08/104743507.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('117', '1', null, 'images/2017/11/08/104743516.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('118', '1', null, 'images/2017/11/08/104743524.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('119', '1', null, 'images/2017/11/08/104743532.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('120', '1', null, 'images/2017/11/08/104743540.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('121', '1', null, 'images/2017/11/08/104743548.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('122', '1', null, 'images/2017/11/08/104743556.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('123', '1', null, 'images/2017/11/08/104743564.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('124', '1', null, 'images/2017/11/08/104743573.webp', null, null, null, null, null, '1', '2017-11-08 10:48:00', '2017-11-08 10:48:00', null);
INSERT INTO `ps_collection` VALUES ('125', '1', null, 'images/2017/11/08/104900384.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('126', '1', null, 'images/2017/11/08/104900393.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('127', '1', null, 'images/2017/11/08/104900426.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('128', '1', null, 'images/2017/11/08/104900435.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('129', '1', null, 'images/2017/11/08/104900455.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('130', '1', null, 'images/2017/11/08/104900467.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('131', '1', null, 'images/2017/11/08/104900498.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('132', '1', null, 'images/2017/11/08/104900507.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('133', '1', null, 'images/2017/11/08/104900515.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('134', '1', null, 'images/2017/11/08/104900523.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('135', '1', null, 'images/2017/11/08/104900531.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('136', '1', null, 'images/2017/11/08/104900539.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('137', '1', null, 'images/2017/11/08/104900547.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('138', '1', null, 'images/2017/11/08/104900556.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('139', '1', null, 'images/2017/11/08/104900567.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('140', '1', null, 'images/2017/11/08/104900577.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('141', '1', null, 'images/2017/11/08/104900585.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('142', '1', null, 'images/2017/11/08/104900593.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('143', '1', null, 'images/2017/11/08/104900602.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('144', '1', null, 'images/2017/11/08/104900610.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('145', '1', null, 'images/2017/11/08/104900620.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('146', '1', null, 'images/2017/11/08/104900641.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('147', '1', null, 'images/2017/11/08/104900653.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('148', '1', null, 'images/2017/11/08/104900661.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('149', '1', null, 'images/2017/11/08/104900669.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('150', '1', null, 'images/2017/11/08/104900679.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('151', '1', null, 'images/2017/11/08/104900687.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('152', '1', null, 'images/2017/11/08/104900696.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('153', '1', null, 'images/2017/11/08/104900720.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('154', '1', null, 'images/2017/11/08/104900727.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('155', '1', null, 'images/2017/11/08/104900735.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('156', '1', null, 'images/2017/11/08/104900743.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('157', '1', null, 'images/2017/11/08/104900752.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('158', '1', null, 'images/2017/11/08/104900773.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('159', '1', null, 'images/2017/11/08/104900781.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('160', '1', null, 'images/2017/11/08/104900790.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('161', '1', null, 'images/2017/11/08/104900797.webp', null, null, null, null, null, '1', '2017-11-08 10:49:03', '2017-11-08 10:49:03', null);
INSERT INTO `ps_collection` VALUES ('162', '3', null, 'images/2017/11/08/035522240.webp', null, null, null, null, null, '1', '2017-11-08 15:56:17', '2017-11-08 15:56:17', null);
INSERT INTO `ps_collection` VALUES ('163', '3', null, 'images/2017/11/08/035631848.webp', null, null, null, null, null, '1', '2017-11-08 15:57:32', '2017-11-08 15:57:32', null);
INSERT INTO `ps_collection` VALUES ('164', '3', null, 'images/2017/11/08/035631858.webp', null, null, null, null, null, '1', '2017-11-08 15:57:32', '2017-11-08 15:57:32', null);
INSERT INTO `ps_collection` VALUES ('165', '3', null, 'images/2017/11/08/040945478.webp', null, null, null, null, null, '1', '2017-11-08 16:09:59', '2017-11-08 16:09:59', null);
INSERT INTO `ps_collection` VALUES ('166', '3', null, 'images/2017/11/08/040945486.webp', null, null, null, null, null, '1', '2017-11-08 16:09:59', '2017-11-08 16:09:59', null);
INSERT INTO `ps_collection` VALUES ('167', '1', null, 'images/2017/11/08/044751827.webp', null, null, null, null, null, '1', '2017-11-08 16:48:30', '2017-11-08 16:48:30', null);
INSERT INTO `ps_collection` VALUES ('168', '1', null, 'images/2017/11/08/044751860.webp', null, null, null, null, null, '1', '2017-11-08 16:48:30', '2017-11-08 16:48:30', null);
INSERT INTO `ps_collection` VALUES ('169', '1', null, 'images/2017/11/09/090952432.webp', null, null, null, null, null, '1', '2017-11-09 09:09:54', '2017-11-09 09:09:54', null);
INSERT INTO `ps_collection` VALUES ('170', '1', null, 'images/2017/11/09/090952469.webp', null, null, null, null, null, '1', '2017-11-09 09:09:54', '2017-11-09 09:09:54', null);
INSERT INTO `ps_collection` VALUES ('171', '1', null, 'images/2017/11/09/091023982.webp', null, null, null, null, null, '1', '2017-11-09 09:10:26', '2017-11-09 09:10:26', null);
INSERT INTO `ps_collection` VALUES ('172', '1', null, 'images/2017/11/09/091023990.webp', null, null, null, null, null, '1', '2017-11-09 09:10:26', '2017-11-09 09:10:26', null);
INSERT INTO `ps_collection` VALUES ('178', '1', null, 'images/2017/11/21/043300366.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043300366.jpg');
INSERT INTO `ps_collection` VALUES ('179', '1', null, 'images/2017/11/21/043301328.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043301328.jpg');
INSERT INTO `ps_collection` VALUES ('180', '1', null, 'images/2017/11/21/043301881.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043301881.jpg');
INSERT INTO `ps_collection` VALUES ('181', '1', null, 'images/2017/11/21/043302576.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043302576.jpg');
INSERT INTO `ps_collection` VALUES ('182', '1', null, 'images/2017/11/21/043302622.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043302622.jpg');
INSERT INTO `ps_collection` VALUES ('183', '1', null, 'images/2017/11/21/043303284.jpg', null, null, null, null, null, '1', '2017-11-21 16:33:09', '2017-11-21 16:33:09', 'small_images/2017/11/21/043303284.jpg');
INSERT INTO `ps_collection` VALUES ('184', '1', null, 'images/2017/11/22/073035067.jpg', null, null, null, null, null, '1', '2017-11-22 19:30:39', '2017-11-22 19:30:39', 'small_images/2017/11/22/073035067.jpg');
INSERT INTO `ps_collection` VALUES ('185', '1', null, 'images/2017/11/22/073035700.jpg', null, null, null, null, null, '1', '2017-11-22 19:30:39', '2017-11-22 19:30:39', 'small_images/2017/11/22/073035700.jpg');
INSERT INTO `ps_collection` VALUES ('186', '1', null, 'images/2017/11/22/073310953.jpg', null, null, null, null, null, '1', '2017-11-22 19:33:12', '2017-11-22 19:33:12', 'small_images/2017/11/22/073310953.jpg');

-- ----------------------------
-- Table structure for ps_comment
-- ----------------------------
DROP TABLE IF EXISTS `ps_comment`;
CREATE TABLE `ps_comment` (
  `comment_reply_id` int(11) NOT NULL DEFAULT '0' COMMENT '回复别人的id',
  `comment_collectionid` int(11) NOT NULL,
  `comment_userid` int(11) NOT NULL,
  `comment_content` varchar(300) DEFAULT NULL,
  `comment_status` tinyint(1) NOT NULL DEFAULT '1',
  `comment_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `comment_userid` (`comment_userid`),
  KEY `fk_ps_comment_ps_comment_1` (`comment_collectionid`),
  KEY `fk_ps_comment_ps_comment_3` (`comment_reply_id`),
  CONSTRAINT `fk_ps_comment_ps_comment_1` FOREIGN KEY (`comment_collectionid`) REFERENCES `ps_collection` (`collection_id`),
  CONSTRAINT `fk_ps_comment_ps_comment_2` FOREIGN KEY (`comment_userid`) REFERENCES `ps_user` (`user_id`),
  CONSTRAINT `fk_ps_comment_ps_comment_3` FOREIGN KEY (`comment_reply_id`) REFERENCES `ps_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_comment
-- ----------------------------
INSERT INTO `ps_comment` VALUES ('0', '1', '2', '这张图片还不错', '1', '2017-11-10 16:16:05');
INSERT INTO `ps_comment` VALUES ('2', '1', '1', '谢谢你的赞赏！', '1', '2017-11-10 16:16:57');
INSERT INTO `ps_comment` VALUES ('0', '1', '2', '你谦虚了', '1', '2017-11-10 16:18:55');
INSERT INTO `ps_comment` VALUES ('0', '2', '3', '欣赏欣赏。', '1', '2017-11-10 16:19:54');

-- ----------------------------
-- Table structure for ps_like
-- ----------------------------
DROP TABLE IF EXISTS `ps_like`;
CREATE TABLE `ps_like` (
  `like_id` int(11) NOT NULL AUTO_INCREMENT,
  `like_collectionid` int(11) NOT NULL,
  `like_userid` int(11) NOT NULL,
  `like_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `like_status` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`like_id`),
  KEY `fk_ps_like_ps_like_1` (`like_userid`),
  KEY `fk_ps_like_ps_like_2` (`like_collectionid`),
  CONSTRAINT `fk_ps_like_ps_like_1` FOREIGN KEY (`like_userid`) REFERENCES `ps_user` (`user_id`),
  CONSTRAINT `fk_ps_like_ps_like_2` FOREIGN KEY (`like_collectionid`) REFERENCES `ps_collection` (`collection_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_like
-- ----------------------------
INSERT INTO `ps_like` VALUES ('1', '1', '1', '2017-10-16 09:56:21', '1');
INSERT INTO `ps_like` VALUES ('2', '2', '1', '2017-10-16 09:56:23', '1');
INSERT INTO `ps_like` VALUES ('3', '1', '2', '2017-10-16 09:56:25', '1');
INSERT INTO `ps_like` VALUES ('4', '4', '4', '2017-10-24 14:40:51', '1');
INSERT INTO `ps_like` VALUES ('5', '3', '2', '2017-10-24 14:56:42', '0');
INSERT INTO `ps_like` VALUES ('6', '4', '1', '2017-10-24 16:54:13', '0');
INSERT INTO `ps_like` VALUES ('16', '2', '2', '2017-10-30 14:19:01', '1');
INSERT INTO `ps_like` VALUES ('17', '1', '2', '2017-11-08 16:20:20', '1');
INSERT INTO `ps_like` VALUES ('18', '119', '1', '2017-11-08 16:50:40', '1');
INSERT INTO `ps_like` VALUES ('19', '3', '1', '2017-11-15 10:04:01', '1');
INSERT INTO `ps_like` VALUES ('20', '19', '1', '2017-11-15 10:04:13', '1');

-- ----------------------------
-- Table structure for ps_role
-- ----------------------------
DROP TABLE IF EXISTS `ps_role`;
CREATE TABLE `ps_role` (
  `role_id` int(5) NOT NULL AUTO_INCREMENT,
  `role_name` char(50) NOT NULL DEFAULT 'ROLE_ORDIN',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_role
-- ----------------------------
INSERT INTO `ps_role` VALUES ('1', 'ROLE_ORDIN');
INSERT INTO `ps_role` VALUES ('2', 'ROLE_ADMIN');

-- ----------------------------
-- Table structure for ps_tag
-- ----------------------------
DROP TABLE IF EXISTS `ps_tag`;
CREATE TABLE `ps_tag` (
  `tag_id` int(11) NOT NULL,
  `tag_name` char(100) NOT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_tag
-- ----------------------------
INSERT INTO `ps_tag` VALUES ('1', '风景');

-- ----------------------------
-- Table structure for ps_user
-- ----------------------------
DROP TABLE IF EXISTS `ps_user`;
CREATE TABLE `ps_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_is_delete` tinyint(1) NOT NULL DEFAULT '0',
  `user_name` char(12) DEFAULT NULL,
  `user_password` varchar(220) NOT NULL,
  `user_nickname` varchar(10) DEFAULT NULL,
  `user_role` int(5) NOT NULL DEFAULT '1',
  `user_sex` tinyint(1) DEFAULT '1',
  `user_age` tinyint(3) DEFAULT NULL,
  `user_email` char(50) DEFAULT NULL,
  `user_introduction` varchar(220) DEFAULT NULL,
  `user_createtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_updatetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `user_headphoto_location` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  KEY `ps_user_ibfk_1` (`user_id`),
  KEY `fk_ps_user_ps_user_1` (`user_role`),
  CONSTRAINT `fk_ps_user_ps_user_1` FOREIGN KEY (`user_role`) REFERENCES `ps_role` (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_user
-- ----------------------------
INSERT INTO `ps_user` VALUES ('0', '0', 'default', 'default', 'default', '1', '1', null, null, null, '2017-11-10 16:15:39', '2017-11-10 16:15:48', null);
INSERT INTO `ps_user` VALUES ('1', '0', 'Amy', '$2a$05$baP5xNaDvSHNOtXK35g96.Wb9c0EbyqgxlCh5bhJgYTCnHzdec4v2', 'Amy', '1', '2', '25', null, 'I can swim', '2017-07-26 09:47:34', '2017-11-20 09:51:27', 'headpic/2017/07/26/Amy.webp');
INSERT INTO `ps_user` VALUES ('2', '0', 'Jean', '$2a$05$TRfx4t3VMMEVegQEQVNUB.CWxzZ8ErPMsBWeQsk.izeAnAHhkIPve', 'Jean', '1', '2', '28', null, 'I can swim', '2017-07-27 09:47:34', '2017-11-20 09:51:33', 'headpic/2017/07/26/Jean.webp');
INSERT INTO `ps_user` VALUES ('3', '0', 'Tom', '$2a$05$7ZWWXf4Ox3dXK/fE.2FkqeW/Tp/TML4L4Yr1Y7lqxNJ9MWEG5CpVC', 'Tom', '1', '1', '28', null, 'I can swim', '2017-07-28 10:19:05', '2017-10-18 11:01:31', 'headpic/2017/07/26/Tom.jpeg');
INSERT INTO `ps_user` VALUES ('4', '0', 'Ant', '$2a$05$7ZWWXf4Ox3dXK/fE.2FkqeW/Tp/TML4L4Yr1Y7lqxNJ9MWEG5CpVC', 'Ant', '1', '1', '28', null, 'I can swim', '2017-07-28 10:19:05', '2017-11-20 09:51:42', 'headpic/2017/07/26/Amy.webp');
INSERT INTO `ps_user` VALUES ('5', '0', 'Sally', '$2a$05$7ZWWXf4Ox3dXK/fE.2FkqeW/Tp/TML4L4Yr1Y7lqxNJ9MWEG5CpVC', 'Sally', '1', '1', '28', null, 'I can swim', '2017-07-28 10:19:05', '2017-11-20 09:51:47', 'headpic/2017/07/26/Amy.webp');
INSERT INTO `ps_user` VALUES ('6', '0', 'Sam', '$2a$05$7ZWWXf4Ox3dXK/fE.2FkqeW/Tp/TML4L4Yr1Y7lqxNJ9MWEG5CpVC', 'Sam', '1', '1', '28', null, 'I can swim', '2017-07-28 10:19:05', '2017-11-20 09:51:53', 'headpic/2017/07/26/Amy.webp');
INSERT INTO `ps_user` VALUES ('7', '0', 'Wang', '$2a$10$bSrZiYjL7nU1nVk2MVo1W.2biV50MwmX/cVOnTxhbN4a0NRtX3BLu', 'Wang', '1', '1', null, null, null, '2017-10-18 10:13:55', '2017-10-24 13:19:01', null);
INSERT INTO `ps_user` VALUES ('8', '0', 'Li', '$2a$10$q7YGy3lJX1v2wN8QeMM8ZeGUR.or40bEzxREau1gkeZ9mZhOseK8G', 'Li', '1', '1', null, null, null, '2017-10-18 10:16:37', '2017-10-24 13:19:04', null);
INSERT INTO `ps_user` VALUES ('9', '0', 'Dam', '$2a$10$xsQgNGm3wedoGry6Vh1P4eWtaBkfCfzdWECVvhZ9bsc2O3JLVHHSy', 'Dam', '1', '1', null, null, null, '2017-10-18 10:37:12', '2017-10-24 13:19:06', null);
INSERT INTO `ps_user` VALUES ('10', '0', 'Wu', '$2a$10$w7vextFxwqFOnoAsBchhbutunilh7HkPk8GjKsZLX1j.GpeVp9WDO', 'Wu', '1', '1', null, null, null, '2017-10-18 10:40:40', '2017-10-24 13:19:08', null);
INSERT INTO `ps_user` VALUES ('11', '0', 'Hanna', '$2a$10$P.Qzu9leWbcisYiLOqUY1u/spz.l9KHvuqtiBcirKJdq2Mm9wjGce', 'Hanna', '1', '1', null, null, null, '2017-10-18 10:42:06', '2017-10-24 13:19:10', null);
INSERT INTO `ps_user` VALUES ('12', '0', 'GuoJing', '$2a$10$z/YCpq1hySAAOvb4RogvVOq5ymNoD/sNu/QVeVVG8j9JqlNFoQv9G', 'GuoJing', '1', '1', null, null, null, '2017-10-18 10:45:46', '2017-10-24 13:19:13', null);
INSERT INTO `ps_user` VALUES ('14', '0', 'abc', '$2a$10$l2AKz4Iq0Hsu/6ItRf8g3ubDDhORRYVwAklvOX.39Qe6X6CgJRiXe', null, '1', '1', null, null, null, '2017-11-13 12:00:29', '2017-11-13 12:00:29', null);

-- ----------------------------
-- Table structure for ps_watch
-- ----------------------------
DROP TABLE IF EXISTS `ps_watch`;
CREATE TABLE `ps_watch` (
  `watch_userid` int(11) NOT NULL,
  `watch_fansid` int(11) DEFAULT NULL,
  KEY `watch_fansid` (`watch_fansid`),
  KEY `fk_ps_watch_ps_watch_1` (`watch_userid`),
  CONSTRAINT `fk_ps_watch_ps_watch_1` FOREIGN KEY (`watch_userid`) REFERENCES `ps_user` (`user_id`),
  CONSTRAINT `fk_ps_watch_ps_watch_2` FOREIGN KEY (`watch_fansid`) REFERENCES `ps_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ps_watch
-- ----------------------------
INSERT INTO `ps_watch` VALUES ('1', '2');
INSERT INTO `ps_watch` VALUES ('1', '3');
INSERT INTO `ps_watch` VALUES ('2', '1');
SET FOREIGN_KEY_CHECKS=1;
