


function bwrite(){
	let btitle = document.querySelector("#btitle").value
	let bwriter = document.querySelector("#bwriter").value
	let bpassword = document.querySelector("#bpassword").value
	let bcontent = document.querySelector("#bcontent").value
	console.log(btitle)
	$.ajax({
		url:"http://localhost:8282/jsptest/write",
		data:{
			"btitle":btitle,
			"bwriter":bwriter,
			"bpassword":bpassword,
			"bcontent":bcontent
		},
		success: function(re){	
			if(re==='true'){
				alert("글 등록 성공")
				location.href="http://localhost:8282/jsptest/list.html"
			}
		}	
	})	
}

