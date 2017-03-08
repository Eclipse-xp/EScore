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
INSERT INTO `student` VALUES ('TSZ150405011Q', 'TSZ1506', '王二小', '男', '19', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405012Q', 'TSZ1506', '成龙', '男', '19', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405013Q', 'TSZ1506', '索隆', '男', '28', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405014Q', 'TSZ1506', '那谁', '男', '28', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405015Q', 'TSZ1506', '郭敬明', '男', '68', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405016Q', 'TSZ1506', '周杰伦', '男', '38', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405017Q', 'TSZ1506', '韩寒', '男', '38', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405018Q', 'TSZ1506', '科比', '男', '38', '15210574392', '744722813', 'Eclipse-xp', null, null);
INSERT INTO `student` VALUES ('TSZ150405019Q', 'TSZ1506', '郭靖', '男', '38', '15210574392', '744722813', 'Eclipse-xp', null, null);

INSERT INTO `class` VALUES ('TSZ1506', '专6', '1001', 'CUMTB', '2015');

INSERT INTO `school` VALUES ('CUMTB', '中国矿业大学（北京）');

INSERT INTO `score` VALUES ('1', 'TSZ150405070Q', '2017-02-24', '1', '1', '150.00', '150.00', '150.00', '130.00', '90.00', '80.00', null, null, null);
INSERT INTO `score` VALUES ('2', 'TSZ150405011Q', '2017-02-24', '3', '3', '140.00', '148.00', '150.00', '127.00', '80.00', '79.00', null, null, null);
INSERT INTO `score` VALUES ('3', 'TSZ150405012Q', '2017-02-24', '2', '2', '150.00', '147.00', '150.00', '127.00', '90.00', '80.00', null, null, null);
INSERT INTO `score` VALUES ('4', 'TSZ150405013Q', '2017-02-24', '5', '5', '145.00', '131.00', '122.00', '130.00', '81.00', '79.00', null, null, null);
INSERT INTO `score` VALUES ('5', 'TSZ150405014Q', '2017-02-24', '4', '4', '147.00', '132.00', '133.00', '125.00', '78.00', '80.00', null, null, null);
INSERT INTO `score` VALUES ('6', 'TSZ150405015Q', '2017-02-24', '7', '7', '138.00', '129.00', '120.00', '127.00', '80.00', '78.00', null, null, null);
INSERT INTO `score` VALUES ('7', 'TSZ150405016Q', '2017-02-24', '8', '8', '110.00', '120.00', '130.00', '100.00', '66.00', '66.00', null, null, null);
INSERT INTO `score` VALUES ('8', 'TSZ150405017Q', '2017-02-24', '6', '6', '139.00', '130.00', '121.00', '128.00', '81.00', '77.00', null, null, null);
INSERT INTO `score` VALUES ('9', 'TSZ150405018Q', '2017-02-24', '9', '9', '111.00', '119.00', '125.00', '99.00', '68.00', '66.00', null, null, null);
INSERT INTO `score` VALUES ('10', 'TSZ150405019Q', '2017-02-24', '10', '10', '100.00', '100.00', '90.00', '130.00', '60.00', '40.00', null, null, null);

INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2017-01-24', '2', '3', '140.00', '147.00', '148.00', '125.00', '87.00', '76.00', null, null, null);
INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2016-12-24', '5', '5', '146.00', '147.00', '149.00', '120.00', '80.00', '66.00', null, null, null);
INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2016-11-24', '3', '3', '147.00', '146.00', '149.00', '129.00', '89.00', '79.00', null, null, null);
INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2016-10-24', '25', '40', '117.00', '116.00', '119.00', '109.00', '69.00', '69.00', null, null, null);
INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2016-11-24', '4', '7', '140.00', '145.00', '148.00', '119.00', '79.00', '79.00', null, null, null);
INSERT INTO `score` VALUES ( null,'TSZ150405070Q', '2016-11-24', '11', '15', '127.00', '136.00', '139.00', '119.00', '79.00', '70.00', null, null, null);

INSERT INTO `teacher` VALUES ('1001', 'TSZ1506', '徐慧', '女', null, null, null, null, null, null);