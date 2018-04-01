/*
Navicat SQL Server Data Transfer

Source Server         : sqlserver
Source Server Version : 120000
Source Host           : localhost:1433
Source Database       : db_exam
Source Schema         : dbo

Target Server Type    : SQL Server
Target Server Version : 120000
File Encoding         : 65001

Date: 2018-01-02 14:37:13
*/


-- ----------------------------
-- Table structure for course_major
-- ----------------------------
DROP TABLE [dbo].[course_major]
GO
CREATE TABLE [dbo].[course_major] (
[id] int NOT NULL IDENTITY(1,1) ,
[csId] int NOT NULL ,
[mjId] int NOT NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[course_major]', RESEED, 29)
GO

-- ----------------------------
-- Records of course_major
-- ----------------------------
SET IDENTITY_INSERT [dbo].[course_major] ON
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'1', N'1', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'2', N'2', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'3', N'3', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'4', N'4', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'5', N'5', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'6', N'6', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'7', N'7', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'8', N'8', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'9', N'9', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'10', N'10', N'1')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'11', N'1', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'12', N'2', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'13', N'3', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'14', N'4', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'15', N'5', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'16', N'6', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'17', N'7', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'18', N'8', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'19', N'9', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'20', N'10', N'2')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'21', N'1', N'3')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'22', N'2', N'3')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'23', N'1', N'4')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'24', N'2', N'4')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'25', N'1', N'5')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'26', N'2', N'5')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'27', N'3', N'5')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'28', N'4', N'5')
GO
GO
INSERT INTO [dbo].[course_major] ([id], [csId], [mjId]) VALUES (N'29', N'5', N'5')
GO
GO
SET IDENTITY_INSERT [dbo].[course_major] OFF
GO

-- ----------------------------
-- Table structure for t_classInfo
-- ----------------------------
DROP TABLE [dbo].[t_classInfo]
GO
CREATE TABLE [dbo].[t_classInfo] (
[cCode] varchar(20) NOT NULL ,
[cName] varchar(20) NOT NULL ,
[mjId] int NOT NULL ,
[insId] int NOT NULL ,
[iecId] int NOT NULL ,
[cDate] date NOT NULL ,
[g1Num] int NULL ,
[g2Num] int NULL ,
[g3Num] int NULL ,
[csId] int NULL DEFAULT ((0)) ,
[cRemark] varchar(50) NULL 
)


GO

-- ----------------------------
-- Records of t_classInfo
-- ----------------------------

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE [dbo].[t_course]
GO
CREATE TABLE [dbo].[t_course] (
[csId] int NOT NULL IDENTITY(1,1) ,
[csName] varchar(20) NOT NULL ,
[stage] varchar(2) NOT NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[t_course]', RESEED, 10)
GO

-- ----------------------------
-- Records of t_course
-- ----------------------------
SET IDENTITY_INSERT [dbo].[t_course] ON
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'1', N'计算机基础', N'G1')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'2', N'PS', N'G1')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'3', N'SQLServer', N'G1')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'4', N'Java', N'G1')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'5', N'JSP', N'G2')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'6', N'JavaScript', N'G2')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'7', N'Struts2', N'G2')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'8', N'Hibernate', N'G2')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'9', N'Spring', N'G3')
GO
GO
INSERT INTO [dbo].[t_course] ([csId], [csName], [stage]) VALUES (N'10', N'MyBatis', N'G3')
GO
GO
SET IDENTITY_INSERT [dbo].[t_course] OFF
GO

-- ----------------------------
-- Table structure for t_machineTest
-- ----------------------------
DROP TABLE [dbo].[t_machineTest]
GO
CREATE TABLE [dbo].[t_machineTest] (
[qId] int NOT NULL IDENTITY(1001,1) ,
[qTitle] varchar(100) NOT NULL ,
[degree] varchar(4) NOT NULL ,
[qsId] int NOT NULL ,
[chapter] varchar(2) NULL 
)


GO

-- ----------------------------
-- Records of t_machineTest
-- ----------------------------
SET IDENTITY_INSERT [dbo].[t_machineTest] ON
GO
SET IDENTITY_INSERT [dbo].[t_machineTest] OFF
GO

-- ----------------------------
-- Table structure for t_major
-- ----------------------------
DROP TABLE [dbo].[t_major]
GO
CREATE TABLE [dbo].[t_major] (
[mjId] int NOT NULL IDENTITY(1,1) ,
[mjName] varchar(20) NOT NULL 
)


GO
DBCC CHECKIDENT(N'[dbo].[t_major]', RESEED, 5)
GO

-- ----------------------------
-- Records of t_major
-- ----------------------------
SET IDENTITY_INSERT [dbo].[t_major] ON
GO
INSERT INTO [dbo].[t_major] ([mjId], [mjName]) VALUES (N'1', N'高软')
GO
GO
INSERT INTO [dbo].[t_major] ([mjId], [mjName]) VALUES (N'2', N'3G4G')
GO
GO
INSERT INTO [dbo].[t_major] ([mjId], [mjName]) VALUES (N'3', N'网销')
GO
GO
INSERT INTO [dbo].[t_major] ([mjId], [mjName]) VALUES (N'4', N'UI')
GO
GO
INSERT INTO [dbo].[t_major] ([mjId], [mjName]) VALUES (N'5', N'WEB')
GO
GO
SET IDENTITY_INSERT [dbo].[t_major] OFF
GO

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE [dbo].[t_student]
GO
CREATE TABLE [dbo].[t_student] (
[sid] varchar(20) NOT NULL ,
[sname] varchar(20) NOT NULL ,
[sex] varchar(2) NOT NULL ,
[enterSchool] varchar(4) NOT NULL ,
[cCode] varchar(20) NOT NULL ,
[photo] varchar(50) NULL ,
[birthday] varchar(20) NULL ,
[IDCard] varchar(18) NULL ,
[pOutlook] varchar(10) NULL ,
[province] varchar(20) NULL ,
[city] varchar(20) NULL ,
[tel] varchar(11) NULL ,
[address] varchar(40) NULL ,
[ptel] varchar(11) NULL ,
[pRelation] varchar(10) NULL ,
[hostelBuil] varchar(10) NULL ,
[hostelNo] varchar(10) NULL ,
[baseInfo] varchar(50) NULL ,
[eduBg] varchar(20) NULL ,
[remarks] varchar(20) NULL 
)


GO

-- ----------------------------
-- Records of t_student
-- ----------------------------

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE [dbo].[t_teacher]
GO
CREATE TABLE [dbo].[t_teacher] (
[tid] varchar(20) NOT NULL ,
[tname] varchar(20) NOT NULL ,
[sex] varchar(2) NOT NULL ,
[birthday] varchar(20) NULL ,
[education] varchar(20) NULL ,
[tel] varchar(11) NULL ,
[post] varchar(10) NOT NULL ,
[remarks] varchar(100) NULL 
)


GO

-- ----------------------------
-- Records of t_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE [dbo].[t_user]
GO
CREATE TABLE [dbo].[t_user] (
[name] varchar(20) NOT NULL ,
[pwd] varchar(20) NOT NULL ,
[role] int NOT NULL 
)


GO

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO [dbo].[t_user] ([name], [pwd], [role]) VALUES (N'admin', N'123456', N'4')
GO
GO

-- ----------------------------
-- Table structure for t_writtenTest
-- ----------------------------
DROP TABLE [dbo].[t_writtenTest]
GO
CREATE TABLE [dbo].[t_writtenTest] (
[qId] int NOT NULL IDENTITY(1001,1) ,
[qType] varchar(10) NOT NULL ,
[qTitle] varchar(100) NOT NULL ,
[optionA] varchar(100) NOT NULL ,
[optionB] varchar(100) NOT NULL ,
[optionC] varchar(100) NOT NULL ,
[optionD] varchar(100) NOT NULL ,
[answer] varchar(4) NULL DEFAULT ('略') ,
[degree] varchar(4) NOT NULL ,
[qsId] int NOT NULL ,
[chapter] varchar(2) NULL 
)


GO

-- ----------------------------
-- Records of t_writtenTest
-- ----------------------------
SET IDENTITY_INSERT [dbo].[t_writtenTest] ON
GO
SET IDENTITY_INSERT [dbo].[t_writtenTest] OFF
GO

-- ----------------------------
-- Indexes structure for table course_major
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table course_major
-- ----------------------------
ALTER TABLE [dbo].[course_major] ADD PRIMARY KEY ([id])
GO

-- ----------------------------
-- Indexes structure for table t_classInfo
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_classInfo
-- ----------------------------
ALTER TABLE [dbo].[t_classInfo] ADD PRIMARY KEY ([cCode])
GO

-- ----------------------------
-- Indexes structure for table t_course
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_course
-- ----------------------------
ALTER TABLE [dbo].[t_course] ADD PRIMARY KEY ([csId])
GO

-- ----------------------------
-- Indexes structure for table t_machineTest
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_machineTest
-- ----------------------------
ALTER TABLE [dbo].[t_machineTest] ADD PRIMARY KEY ([qId])
GO

-- ----------------------------
-- Indexes structure for table t_major
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_major
-- ----------------------------
ALTER TABLE [dbo].[t_major] ADD PRIMARY KEY ([mjId])
GO

-- ----------------------------
-- Indexes structure for table t_student
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_student
-- ----------------------------
ALTER TABLE [dbo].[t_student] ADD PRIMARY KEY ([sid])
GO

-- ----------------------------
-- Indexes structure for table t_teacher
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_teacher
-- ----------------------------
ALTER TABLE [dbo].[t_teacher] ADD PRIMARY KEY ([tid])
GO

-- ----------------------------
-- Indexes structure for table t_user
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_user
-- ----------------------------
ALTER TABLE [dbo].[t_user] ADD PRIMARY KEY ([name])
GO

-- ----------------------------
-- Indexes structure for table t_writtenTest
-- ----------------------------

-- ----------------------------
-- Primary Key structure for table t_writtenTest
-- ----------------------------
ALTER TABLE [dbo].[t_writtenTest] ADD PRIMARY KEY ([qId])
GO
