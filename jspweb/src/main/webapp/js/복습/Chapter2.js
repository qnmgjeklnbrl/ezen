/*	
 	자료 : 데이터(정보/값)
 	자료형 : 데이터 타입
 		1. 숫자 number  2.문자열 string  3.불 boolean 
	1. 숫자 : 소수점이 있는 숫자와 없는 숫자를 모두 같은 자료형 
	2.
		문자열 : ' ' 혹은 " "
		문자열 길이 : 문자열.length
	3. 
		불 :  true 혹은 fasle	
	
	- 연산자  [ 자바 유사 ]
		1. 산술연산자 : +더하기 -빼기 *곱하기 /나누기 %나누기(나머지)
		2. 비교연산자 : >초과 <미만 >=이상 <=이하 ===같다 !==같지않다
		3. 논리연산자 : &&and ||or !부정
		4. 대입연산자 : = 대입 +=더한후에대입 -=빼기후에대입 *= /- %=
		5. 증감연산자 
		
	- 자료형 검사 : typeof( 데이터 )	: 해당 데이터의 자료형 확인 
	
	- 자료형변환 
		Number( 데이터 ) : 	숫자형 변환 
		String( 데이터 ) : 	문자열형 변환
		Boolean( 데이터 ) :   불 형 변환
	- 입력 	  메시지 : prompt('메시지');
	- 확인/취소 메시지 : confirm('메시지');
	

	
*/
console.log("가나다라")			// 자바와 동일 
console.log('가나다라')
console.log("가나"+"다라")			// 자바와 동일 
console.log("가나다라".length )	// 자바와 유사
console.log( 273 )
console.log( 273.275 )
/*
	상수 : 고정된 값 [ 항상 같은 수 ]		const
	변수 : 변하는 값 [ 변할 수 있는 수]	let
	undefined
*/
const pi = 3.141592	//상수 선언 
console.log(pi)
// pi = 4.14			//[오류] 상수는 변경 불가 [ java  : final static ]

let pi2 = 3.141592
console.log(pi2)
pi2 = 4.14

/* 
	문제1 : 지폐 세기
		조건 : 금액 입력받아 321000 일경우 
		출력 : console.log에 아래와 같이 출력  
			십만원 3장
			만원 2장
			천원 1장
			백원 0개
*/
let 금액 = Number( prompt('금액 : ') ) 
console.log( '입력받은 금액 : ' + 금액 )
let 십만원 = parseInt( 금액/100000 ) 		// parseInt( 숫자 ) : 정수로 반환
console.log( '십만원 : ' + 십만원 )

금액 -= 십만원 *100000;						// 원 금액에서 십만원권 제거  
let 만원 = parseInt( 금액 / 10000 )
console.log( '만원 : ' + 만원)

금액 -= 만원 *10000;						// 원 금액에서 만원권 제거 
let 천원 = parseInt( 금액 / 1000 )
console.log( '천원 : ' + 천원 )

금액 -= 천원 * 1000;						// 원 금액에서 천원 제거 
let 백원 = parseInt( 금액 / 100 )
console.log( '백원 : ' + 백원 )

//
let 정수1 = Number( prompt('정수1 : ') )
console.log( '홀수 여부 : ' + ( 정수1%2 === 1 ) ) 

//
let 정수2 = Number( prompt('정수2 : ') )
console.log( '7배수 여부 : ' + (정수2%7 === 0 ) )































 