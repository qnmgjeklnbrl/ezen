use naver_db;
drop table if exists buy , member;
create table member
(
	mem_id char(8) not null primary key ,
    mem_name varchar(10) not null  , 
    height tinyint unsigned null 
);
-- 생성하는 순서 : 1. PK --> FK
-- 삭제하는 순서 : 1. FK --> PK
-- DESCRIBE 테이블명; 테이블의 필드 속성 확인 
DESCRIBE member;
-- 
DROP TABLE IF EXISTS member;
create table member(
	mem_id char(8) not null ,
    mem_name varchar(10) not null ,
    height tinyint unsigned null ,
    CONSTRAINT PRIMARY KEY mem_id_pk (mem_id)
);
-- 제약조건[CONSTRAINT] 추가 
ALTER TABLE member ADD CONSTRAINT PRIMARY KEY(mem_id);
ALTER TABLE member DROP PRIMARY KEY;

-- 
DROP TABLE IF EXISTS buy;
create table buy(
	num int auto_increment not null primary key , 
    mem_id char(8) not null , 
    prod_name char(6) not null ,
    foreign key(mem_id) references member( mem_id )
);






