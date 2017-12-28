create database db_user


use db_user

create table tb_users(
uid int primary key identity(1,1),
uname varchar(20) not null,
upwd varchar(30) not null,
birthday varchar(20) ,
sex varchar(1), 
active int 
)
