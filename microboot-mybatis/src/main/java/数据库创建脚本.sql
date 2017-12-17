DROP DATABASE mldn ;
CREATE DATABASE mldn CHARACTER SET UTF8 ;
USE mldn ;
CREATE TABLE dept (
   deptno                  bigint	AUTO_INCREMENT ,
   dname                varchar(50),
   loc					varchar(50) ,
   CONSTRAINT pk_deptno primary key (deptno)
) engine='innodb';
INSERT INTO dept (dname,loc) VALUES ('管理部','北京') ;
INSERT INTO dept (dname,loc) VALUES ('人事部','济南') ;
INSERT INTO dept (dname,loc) VALUES ('财务部','上海') ;
INSERT INTO dept (dname,loc) VALUES ('市场部','广州') ;
INSERT INTO dept (dname,loc) VALUES ('开发部','天津') ;
INSERT INTO dept (dname,loc) VALUES ('营销部','深圳') ;
INSERT INTO dept (dname,loc) VALUES ('后勤部','杭州') ;
INSERT INTO dept (dname,loc) VALUES ('仓储部','沧州') ;