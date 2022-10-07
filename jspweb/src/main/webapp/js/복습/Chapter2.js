/*
	자료: 데이터(정보/값) 
 	자료형 : 데이터 타입
 			1. 숫자 2. 문자열 3. 불
 	문자열: ' ' 혹은 "  "
 	문자열 연산자
 
 */
console.log("가나다라");
console.log('가나다라');
console.log("가나"+"다라");
 
 
 
 				const input = prompt('금액을 입력해주세요')
				const input1 =input%100000
				const 십만원 =(input-input1)/100000
				
				const input2 = input1%10000
				const 만원 = (input1-input2)/10000
				
				const input3 = input2%1000
				const 천원 =( input2-input3)/1000
				
				const input4 =input3%100
				const 백원 = (input3-input4)/100
				
				
				
				
				
				
				
				console.log('십만원:'+십만원+'장','만원:'+만원+'장','천원:'+천원+'장','백원:'+백원+'개')
				