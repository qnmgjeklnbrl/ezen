drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(
	mno			int auto_increment primary key ,		-- 회원번호[pk , autokey ] 
	mid			varchar(50) UNIQUE NOT NULL , 			-- 회원아이디 
    mpassword	varchar(50) NOT NULL , 					-- 회원패스워드 
    mname		varchar(50) NOT NULL , 					-- 회원명
    mphone		varchar(15) NOT NULL , 					-- 회원 전화번호 
    memail		varchar(100) UNIQUE NOT NULL , 			-- 회원 이메일 
    maddress	varchar(100)  NULL	 ,					-- 회원 주소 [ 우편번호,도로명주소,지번주소,상세주소]
    mdate		datetime default now() NOT NULL ,				-- 회원 가입일 
	mpoint		int	default 0 NOT NULL							-- 회원 포인트 
);

-- default 레코드 추가시 기본으로 들어가는 값 설정 
-- datetime default now() : 현재 시스템(DB)의 자동날짜
-- insert 문법
	-- 특정필드만 삽입 :  insert into 테이블명( 필드명 , 필드명 , 필드명 ) values( 값1, 값2 , 값3 );
	-- 모든필드 삽입 :   insert into 테이블명 values( 값1, 값2, 값3 );
/*
	select * from member;
	-- 로그인 [ 해당 테이블에 동일한 아이디와 패스워드가 존재하는 검색 ]
		-- select 
		-- select * from 테이블명 where 아이디 = ? and 비밀번호 = ?
	select * from member where mid = '123' and mpassword = '456';
		-- 존재하면 레코드 1개 검색 
		-- 존재하지 않으면 레코드 x 
	select * from member;
	-- 회원정보 호출 
	select * from member where mid = '변수';
	-- 회원 삭제 
	delete from member where mid = 'dfgdfgdf' and mpassword = 'dfgdfg';
*/
DROP TABLE if exists category;
create table category( cno int auto_increment primary key , cname varchar(100)  );
-- 게시판 테이블 생성 
DROP TABLE if exists board;
CREATE TABLE board(
	bno			int auto_increment,  -- 번호  	
    btitle		varchar(1000) NOT NULL, 		-- 제목 		
    bcontent	longtext NULL,			-- 내용	[ 썸머노트 이용해서 사진/영상 대용량 추가 ]
    bfile		longtext NULL,			-- 첨부파일 [ 게시물 1개당 첨부파일 1개 ]
    bdate 		datetime default now() NOT NULL	,	-- 작성일 : 기본값 현재 DB서버 시스템 날짜 
    bview		int default 0 NOT NULL ,				-- 조회수 : 기본값 0 
    cno			int ,									-- 카테고리번호 FK 
    mno 		int	,									-- 작성자 
	constraint bno_pk primary key (bno)  , 
    constraint bcno_fk foreign key (cno) references category(cno) on update cascade ,
    constraint bmno_fk foreign key (mno) references member(mno) on delete cascade
);




-- 1. 한개 테이블 검색 
select * from board;
-- 2. 두개 테이블 검색  [ 1번테이블 레코드수 x 2번테이블 레코드수 ]
select * from member , board;
-- 3. 조건 [ pk-fk 일치 한 경우만 표시 ]
select * from member , board where member.mno = board.mno;
-- 4. 표시할 필드 선택 
select b.bno , b.btitle , b.bcontent , b.bfile , b.bdate , b.bview , b.cno , b.mno , m.mid
from member m , board b where m.mno = b.mno;
-- 5. 모든 글출력 
select b.* , m.mid from member m , board b where m.mno = b.mno;
-- 5. 개별 글출력 
select b.* , m.mid from member m , board b where m.mno = b.mno and bno = 1; -- 게시물번호 



-- 페이징처리 테스트 문법

-- 1. 모든 게시물 수 [ count(*) : 레코드수 = 게시물수 ] 
select count(*) from board;
-- 2. 검색 결과에서 limit 이용한 개수 제한 [ limit 시작점 , 개수 ] 
select * from board limit 0 , 3;
-- 3. 정렬 [ 작성일 기준으로 정렬 desc:내림차순 / asc : 오름차순   ( 날짜 최신일수록 크다. ) ]
select * from board order by bdate desc;
-- 
select * from board order by bdate desc limit 0 , 3 ; -- 최신글 3개 	[ 1페이지 ] 
select * from board order by bdate desc limit 3 , 3 ; -- 최신글 3개 	[ 2페이지 ] 
select * from board order by bdate desc limit 6 , 3 ; -- 최신글 3개 	[ 3페이지 ] 
select * from board order by bdate desc limit 9 , 3 ; -- 최신글 3개 	[ 4페이지 ] 
-- 앞전 코드 + 정렬 
select b.* , m.mid from member m , board b where m.mno = b.mno order by b.bdate desc;
-- 앞전 코드 + 정렬 + 출력제한
select b.* , m.mid from member m , board b where m.mno = b.mno order by b.bdate desc limit 0 , 3 ;
