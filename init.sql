create database EScore;

use EScore;

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` varchar(16) NOT NULL,
  `class_id` varchar(16) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` char(4) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `qq` varchar(13) DEFAULT NULL,
  `wechat` varchar(32) DEFAULT NULL,
  `idcard` varchar(20) DEFAULT NULL,
  `portrait` mediumblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`(
  `id` varchar(16) NOT NULL,
  `class_id` varchar(16) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` char(4) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `qq` varchar(13) DEFAULT NULL,
  `wechat` varchar(32) DEFAULT NULL,
  `idcard` varchar(20) DEFAULT NULL,
  `portrait` mediumblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`(
  `id` varchar(16) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `teacher_id` int(8) NOT NULL,
  `school_id` int(8) NOT NULL,
  `grade` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `school`;
CREATE TABLE `school`(
  `id` varchar(16) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` varchar(16) NOT NULL,
  `examDate` date NOT NULL,
  `class_rank` int(4) NOT NULL,
  `school_rank` int(4) DEFAULT NULL,
  `math` decimal(5,2) DEFAULT NULL,
  `chinese` decimal(5,2) DEFAULT NULL,
  `english` decimal(5,2) DEFAULT NULL,
  `physics` decimal(5,2) DEFAULT NULL,
  `chemistry` decimal(5,2) DEFAULT NULL,
  `biology` decimal(5,2) DEFAULT NULL,
  `history` decimal(5,2) DEFAULT NULL,
  `geography` decimal(5,2) DEFAULT NULL,
  `politics` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `student` VALUES ('TSZ150405070Q', 'TSZ1506', '谢向鹏', '男', '18', '15210574392', '744722813', 'Eclipse-xp', null, null);

INSERT INTO `class` VALUES ('TSZ1506', '专6', '1001', 'CUMTB', '2015');

INSERT INTO `school` VALUES ('CUMTB', '中国矿业大学（北京）');

INSERT INTO `score` VALUES ('1', 'TSZ150405070Q', '2017-02-24', '1', '1', '150.00', '150.00', '150.00', '130.00', '90.00', '80.00', null, null, null);

INSERT INTO `teacher` VALUES ('1001', 'TSZ1506', '徐慧', '女', null, null, null, null, null, null);