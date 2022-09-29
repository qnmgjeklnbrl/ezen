
use market_db;
drop table if exists hongong4;	-- 테이블 삭제 
create table hongong4(			-- 테이블 생성
	tinyint_col tinyint ,		-- TINYINT	1바이트  +-128
    smallint_col smallint ,		-- SMALLINT 2바이트  +-3만 정도
    int_col int ,				-- INT		4바이트	+-21억 정도
	bigint_col bigint,			-- BIGINT 	8바이트 	+-21억 이상
    char_col char( 10 ) ,		-- CHAR(1~255)		문자 고정 길이
	varchar_col varchar( 10 ),	-- VARCHAR(1~16383) 문자 가변 길이
    text_col		text ,		-- TEXT : 1~65535 	
	longtext_col	longtext , 	-- LONGTEXT : 1~42억
	blob_col		blob ,		-- BLOB	: 1~65535 	
	longblob_col	longblob, 	-- LONGTEXT	: 1~42억
    float_col		float	,	-- FLOAT : 소수점 7자리 표현 
    double_col		double	,	-- DOUBLE : 소수점 15자리 표현 
    date_col		date , 		-- DATE : 날짜 저장 [ YYYY-MM-DD ] 
    time_col		time ,		-- TIME : 시간 저장 [ HH:MM:SS ]
    datetime_col	datetime	-- DATETIME : 날짜시간 저장 [ YYYY-MM-DD HH:MM:SS ]
);
select * from hongong4;
------------------------------------------------------------------------------------------------------
-- 1. 제품테이블 
drop table if exists c_product;
create table c_product(
	pno int auto_increment primary key , 	
    pname varchar(100)  ,					
	pbrand varchar(100)  ,
    pprice int ,
    pimgpath text 
);
select * from c_product;

-- 2. 회원테이블 
drop table if exists c_member;
create table c_member(
	mno	int auto_increment primary key , 
    mid varchar(50) , 
    mpw varchar(20) ,
    mname varchar(50) ,
    mphone varchar(13)
);
select * from c_member;

drop table if exists c_backet;
create table c_basket(
	bno int auto_increment primary key , 
	pno int , 					-- 제품번호
    mno int ,					-- 회원번호
    amount smallint ,
    -- foreign key( 현재테이블 fk필드명 ) references pk필드의테이블명( pk필드명 )
	foreign key( pno ) references c_product( pno ) , 	--
    foreign key( mno ) references c_member( mno )
);
select * from c_basket;
-------------------------------------------------
-- 관계 여부 확인 [ ER 다이어그램 ] 













