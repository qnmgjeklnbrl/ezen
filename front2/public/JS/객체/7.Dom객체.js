
				// 함수( 이벤트 , 콜백함수 ( 인수 )=>{ 결과 }  )
				// DOMContentLoaded 이벤트 : 문서 모두 실행후 이벤트
document.addEventListener('DOMContentLoaded', () =>{ 
	
	// 변수(객체) =  h1 태그 이름으로 요소(태그) 선택 [ 태그를 js객체로 가져오기 ]
	const header = document.querySelector('h1')
		// querySelector : 요소 1개 가져오기
		// querySelectorAll : 요소 여러개 가져오기 [ 배열 ]
	
	console.log( header)
	console.log( typeof(header) ) 
	// typeof( ) : 자료형[1.String 2.boolean 3.Number 4.Object(배열,함수,DOM 등)] 확인 
	
	// 텍스트 와 스타일 변경 
	header.textContent = '안녕~~' // html 조작 
	header.style.color = 'white' // css 조작 [ DOM객체명.style.속성명 = 값 ]
	header.style.backgroundColor = 'black' // css조작
	header.style.padding = '10px' // css조작 
	
}) // addEventListener end 

document.addEventListener('DOMContentLoaded' , ()=>{
	const headers = document.querySelectorAll('h1')
	console.log( headers)
	console.log( typeof(headers) ) 
	// 배열내 데이터를 하나씩 꺼내는 방법
	// 1. 
	for( let i = 0 ; i<headers.length ; i++ ){
		headers[i].textContent ='안녕'+i
	}
	// 2. 
	for( let index in headers ){	// 0부터 마지막인데스까지 인덱스 하나씩 대입반복 
		headers[index].textContent = '안녕'+index
	}
	// 3. 
	for( let object of headers ){	// 0번째 인덱스의 데이터를 마지막 인덱스의 데이터를 하나씩 대입반복
		object.textContent ='안녕'
	}
	// 4.
	headers.forEach( (object ) => { object.textContent='안녕~~' } )
	
	
	
	
})
