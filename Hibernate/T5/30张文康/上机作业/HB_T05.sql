create database db_hr

use db_hr

create table tb_emp (
eid int primary key identity(1,1),
empName varchar(10) not null,
empSex varchar(1) not null,
birthday varchar(15) ,
depId int 
)
 create table tb_userInfo(
 uid int primary key ,
 userName varchar(15) not null,
 userPassword varchar(25) 
 )
 create table tb_dept(
 depId int primary key identity(1,1),
 deptName varchar(20),
 address varchar(30)
 )
 insert into tb_dept values('人力资源部','人民路');
 insert into tb_dept values('人力销售部','商贸路');
 insert into tb_dept values('人力研发部','科技路');
 select * from tb_dept
 select * from tb_userInfo
 select * from tb_emp