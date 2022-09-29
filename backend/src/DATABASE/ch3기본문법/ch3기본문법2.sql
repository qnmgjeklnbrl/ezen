
-- p.141
use market_db;-- 0. DB선택
create table hongong1( -- 0.테이블생성 
	toy_id int ,		-- int형 필드 선언 
    toy_name char(4),	-- char형 필드 선언 [ 최대4글자 ]
    age int 			-- int형 필드 선언 
);
-- 1. insert 
	-- INSERT INTO 테이블명( 필드명1 , 필드명2 , 필드명3 ) VALUES( 값1 , 값2 , 값3 );
	-- INSERT INTO 테이블명 VALUES( 값1 , 값2 , 값3 );	
		-- 필드 개수와 대입할 값의 개수와 순서가 동일할경우 [ 필드명 생략 ]
	-- EX1
insert into hongong1 values( 1 , '우디' , 25 );
	-- EX2	-- age 생략할경우 null값이 자동으로 대입
insert into hongong1( toy_id , toy_name ) values( 2 , '버즈' );
	-- EX3
insert into hongong1( toy_name , age , toy_id ) values( '제시' , 20 , 3 );
	-- 확인 
select * from hongong1; 
 
 -- 2. auto_increment : 자동번호 부여 [ PRIMARY KEY 같이 사용 ]
 create table hongong2(
	toy_id int auto_increment primary key , 
    toy_name char(4) , 
    age int 
 ); -- 0.테이블 생성 
	-- EX1	null -> (중복없는)자동번호 부여 
insert into hongong2 values( null , '보핍' , 25 );
insert into hongong2 values( null , '슬링키' , 22 );
insert into hongong2 values( null , '렉스' , 21 );

	-- EX2 last_insert_id() : 마지막으로 추가된 자동번호 검색 
select last_insert_id();

	-- EX3 ALTER TABLE hongong2 auto_increment = 시작번호;
ALTER TABLE hongong2 auto_increment = 100;
insert into hongong2 values( null , '재남' , 35 );		-- 100

	-- EX4 SET @@auto_increment_increment = 증가단위;
SET @@auto_increment_increment = 3;
insert into hongong2 values( null , '재남' , 35 );		-- 103

SET @@auto_increment_increment = 1;	-- 원상복귀

	-- EX5 여러번의 VALUES
insert into hongong2 values( null , '재남2' , 30 )  , ( null , '재남3' , 40 );
	-- 확인
select * from hongong2;
-- 3. insert into select : select 결과 레코드를 새로운 테이블에 레코드로 추가
	-- EX1
select count(*) from member;	-- 레코드수 
select * from member limit 5;	-- 검색 결과의 레코드 수 제한  5줄 
create table member_addr( mem_id char(8) not null , addr char(2) ); -- 새로운 테이블 
select mem_id , addr from member limit 5;	-- 앞에부터 5명 회원 검색 
insert into member_addr select mem_id , addr from member limit 5; -- 새로운 테이블에 검색된 결과를 추가 
	-- 확인
select * from member_addr;
---------------------------------------------------------------------------------------------------
-- 2.UPDATE 
	-- UPDATE 테이블명 SET 수정필드명=새로운값 , 수정필드명2=새로운값 WHERE 조건식;
	-- EX1 : 회원들 중 주소가 '서울' 이면 주소를 'Seoul' 변경 [ char(2) ]
update member set addr = 'Seoul' where addr ='서울'; -- 오류 [ 1. 워크벤치 설정 변경( update/delete 사용불가 ) ]
update member set addr = 'Seoul' where addr ='서울';	-- 오류 [ 2. addr필드의 자료형 char(2) 이기때문에 글자수 최대2 ]
update member set addr = 'Se' where addr ='서울';	-- 문제해결 
	-- EX2 : 회원들 중 주소가 '경기' 이면 주소를 '수도' phone1 '032' 변경
update member set addr='수도' , phone1 = '032' where addr ='경기';
	-- EX3 : 조건 없는 수정
update member set addr='안산'; --  [ 모든 회원들의 주소가 '안산' ] 
update member set mem_number = mem_number/3;	-- [ 인원수필드에 나누기 3 한 결과로 변경 ] 
	-- 확인
select * from member;
---------------------------------------------------------------------------------------------------
-- 3. DELETE 
	-- DELETE FROM 테이블명 WEHRE 조건
	-- EX1
select * from member where mem_name like '%핑크%'; -- 결과 2줄 
delete from member where mem_name like '%핑크%';	-- %핑크%	vs  _핑크_	
	-- pk <---> fk	[ 연결 ] -- 연결이 되어 있는 상태에서 pk 값 지우면 fk???????.
			-- ????????? 연결된 테이블[buy]에 존재하는 데이터 이므로 삭제 불가능 
delete from member where mem_name = '잇지';	-- ?????????  연결된 테이블[buy]에 존재하지 않기 때문에 삭제 가능 
	-- 확인 
select * from member;
select * from buy;