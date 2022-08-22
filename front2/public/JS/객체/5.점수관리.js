/*
	* 함수 : 1.정의[만들기] 2.호출[ 불러내기 ]
		-특징
			1. 함수 안에서 할당된 메모리는 함수 종료시 초기화[사라짐]
			
	* 학생 점수 프로그램
		1. 학생 객체 설계
		2. 점수 등록 버튼을 눌렀을때
			1. 해당 js 함수 호출하기 
			<button onclick="함수명() ">
			
			2. HTML에서 입력받은 데이터를 js객체에 저장 
				* 학생 이름 중복체크 함수 
					-
				- 함수 등록 함수 사용 
				- document.getElementById('id명').value;
				
			3. 여러개의 객체를 저장 ----> 배열 
				- 배열은 다른 함수에서도 사용할 예정 [ 함수 밖에서 선언 ]
			
			4. HTML 초기화
		3. 학생 점수출력 
			1. js 처음 열렸을때 1번  / 2.학생등록 할때마다
				
*/
// 

let studentlist = [ ] // *여러개 학생 객체를 저장하는 배열 [ 함수 밖에 선언한 이유 : 여러 함수들에서 사용하기 위해서]
학생출력()

function 점수등록(){ // 2. 점수 등록 버튼을 눌렀을때
	// 1. 학생 객체 : HTML 입력받은 데이터로 선언
		// document.getElementById('kor').value : input에 입력된 무조건 문자열 가져오기
		// Number( document.getElementById('kor').value ) : input에 입력된 문자열을 숫자열 변환해서 가져오기
	const student = {
		name : document.getElementById('name').value ,	/* 이름 속성[키:값] */
		kor : Number( document.getElementById('kor').value ) ,		/* 국어 속성 */
		eng : Number( document.getElementById('eng').value ),		/* 영어 속성 */
		mat : Number( document.getElementById('mat').value )		/* 수학 속성 */
	}
	
	// * 배열에 저장하기전[ 학생등록 전 ]에 중복체크!!!
	if( 이름중복체크( student.name )  ) { // 이름중복체크 함수에서 결과[return]가 true 이면 
		return // return 함수 종료 하는 의미로 return 될 경우에는 아래코드는 실행되지 않는다.
	}
	
	// 2. 객체를 배열에 담기 
	studentlist.push( student ) // 배열명.push( 데이터 ) : 배열에 데이터 추가 
	// 3. 알림/확인 
	alert('학생 점수 등록이 되었습니다.')
	console.log( studentlist )
	// 4. HTML에 입력된 내용 지우기
	document.getElementById('name').value = ''
	document.getElementById('kor').value = ''
	document.getElementById('eng').value = ''
	document.getElementById('mat').value = ''
	// 5. 
	학생출력()
	
} // f end 

function 이름중복체크( name ) { // 학생 이름 중복체크 함수 정의
	for( let i = 0 ; i<studentlist.length ; i++ ){
		// 만약에 배열에 객체가 3개 있을경우 =>  길이 : 1~3		인덱스:0~2
		// i는 0부터 i는 배열길이[ 배열내 객체수]미만까지 1씩증가 반복 
		if( studentlist[i].name === name ){
			// 배열내 i번째 인덱스의 객체내 이름이  새로 입력받은 이름과 같으면
			alert('이미 존재한 학생명입니다.')
			return true // 배열내 name 과 동일한 이름이 있다.
		} // if end 	
	} // for end 
	return false // 배열내 name 동일한 이름이 없다. 
} // f end 

function 학생출력() {
	// 1. 변수에 html태그[문자열]를 저장하기 
	let html = '<tr><th>등수</th><th>학생명</th><th>국어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th></tr>'
	// *** 배열내 객체들을 하나씩 꺼내기 -> 객체 정보를 html 화 
	for( let i = 0 ; i<studentlist.length ; i++ ){
		// i는 0부터 배열내 마지막인덱스까지[ 배열의길이-1 ] 1씩 증가반복
		
		// 총점  = 국어 + 영어 + 수학 
		let sum = studentlist[i].kor +  studentlist[i].eng +  studentlist[i].mat
		// 평균 = 총점 / 과목수 
		let avg = sum / 3 
		
		// 객체에 들어있는 데이터를 html로 출력 
		html += '<tr>' + 
					'<th>등수</th>'+
					'<th>'+studentlist[i].name+'</th>'+
					'<th>'+studentlist[i].kor+'</th>'+
					'<th>'+studentlist[i].eng+'</th>'+
					'<th>'+studentlist[i].mat+'</th>'+
					'<th>'+sum+'</th>'+
					'<th>'+avg+'</th>'+
					'<th><button onclick="학생삭제('+i+')">삭제</button></th>'+
				'</tr>' 
		// 변수는 문자처리 X // 변수는 앞전에 미리 정의된 단어[ 키워드 = 컴퓨터가 알고 있는 단어 ]
	} // for end 
	// 2. 해당 변수를 html에 출력하기
	document.getElementById('listtable').innerHTML = html
} // f end 

function 학생삭제(i){
	alert(studentlist[i].name+'의 점수를 삭제합니다.')
	studentlist.splice(i,1)
	학생출력()
	
	
	
}














































