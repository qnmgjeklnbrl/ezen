/**
 * 
 */
 
 function login(){
	//1.html 입력된 데이터 가져오기
		
	let mid = document.querySelector("#mid").value;
	let mpassword = document.querySelector("#mpassword").value;
	let loginconfirmbox = document.querySelector("#loginconfirmbox");
	
	
	 //2.변수 2개를 서블릿으로 보내기
	
		//1. JQUERY 라이브러리 포함
		//2. AJAX
	// $.ajax( 속성명 = 값 , 속성명 = 값 , 속성명 = 값})
		//url : "통신경로"
		//success : function(매개변수){실행 코드}
	
	$.ajax({
		url : "/jspweb/member/login" ,
		data : {"mid" : mid , "mpassword" : mpassword},
		success : function(re){
			if(re==='1'){
				alert("로그인 성공");
				location.href="/jspweb/index.jsp";
				
				
			}else if (re==='2'){
				
				loginconfirmbox.innerHTML="패스워드가 다릅니다"
			}else if (re==='3'){
				loginconfirmbox.innerHTML="데이터 베이스 오류[관리자에게 문의]"
			}else if (re==='0'){
				loginconfirmbox.innerHTML="존재하지 않는 아이디입니다"
			}
		}
		
	})	;
	
	
}
 
 


 
 