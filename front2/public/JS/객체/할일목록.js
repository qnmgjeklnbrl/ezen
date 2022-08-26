


//1.HTML 에서 문서객체 가져오기
//2.input박스에 텍스트 입력받고 엔터키 || 추가하기버튼을 누르면 addTodo 함수 실행
//3.목록에 추가된 할일 선택시 스타일 변경 이벤트
//4.삭제 버튼 누르면 removeTodo 함수 실행 




const input = document.querySelector('#todo') //html에서 객체 불러오기
const todoList = document.querySelector('#todo_list')//html에서 객체 불러오기
const addButton = document.querySelector('#add_button')//html에서 객체 불러오기












let keycount = 0  //객체식별을 위한 변수 설정
const addTodo = ( )=> {   //목록에 할일을 추가하는 함수 선언
	if(input.value.trim() === ''){ // if 시작  조건:인풋박스에 아무것도 없으면
		alert('할 일을 입력해주세요.')   //알림창 띄우기
		return// 함수종료
	}
	const item = document.createElement('div') //문서 객체를 생성
	const checkbox = document.createElement('input')//인풋박스 객체 생성
	const text = document.createElement('span') //span 객체 생성
	const button = document.createElement('button')//버튼 객체 생성
	
	
	const key = keycount //삭제함수 실행할때 객체별로 식별하기위해 변수 설정
	keycount+=1//함수가실행될때마다 키값 +1 저장
	
	item.setAttribute('data_key', key) //item 객체에 data_key속성 부여하고 key 값저장 (식별하기위해)
	item.appendChild(checkbox)//item 객체에 checkbox객체를 자식요소로 넣음
	item.appendChild(text)//item 객체에 text객체를 자식요소로 넣음
	item.appendChild(button)//item 객체에 button객체를 자식요소로 넣음
	todoList.appendChild(item)//todoList객체에  item객체를 자식요소로 넣음
	
	checkbox.type ='checkbox' //checkbox객체(input박스)의 type을 checkbox로 설정
	checkbox.addEventListener('change', (event) =>{ //checkbox 에 이벤트 부여
		
		item.style.textDecoration                    //item의 css스타일 변경하기
		= event.target.checked ? 'line-through' : '' // ()삼항연산자) 조건=>체크박스선택이되면 ? 참=>선긋기 :거짓=> 공백(선안그음)
	})//이벤트 발생시 작동하는 화살표 함수 종료
	text.textContent = input.value //텍스트 객체에 인풋박스에서 입력받은 값 띄우기
	
	
	button.textContent = '제거하기' //button 객체 조작하기
	button.addEventListener('click', () => { //button 객체에 이벤트 부여
		removeTodo(key)//클릭시  키 값을 매개변수로 removeTodo()함수 실행
	})
	input.value = '' //목록에 추가후 인풋박스에 입력받은값 초기화 하기
	
}


const removeTodo = (key) => { //목록에있는 할일 삭제 함수 선언
	const item = document.querySelector(`[data_key="${key}"]`) // 위에서 설정한 키값 속성으로 객체 식별하기
	todoList.removeChild(item) //todoList에서 item객체 삭제하기
}



addButton.addEventListener('click' , addTodo) //이벤트 연결 => 엔터키나 추가하기버튼 누르면 addTodo()함수 실행
input.addEventListener('keyup' , (event)=>{ //input박스에 이벤트 부여
	
	
	const ENTER = 13 //엔터키 키번호 를 상수에 저장
	
	if(event.keycode === ENTER){//엔터키를 누르면
		addTodo()//addTodo 함수 실행
	}//if 끝
})