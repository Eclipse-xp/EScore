create database EScore;

use EScore;

SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(8) NOT NULL,
  `class_id` int(8) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` char(4) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `qq` varchar(13) DEFAULT NULL,
  `wechat` varchar(32) DEFAULT NULL,
  `idcard` varchar(20) DEFAULT NULL,
  `portrait` mediumblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher`(
  `id` int(8) NOT NULL,
  `class_id` int(8) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` char(4) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `tel` int(11) DEFAULT NULL,
  `qq` varchar(13) DEFAULT NULL,
  `wechat` varchar(32) DEFAULT NULL,
  `idcard` varchar(20) DEFAULT NULL,
  `portrait` mediumblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `class`;
CREATE TABLE `class`(
  `id` int(8) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `teacher_id` int(8) NOT NULL,
  `school_id` int(8) NOT NULL,
  `grade` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `school`;
CREATE TABLE `school`(
  `id` int(8) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `score`;
CREATE TABLE `score`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(8) NOT NULL,
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
  `feography` decimal(5,2) DEFAULT NULL,
  `politics` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;