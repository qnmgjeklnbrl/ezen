/*
DDL : 정의어[만들기]
	1. CREATE	: D,T,V 생성
	2. ALTER		: D,T,V 수정
	3. DROP		: D,T,V 삭제
DML : 조작어[가공]
	1. SELECT		: 레코드 검색
	2. INSERT		: 레코드 삽입
	3. UPDATE	: 레코드 수정
	4. DELETE		: 레코드 삭제
    
*/
-- 1. DB 삭제 
-- drop database market_db;			-- market_db 데이터베이스 삭제 [ 오류 : 해당 db 존재하지 않기 때문에 ]
drop database if exists market_db; 	-- 만일 해당 db명이 존재하면 해당 db 삭제 
-- 2. DB 생성 
create database market_db;			-- market_db 데이터베이스 생성 [ 왼쪽 메뉴 확인 :  새로고침 ]
-- 3. 108. 회원테이블 생성 
use market_db;						-- use db명 	: 해당 db 사용[선택]
drop table if exists member;		-- 만일 테이블이 존재할경우 해당 테이블 삭제
create table member(
	mem_id char(8) not null primary key ,  -- 1. 최대 8글자 저장하는 회원아이디 [ 중복불가능 - 식별키 , 공백 불가능  ]
		-- char(길이) : 길이만큼 문자 저장  char(8) : 최대 8글자 저장[ 만일 8글자 초과이면 저장 실패 ]
		-- not null : 공백 저장 불가능 [ 만일 공백이 있으면 저장 실패 ] 
		-- primary key : *(기본키) 식별키[필드] , 필드내 데이터 중복불가능 ( 주민등록번호,학번,회원번호,사번 등 )
    mem_name varchar(10) not null ,			-- 2. 최대 10글자 저장하는 회원이름 [ 공백 불가능 ] 
		-- varchar(길이) : 가변길이 : 저장할 데이터의 길이가 일정하지 않을떄 
		--         vs 
		-- char(길이) : 고정길이 : 저장할 데이터의 길이가 일정할때
		-- 가변길이 : 저장된 데이터 만큼 메모리할당 , varchar(8) 에서 'ABC' 저장시 5칸 메모리 자동 제거 
		-- 고정길이 : 선언된 길이 만큼 고정 메모리 할당 , char(8) 에서 'ABC' 저장시 8칸 메모리 고정[ 3칸:ABC 5칸:빈공간]
    mem_number int not null ,				-- 3. 정수(+-20억)를 저장하는 인원수 [ 공백 불가능 ]
		-- int : 정수 +-20억 정도 저장가능	
    addr char(2) not null ,					-- 4. 최대 2글자 저장하는 주소 [ 공백 불가능 ]
    phone1 char(3) ,						-- 5. 최대 3글자 저장하는 국번 [ 공백 가능 ]
    phone2 char(8) ,						-- 6. 최대 8글자 저장하는 전화번호 [ 공백 가능 ] 
    height	smallint , 						-- 7. 정수(+-3만)를 저장하는 평균 키
		-- smallint : 정수 +-3만 정도 저장가능 		
	debut_date date 						-- 8. 날짜형식을 저장하는 데뷔날짜 
		-- date : 날짜 
);		-- create table 테이블명( 필드명1 자료형 속성 , 필드명2 자료형 속성 , 필드명3 자료형 속성 );
select * from member;  -- 생성된 테이블 검색  
-- 3. 109. 구매테이블 만들기
drop table if exists buy;				-- 만일 테이블이 존재할경우 해당 테이블 삭제
create table buy(
	num int auto_increment not null primary key , 	-- 1. 순번[ pk , 자동번호:auto_increment ]
    -- auto_increment : 레코드 추가시 자동번호 부여 	
    mem_id char(8) not null ,						-- 2. 회원아이디 [ member 테이블의 필드와 이름이 같다 ] 
    prod_name char(6) not null ,					-- 3. 제품 이름 
    group_name char(4) ,							-- 4. 분류 
    price int not null ,							-- 5. 가격 
    amount smallint not null ,						-- 6. 수량 
    foreign key( mem_id ) references member(mem_id) 	-- 7. member테이블의 mem_id(pk) 필드와 연결  ( 관계 )
    -- references 참조 : 다른 것과 참조[본다/연결/가져오기 등 ] 한다.
    -- foreign key( 외래키 ) references 테이블명(기본키)
);
select * from buy;
/*
	관계 : 서로 다른 테이블끼리 연결 
    
    member테이블					buy 테이블 
		mem_id [ PK 필드 ] 			mem_id [ FK 필드 ]
	
	만일 '트와이스' 가 제품 구매할경우
		-- 1. member테이블의 mem_id가 '트와이스' 존재한다는 가정하에
		-- 2. 트와이스가 제품 구매시 buy테이블의 mem_id에 '트와이스' 추가 
        -- 트와이스가 제품 구매 
	만일 '트와이스' 가 제품 3개 구매할경우
    
				PK		<------------------>   FK 
		member테이블 [ primary key]		buy 테이블 [ foreign key ]
			mem_id : '트와이스'				mem_id : '트와이스'	지갑
											mem_id : '트와이스'	냉방고
											mem_id : '트와이스'	가방    
*/
/* ---------------------------- 예제파일 -----------------------------*/
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);


/* ---------------------------- 예제  -----------------------------*/
-- 1. DB 선택
use market_db;
-- 2. select ~ from 
select * from member;
	-- select : 테이블에서 데이터 검색할때 사용되는 예약어
    -- * : (와일드카드) 모든것 의미 = 모든 필드 뜻
    -- from : 테이블 가져온다는 의미 
    -- member : 조회할 테이블명 
select mem_name from member; -- 2-1 특정 필드 검색 [  회원테이블에서 회원명 검색 ] 
select addr , debut_date , mem_name from member; -- 2-2특정 필드 검색 [ 회원테이블에서 주소,데뷔일자,회원명 검색 ]
	-- 2-3 별칭 [ 결과(쿼리) 의 필드명 바꾸기 ]
		-- 1. 필드명 as 별칭명 2. 필드명 별칭명  3. 필드명 as "별칭 명"  4. 필드명 as 별칭_명 
select addr as 주소 , debut_date as '데뷔 일자' , mem_name as 회원_명 from member; 

-- 3. select ~ from ~ where : 특정한 조건만 조회하기
	-- select 필드명 from 테이블명 where 조건식 
select * from member where mem_name ='블랙핑크';	-- 3-1 회원명이 '블랙핑크'인 모든 필드 검색 
select * from member where mem_number = 4;		-- 3-2 회원의 인원수가 4 인 모든 필드 검색 
select mem_id , mem_name from member where height <= 162;	-- 3-3 회원의 평균키가 162 이하인 특정 필드 검색 
	-- 3-4 회원의 평균키가 165 이상 이면서 회원의 인원수가 6초과인 특정 필드 검색 
select mem_name , height , mem_number from member where height >= 165 and mem_number > 6;
	-- 3-5 회원의 평균키가 165 이상 이거나 회원의 인원수가 6초과인 특정 필드 검색
select mem_name , height , mem_number from member where height >= 165 or mem_number > 6;
	-- 3-6 AND <----> BETWEEN ~ AND : ~ 사이 	[ 평균키 163~165 검색 ]
select mem_name , height , mem_number from member where height between 163 and 165;
select mem_name , height , mem_number from member where height >= 163 and height <= 165;
	-- 3-7 OR <-----> IN  : 하나라도 포함된 		[ 주소가 경기 혹은 전남 혹은 경남 검색 ] 
select mem_name , addr from member where addr = '경기' or addr ='전남' or addr ='경남';
select mem_name , addr from member where addr in( '경기' , '전남' , '경남');
	-- 3-8 like : 패턴검색[ 일부 글자 검색 ]
		-- % : 모든 문자 대응  vs  _ : _개수만큼 문자 대응 
        -- 김% : 김으로 시작하는 모든 글자			vs  김_ : 김으로 시작하는 2글자 		
        -- %김% : 김이 포함된 문자				vs	_김_	: 2번째 글자가 '김' 인 3글자
        -- %김 : 김으로 끝나는 모든 글자			vs  _김  : 김으로 끝나는 2글자 
select * from member where mem_name = '우주소녀';	-- 회원명이 '우주소녀' 와 같으면 레코드 검색 
select * from member where mem_name like '우%';	-- 회원명이 '우' 시작하는 레코드 검색 
select * from member where mem_name like '__핑크';	-- 회원명이 4글자이면서 '핑크' 끝나는 레코드 검색 


/*---------------  연산자 ------------------*/
/*
where 조건식
	1. 산술연산자 : 
		+ : 더하기 
		- : 빼기 
		* : 곱하기 
		/ : 나누기 
		DIV : 몫
		MOD : 나머지	
	2. 비교연산자
		>= 이상
		<= 이하
		> 초과
		< 미만 
		= 같다  [ vs 자바( =대입 == 같다 ) ]
		!= , <> : 같지않다.
	3. 논리연산자
		AND : 이면서 면서 이고 모두 그리고 [ 비교연산자가 모두 참 이면 참 ]
		OR : 이거나 거나 또는 하나라도 	[ 비교연산자가 하나라도 참 이면 참
		NOT : 부정 
	4. 기타연산자
		IN( 값1 , 값2 , 값3 , 값4 ) 	: 값1~값4 하나라도 존재하면 
		BETWEEN 값1 AND 값2 	: 값1 ~ 값2 사이에 존재하면 
		LIKE			: 패턴검색 
			% : 모든문자수 대응  	_ : _개수만큼 문자수 대응 
	5. NULL(공백) 관련 연산자 
		IS NULL 		: NULL 이면 	[ 필드명 = NULL (X)   	vs  필드명 is null (O) ]
		IS NOT NULL 	: NULL 이 아니면	[ 필드명 != NULL (X)	vs  필드명 is not null (o) ]
*/
-- 1. p.125 ORDER BY : 정렬  [ 모든 명령어 마지막에 작성 ]
	-- SELECT * FROM 테이블명 ORDER BY 기준필드 ASC/DESC;	[ ASC : 오름차순(생략시)  / DESC : 내림차순 ] 
select mem_id , mem_name , debut_date from member order by debut_date; 		-- 검색결과를 데뷔일자 기준으로 오름차순 
select mem_id , mem_name , debut_date from member order by debut_date desc;	-- 검색결롸를 데뷔일짜 기준으로 내림차순 
	-- SELECT * FROM 테이블명 WHERE 조건식 ORDER BY 기준필드 ASC/DESC;
select mem_id , mem_name , debut_date , height from member order by height desc where height >= 164; -- 오류발생
select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc ; -- 오류해결
	-- SELECT * FROM 테이블명 ORDER BY 기준필드1 DESC , 기준필드2 ASC;		다수 정렬 [ 1차 정렬내에서 동일한 데이터끼리 2차 정렬 ] 
select mem_id , mem_name , debut_date , height from member where height >= 164 order by height desc , debut_date asc;
	/*
		이름		학년 점수		-> 학년 정렬 	-> 	이름		학년 점수   -> 점수 정렬 ->	이름		학년 점수
		유재석	1	50						유재석	1	50					신동엽	1	60
		감호동	3	70						신동엽	1	60					유재석	1	50
        신동엽	1	60						감호동	3	70					감호동	3	70
    */
-- 2. LIMIT : 출력의 개수 제한 
	-- LIMIT 시작(0) , 개수 	: 시작부터 개수만큼 레코드 결과 제한 
select * from member limit 3;	-- 전체중 앞에서 3개 레코드만 출력 	[ 0 , 3 ]
select * from member limit 0 , 3 ;
select mem_name , height  from member order by height desc;
-- 결과 : 소녀시대 , 잇지 , 트와이스 , 여자친구 , 마마무 , 에이핑크 ~~~~ 오마이걸 
--         0      1       2       3       4       5		~~    10
select mem_name , height  from member order by height desc limit 3 , 2 ;

-- 3. DISTINCT  : 결과에서 중복 데이터 제거 
select addr from member;			-- 동일한 주소가 존재
select distinct addr from member;	-- 중복 제거 

-- 4. GROUP BY 절 : 특정 필드 그룹 
select mem_id , amount from buy order by mem_id;	-- 회원아이디 기준으로 정렬 
	-- 집계 함수[ 미리 만들어진 동작/코드 ] 
	-- 1. sum( 필드명 ) : 해당 필드의 데이터 총합
	-- 2. avg( 필드명 ) : 해당 필드의 데이터 평균 
    -- 3. min( 필드명 ) : 해당 필드의 데이터 최댓값 
    -- 4. max( 필드명 ) : 해당 필드의 데이터 최솟값 
    -- 5. count( 필드명 ) : 해당 필드의 데이터 개수 
    -- 		count(*)	: 모든 레코드 개수     
select sum(amount) from buy;						-- 구매테이블에서 수량의 총합계 
select avg(amount) from buy;						-- 수량의 평균 
select min(amount) from buy;						-- 수량의 최솟값 
select max(amount) from buy;						-- 수량의 최댓값 
select count(amount) from buy;						-- 수량의 레코드 개수 	[ null 제외한 ]  
select count(*)	from buy;							-- 모든 레코드 개수 	[ null 포함 ] 
select count(distinct amount) from buy;				-- 레코드 개수 [ 중복 제거 ] 
-- 특정 집계 [ ~~별 합계 , ~~끼리 합계 등 ]
select mem_id , sum(amount) as 수량합계 from buy group by mem_id;			-- 회원아이디 별 수량 합계 
select mem_id as 회원_아이디 , sum( price*amount )  as 총_구매금액 from buy group by mem_id;	-- 회원아이디 별  금액(가격*수량) 합계
select mem_id , avg( amount ) as 수량평균 from buy group by mem_id;		-- 회원아이디 별 수량 평균 
select mem_id , count( phone1 ) as 연락처 from member group by mem_id;	-- 회원아이디 별 연락처가 있는 회원 수 [ null 제외 ]
select mem_id , count( * ) as 회원수 from member group by mem_id;			-- 회원아이디 별 회원수 			[ null 포함 ]

-- 5. HAVING 절 : 그룹 조건 
	-- where 일반조건( 그룹전 ) vs having 그룹조건 ( 그룹후 ) 
select mem_id as 회원아이디 , sum( price * amount ) as 총구매금액
from buy
where sum( price * amount ) > 1000		-- 오류 발생 : sum() : 집계함수 이므로 그룹 후에 조건 사용 가능 
group by mem_id;

select mem_id as 회원아이디 , sum( price * amount ) as 총구매금액
from buy
group by mem_id
having sum( price * amount ) > 1000			-- 해결 방안 : sum() 그룹 집계 이므로 그룹 후에 조건 사용 가능 
order by sum( price * amount ) desc;



