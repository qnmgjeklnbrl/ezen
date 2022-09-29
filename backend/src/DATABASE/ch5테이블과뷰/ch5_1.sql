-- p.225
									
drop database if exists naver_db;	-- 1. 만약에 해당 db가 있을경우[if exists] 삭제 
create database naver_db; 			-- 2. 데이터베이스 생성 
use naver_db;	 					-- 3. db 사용 선택 [ db 여러개니까 ]
drop table if exists member;		-- 4. 만약에 해당 table이 있을경우 삭제 
create table member					-- 5. member 테이블 생성 
(
	mem_id 		char(8) not null primary key,	-- 회원아이디 [ 만약에 null 이면 오류발생 ] PK
	mem_name 	varchar(10) not null ,			-- 이름[ 만약에 null 이면 오류발생 ]
    mem_number 	tinyint	not null ,				-- 인원수[ 만약에 null 이면 오류발생 ]
    addr		char(2) not null ,				-- 주소 [ 만약에 null 이면 오류발생 ]
    phone1		char(3) null ,					-- 연락처 국번
    phone2		char(8) null ,					-- 연락처 나머지 번호
    height		tinyint unsigned null,  		-- 평균키 	
    -- tinyint( -128 ~ 127 ) unsigned( 0~127 ) : 음수 제거 
    debut_date	date null						-- 데뷔일자
   
);
drop table if exists buy;					-- 6. 테이블 삭제 
create table buy							-- 7. 테이블 생성 
(
	num int not null auto_increment primary key, 
    mem_id	char(8) not null,
    prod_name char(6) not null,
    group_name char(4) null ,
    price	int unsigned not null, 
    amount smallint unsigned not null ,
    foreign key( mem_id ) references member( mem_id) 
);
-- 데이터 입력 
-- 1. 회원가입한다.
insert into member values( 'TWC' , '트와이스' , 9 , '서울' , '02' , '11111111' , 167 , '2015-10-19');
-- 2. 동일한 아이디로 회원가입한다. 불가 [ 아이디 충돌 PK <--> 식별키 ( 식별용도 고유한 값) ]
insert into member values( 'TWC' , '트와이스' , 9 , '서울' , '02' , '11111111' , 167 , '2015-10-19');
-- 3. TWC 회원이 지갑을 구매한다.
insert into buy values( null , 'TWC' ,  '지갑' , '패션' , 30 , 2 );

-------------------------------------------------------------------------
-- 매머드 카페 키오스크 
drop database if exists mmth;
create database mmth;
use mmth;
create table menu(
	mno tinyint auto_increment primary key ,	-- 메뉴번호 [ 자동번호 ] PK
	mname varchar(10) 							-- 메뉴이름
);
create table product(
	pno int auto_increment primary key , 		-- 제품 번호 [ 자동번호 ] PK
	pname varchar(50), 							-- 제품명
    pprice int , 								-- 제품가격
    pcomment varchar(1000),						-- 제품소개
    pamount smallint,							-- 제품재고 
    mno tinyint , 								-- 메뉴 이름 [ 대체 -> 이름 번호 ] 
    foreign key( mno ) references menu( mno ) 
);
create table porder(
	pono int auto_increment	primary key,	 		-- 주문 번호 [ 자동번호 ] PK
    podate datetime 								-- 주문 날짜/시간
);
create table porder_detail( 
	podeno int auto_increment primary key ,			-- 주문 상세 번호 PK
    poamount int,									-- 제품 수량 
    pono 	int	,									-- 주문 번호 
    pno		int ,									-- 제품 이름 [ 대체 -> 제품 번호 ] 
    foreign key( pono ) references porder( pono ),	-- 주문 번호를 	FK로 설정
    foreign key( pno ) references product( pno )	-- 제품 번호를 	FK로 설정
);



	
