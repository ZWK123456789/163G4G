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

 create table tb_roles(
 rolesId int primary key identity(1,1),
 rolesName varchar(20) not null,
 memo varchar(20),
 )

 create table roles_userInfo(
 rolesId int not null,
 uid int not null
 )
 select * from tb_dept
 select * from tb_emp


 select * from tb_userInfo 
 select * from tb_roles
 select * from roles_userInfo
 

 insert into tb_dept values('研发部','上海'),('销售部','珠海'),('办公部','北京')

					