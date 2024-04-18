/*
 Navicat Premium Data Transfer

 Source Server         : 127.0.0.1
 Source Server Type    : MySQL
 Source Server Version : 80300
 Source Host           : 127.0.0.1:3306
 Source Schema         : student_grade_management

 Target Server Type    : MySQL
 Target Server Version : 80300
 File Encoding         : 65001

 Date: 18/04/2024 17:07:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_class
-- ----------------------------
DROP TABLE IF EXISTS `t_class`;
CREATE TABLE `t_class`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '班级id',
  `class_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '班级名称',
  `class_teacher` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '班主任',
  `introduction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '班级简介',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_class
-- ----------------------------
INSERT INTO `t_class` VALUES (1, '计算机科学与技术1班', '张老师', '这是计算机科学与技术1班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (2, '软件工程2班', '李老师', '这是软件工程2班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (3, '数据科学与大数据3班', '王老师', '这是数据科学与大数据3班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (4, '网络工程4班', '赵老师', '这是网络工程4班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (5, '信息安全5班', '刘老师', '这是信息安全5班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (6, '人工智能与机器学习6班', '陈老师', '这是人工智能与机器学习6班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (7, '物联网工程7班', '周老师', '这是物联网工程7班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (8, '电子信息工程8班', '吴老师', '这是电子信息工程8班的简介。', '2024-04-07 09:26:13', '2024-04-07 09:26:13');
INSERT INTO `t_class` VALUES (9, '软件测试与质量管理9班', '孙老师', '这是软件测试与质量管理9班的简介。', '2024-04-07 09:26:14', '2024-04-07 09:26:14');
INSERT INTO `t_class` VALUES (10, '计算机图形学10班', '钱老师', '这是计算机图形学10班的简介。', '2024-04-07 09:26:14', '2024-04-07 09:26:14');

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '课程名称',
  `type` int NOT NULL COMMENT '类型：1-必修，2-选修',
  `code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '课程代码，用于唯一标识课程',
  `instructor` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '所授课程的教师',
  `location` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '上课地点',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '课程状态：1-已开设，0-未开设',
  `teacher_id` bigint NULL DEFAULT NULL COMMENT '教师id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES (1, '计算机基础', 2, 'COMP101', '张老师', '教学楼101', '0', 1, '2024-04-07 09:26:09', '2024-04-15 06:29:42');
INSERT INTO `t_course` VALUES (2, '数据结构与算法', 1, 'DS101', '李老师', '教学楼102', '1', 2, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (3, '数据库原理与应用', 1, 'DB101', '王老师', '教学楼103', '1', 3, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (4, '软件工程导论', 1, 'SE101', '赵老师', '教学楼104', '1', 4, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (5, '网络原理与应用', 1, 'NET101', '刘老师', '教学楼105', '1', 5, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (6, '人工智能基础', 1, 'AI101', '陈老师', '教学楼106', '1', 6, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (7, '物联网技术与应用', 2, 'IOT101', '周老师', '教学楼107', '1', 7, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (8, '云计算与大数据', 2, 'CLOUD101', '吴老师', '教学楼108', '1', 8, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (9, '软件测试与质量管理', 2, 'TEST101', '孙老师', '教学楼109', '1', 9, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (10, '计算机图形学', 2, 'GRAPH101', '钱老师', '教学楼110', '1', 10, '2024-04-07 09:26:09', '2024-04-07 09:26:09');
INSERT INTO `t_course` VALUES (13, 'Mathematics', 1, 'MATH101', 'Alice Smith', 'Room 101', '1', NULL, '2024-04-15 06:40:10', '2024-04-15 06:40:10');
INSERT INTO `t_course` VALUES (14, 'History', 1, 'HIST101', 'Bob Johnson', 'Room 102', '1', NULL, '2024-04-15 06:40:11', '2024-04-15 06:40:11');
INSERT INTO `t_course` VALUES (15, 'Physics', 2, 'PHYS102', 'Charlie Brown', 'Room 103', '1', NULL, '2024-04-15 06:40:11', '2024-04-15 06:40:11');
INSERT INTO `t_course` VALUES (16, 'Biology', 2, 'BIO103', 'David Davis', 'Room 104', '0', NULL, '2024-04-15 06:40:11', '2024-04-15 06:40:11');
INSERT INTO `t_course` VALUES (17, 'Chemistry', 1, 'CHEM101', 'Eva Wilson', 'Room 105', '0', NULL, '2024-04-15 06:40:11', '2024-04-15 06:40:11');

-- ----------------------------
-- Table structure for t_grade
-- ----------------------------
DROP TABLE IF EXISTS `t_grade`;
CREATE TABLE `t_grade`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '成绩id',
  `student_id` bigint NOT NULL COMMENT '学生id',
  `course` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '科目',
  `course_id` bigint NOT NULL COMMENT '课程id',
  `type` int NOT NULL COMMENT '考试类型：1-期中，2-期末',
  `time` date NOT NULL COMMENT '考试时间',
  `score` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '考试分数',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_grade
-- ----------------------------
INSERT INTO `t_grade` VALUES (1, 1, '数学', 1, 2, '2024-04-16', '85', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (2, 1, '语文', 2, 2, '2023-09-15', '90', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (3, 1, '英语', 3, 2, '2023-09-15', '88', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (4, 1, '物理', 4, 2, '2023-09-15', '92', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (5, 1, '化学', 5, 2, '2023-09-15', '87', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (6, 1, '生物', 6, 2, '2023-09-15', '89', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (7, 1, '历史', 7, 2, '2023-09-15', '86', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (8, 1, '地理', 8, 2, '2023-09-15', '91', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (9, 1, '政治', 9, 2, '2023-09-15', '90', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (10, 1, '体育', 10, 2, '2023-09-15', '95', '2024-04-07 09:25:35', '2024-04-11 09:37:46');
INSERT INTO `t_grade` VALUES (11, 1, '数学', 1, 1, '2022-01-15', '85', '2024-04-15 06:41:51', '2024-04-15 06:41:51');
INSERT INTO `t_grade` VALUES (12, 1, '数学', 1, 2, '2022-06-15', '90', '2024-04-15 06:41:51', '2024-04-15 06:41:51');
INSERT INTO `t_grade` VALUES (13, 2, '语文', 2, 1, '2022-02-20', '88', '2024-04-15 06:41:51', '2024-04-15 06:41:51');
INSERT INTO `t_grade` VALUES (14, 2, '语文', 2, 2, '2022-07-20', '92', '2024-04-15 06:41:51', '2024-04-15 06:41:51');
INSERT INTO `t_grade` VALUES (15, 3, '英语', 3, 1, '2022-03-25', '78', '2024-04-15 06:41:51', '2024-04-15 06:41:51');
INSERT INTO `t_grade` VALUES (16, 3, '英语', 3, 2, '2022-08-25', '85', '2024-04-15 06:41:51', '2024-04-15 06:41:51');

-- ----------------------------
-- Table structure for t_msg_board
-- ----------------------------
DROP TABLE IF EXISTS `t_msg_board`;
CREATE TABLE `t_msg_board`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` bigint NOT NULL COMMENT '留言人id',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '留言板内容',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_msg_board
-- ----------------------------
INSERT INTO `t_msg_board` VALUES (2, 2, '非常喜欢这个留言板的设计！', '2024-04-16 03:15:53', '2024-04-16 03:15:53');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '学生id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生姓名',
  `gender` tinyint NOT NULL COMMENT '学生性别：0-男，1-女,2-未知',
  `age` int NOT NULL COMMENT '学生年龄',
  `class_id` bigint NOT NULL COMMENT '班级id',
  `entry_date` date NOT NULL COMMENT '入学日期',
  `contact` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NOT NULL COMMENT '联系方式',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '家庭地址',
  `birth` date NOT NULL COMMENT '出生日期',
  `native_place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '籍贯',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '学生信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1, '张三', 0, 20, 1, '2023-09-01', '13812345678', '北京市朝阳区', '2005-01-01', '北京', '2024-04-07 09:25:52', '2024-04-16 09:10:34');
INSERT INTO `t_student` VALUES (2, '李四', 0, 17, 2, '2023-09-01', '13912345678', '北京市朝阳区', '2006-02-02', '北京', '2024-04-07 09:25:52', '2024-04-16 08:07:58');
INSERT INTO `t_student` VALUES (3, '王五', 0, 18, 3, '2023-09-01', '13712345678', '北京市朝阳区', '2005-03-03', '北京', '2024-04-07 09:25:52', '2024-04-16 08:07:59');
INSERT INTO `t_student` VALUES (4, '赵六', 1, 17, 4, '2023-09-01', '13612345678', '北京市朝阳区', '2006-04-04', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:00');
INSERT INTO `t_student` VALUES (5, '钱七', 1, 18, 5, '2023-09-01', '13512345678', '北京市朝阳区', '2005-05-05', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:01');
INSERT INTO `t_student` VALUES (6, '孙八', 0, 17, 6, '2023-09-01', '13412345678', '北京市朝阳区', '2006-06-06', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:02');
INSERT INTO `t_student` VALUES (7, '周九', 0, 18, 7, '2023-09-01', '13312345678', '北京市朝阳区', '2005-07-07', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:04');
INSERT INTO `t_student` VALUES (8, '吴十', 1, 17, 8, '2023-09-01', '13212345678', '北京市朝阳区', '2006-08-08', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:05');
INSERT INTO `t_student` VALUES (9, '郑十一', 0, 18, 9, '2023-09-01', '13112345678', '北京市朝阳区', '2005-09-09', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:06');
INSERT INTO `t_student` VALUES (10, '马十二', 1, 17, 10, '2023-09-01', '13012345678', '北京市朝阳区', '2006-10-10', '北京', '2024-04-07 09:25:52', '2024-04-16 08:08:08');

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '教师id',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '教师姓名',
  `gender` tinyint NOT NULL COMMENT '性别：1-男，2-女，3-未知',
  `age` int NOT NULL COMMENT '年龄',
  `birth` date NOT NULL COMMENT '出生日期',
  `contact` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '联系方式',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '住址',
  `education` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学历',
  `major` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_german2_ci NOT NULL COMMENT '专业',
  `entry_date` date NOT NULL COMMENT '入职日期',
  `dimission_date` date NOT NULL COMMENT '离职日期',
  `department` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '' COMMENT '所属学院',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `class_id` bigint NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 32 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '教师信息表' ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_teacher
-- ----------------------------
INSERT INTO `t_teacher` VALUES (1, '张老师', 1, 36, '1987-01-01', '13812345678', '北京市海淀区', '本科', '计算机科学与技术', '2010-09-01', '2025-08-31', '计算机学院', '2024-04-07 09:26:00', '2024-04-15 09:48:23', 0);
INSERT INTO `t_teacher` VALUES (2, '李老师', 2, 30, '1992-02-02', '13912345678', '北京市朝阳区', '硕士', '软件工程', '2015-09-01', '2025-08-31', '软件学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (3, '王老师', 1, 40, '1982-03-03', '13712345678', '北京市西城区', '本科', '信息管理', '2005-09-01', '2025-08-31', '信息学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (4, '赵老师', 2, 38, '1984-04-04', '13612345678', '北京市丰台区', '硕士', '计算机应用', '2007-09-01', '2025-08-31', '计算机学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (5, '钱老师', 1, 45, '1977-05-05', '13512345678', '北京市大兴区', '博士', '人工智能', '2000-09-01', '2025-08-31', '计算机学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (6, '孙老师', 2, 33, '1989-06-06', '13412345678', '北京市昌平区', '本科', '软件工程', '2012-09-01', '2025-08-31', '软件学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (7, '周老师', 1, 37, '1985-07-07', '13312345678', '北京市通州区', '硕士', '信息技术', '2009-09-01', '2025-08-31', '信息学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (8, '吴老师', 2, 32, '1990-08-08', '13212345678', '北京市顺义区', '本科', '计算机科学与技术', '2014-09-01', '2025-08-31', '计算机学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (9, '郑老师', 1, 41, '1981-09-09', '13112345678', '北京市石景山区', '博士', '计算机应用', '2003-09-01', '2025-08-31', '计算机学院', '2024-04-07 09:26:00', '2024-04-07 09:26:00', 0);
INSERT INTO `t_teacher` VALUES (10, '张三', 1, 30, '1990-01-01', '123456789', '北京市朝阳区', '本科', '计算机科学与技术', '2010-01-01', '2020-01-01', '计算机学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (11, '李四', 2, 35, '1985-01-01', '987654321', '上海市浦东区', '硕士', '数据科学', '2005-01-01', '2015-01-01', '数据科学学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (12, '王五', 1, 40, '1980-01-01', '567891234', '广州市天河区', '博士', '人工智能', '2000-01-01', '2010-01-01', '人工智能学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (13, '赵六', 2, 45, '1975-01-01', '234567891', '深圳市南山区', '本科', '软件工程', '1995-01-01', '2005-01-01', '软件工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (14, '孙七', 1, 50, '1970-01-01', '678912345', '成都市武侯区', '硕士', '网络工程', '1990-01-01', '2000-01-01', '网络工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (15, '周八', 2, 55, '1965-01-01', '345678912', '重庆市渝中区', '博士', '信息安全', '1985-01-01', '1995-01-01', '信息安全学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (16, '吴九', 1, 60, '1960-01-01', '789123456', '武汉市洪山区', '本科', '物联网', '1980-01-01', '1990-01-01', '物联网学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (17, '郑十', 2, 65, '1955-01-01', '456789123', '南京市鼓楼区', '硕士', '人工智能', '1975-01-01', '1985-01-01', '人工智能学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (18, '钱十一', 1, 70, '1950-01-01', '891234567', '杭州市西湖区', '博士', '数据科学', '1970-01-01', '1980-01-01', '数据科学学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (19, '马十二', 2, 75, '1945-01-01', '123456789', '苏州市工业园区', '本科', '软件工程', '1965-01-01', '1975-01-01', '软件工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (20, '朱十三', 1, 80, '1940-01-01', '234567891', '天津市和平区', '硕士', '网络工程', '1960-01-01', '1970-01-01', '网络工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (21, '胡十四', 2, 85, '1935-01-01', '345678912', '青岛市市南区', '博士', '信息安全', '1955-01-01', '1965-01-01', '信息安全学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (22, '林十五', 1, 90, '1930-01-01', '456789123', '长沙市芙蓉区', '本科', '物联网', '1950-01-01', '1960-01-01', '物联网学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (23, '陈十六', 2, 95, '1925-01-01', '567891234', '西安市雁塔区', '硕士', '人工智能', '1945-01-01', '1955-01-01', '人工智能学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (24, '杨十七', 1, 100, '1920-01-01', '678912345', '沈阳市和平区', '博士', '数据科学', '1940-01-01', '1950-01-01', '数据科学学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (25, '黄十八', 2, 105, '1915-01-01', '789123456', '济南市历下区', '本科', '软件工程', '1935-01-01', '1945-01-01', '软件工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (26, '徐十九', 1, 110, '1910-01-01', '891234567', '无锡市滨湖区', '硕士', '网络工程', '1930-01-01', '1940-01-01', '网络工程学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);
INSERT INTO `t_teacher` VALUES (27, '林二十', 2, 115, '1905-01-01', '912345678', '厦门市思明区', '博士', '信息安全', '1925-01-01', '1935-01-01', '信息安全学院', '2024-04-15 07:17:41', '2024-04-15 07:17:41', 0);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '头像存储地址',
  `intro` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `role` int NULL DEFAULT 1 COMMENT '用户权限：0-管理员，1-学生，2-教师',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', 'admin', 'amdin@gmail.com', 'http://localhost:8080/file/1713430792210.jpg', '这个人很懒，什么也没留下', 0, '2024-04-02 13:48:37', '2024-04-18 08:58:12');

SET FOREIGN_KEY_CHECKS = 1;
