DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `staff_id` int NOT NULL,
  `staff_name` varchar(10) NOT NULL DEFAULT '',
  `login_password` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `staff` WRITE;
INSERT INTO `staff` VALUES (1,'StuffA','a'),(2,'StuffB','b');
UNLOCK TABLES;

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `student_number` varchar(10) NOT NULL,
  `student_name` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`student_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `memo`;
CREATE TABLE `memo` (
  `memo_id` int NOT NULL AUTO_INCREMENT,
  `student_number` varchar(10) DEFAULT NULL,
  `updated_staff_id` int DEFAULT NULL,
  `memo` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`memo_id`),
  KEY `FK_memo_student_number` (`student_number`),
  KEY `FK_memo_staff_id` (`updated_staff_id`),
  CONSTRAINT `FK_memo_staff_id` FOREIGN KEY (`updated_staff_id`) REFERENCES `staff` (`staff_id`) ON DELETE CASCADE,
  CONSTRAINT `FK_memo_student_number` FOREIGN KEY (`student_number`) REFERENCES `student` (`student_number`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;