use test;
create table calendar(
	cno int auto_increment primary key ,	-- 일정 식별 번호 
    cdate date not null , 
    ccomment varchar(100) not null 
);
select * from calendar;
-- substring( 필드 , 시작위치[1] , 길이[개수] )	: 
select 
	substring( cdate , 1 , 4 ) as 연도 ,  
	substring( cdate , 6 , 2 ) as 월 ,
    substring( cdate , 9 , 2 ) as 일
from calendar 
where substring( cdate , 1 , 4 ) = 2022 and substring( cdate , 6 , 2 ) = 9  ; 
--
select *
from calendar 
where substring( cdate , 1 , 4 ) = '2022' 
and substring( cdate , 6 , 2 ) = '09';



