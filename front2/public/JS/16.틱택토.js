
/*
	틱택토( 삼목 )
		1. 게임판[ 9칸 ] 구현 
		2. 버튼 눌림 기능
		3. 사용자(선택) vs 컴퓨터(랜덤)
		4. 승리자 판단 
	--------------
	함수 
		function 함수명( 매개변수 , 매개변수2 ){ 코드 }
*/
게임판그리기()	// 함수 실행 
// 1. 게임판 출력하는 함수 
function 게임판그리기(){
	// function 함수 만들기 키워드 
		// 게임판그리기 이름으로 함수 선언 [ 매개변수 x 리턴값 x ]
	let 게임판 ='' // 여러개 버튼(tag)을 저장하는 변수
	for( let i = 0 ; i<9 ; i++ ){ // i는 0부터 8까지 1씩 증가반복
		게임판 += `<button id=${i} onclick=버튼선택(${i})> ${i}</button>`
		// 게임판 변수에 버튼(tag)을 누적 더하기
		if( i % 3 == 2 ){ 게임판 += '<br>' }
			//  2 5 8 일때 줄바꿈 
	} 
	// 문서(html)의 id가 gameboard 의 
	document.getElementById('gameboard').innerHTML = 게임판
}
// 2. 버튼 선택 함수 
function 버튼선택( i ){  
	alert( i +'버튼눌림')
	// 사용자 선택한 버튼의 id의 html -> O 변경 
	document.getElementById( i ).innerHTML = 'O'
	// [컴퓨터]난수 발생
		// Math			// Math : 수학 관련 메소드 제공하는 클래스 
		// random()		// Math.random() : 0 ~1 사이의 난수 발생 
						// Math.random() * 끝번호-1 
						// (Math.random() * 9 ) + 1 : 1~10 사이의 난수 발생
	let rand = Math.floor( Math.random()  * 9 )	// 0~8
		// Math.floor   // 내림  Math.round() 반올림  Math.ceil() 올림
	alert( '난수 : ' + rand )
	document.getElementById( rand ).innerHTML = 'X'
}
// 3. 게임 상태(상황) 함수 
function 상황출력(){}
// 4. 게임 결과 함수 
function 게임결과(){}