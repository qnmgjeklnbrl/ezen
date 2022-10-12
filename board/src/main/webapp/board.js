/**
 * 
 */
 	dd();
function dd(){
	
	let boardlisttable =document.querySelector("#boardlisttable");
	let tag = "<tr>"
					+"<th>번호</th>"
					+"<th>제목</th>"
					+"<th>내용</th>"
					+"<th>작성자</th>"
					+"<th>작성일</th>"
					+"<th>조회수</th>"
				+"</tr>"
	$.ajax({
		url:"/board/boardlist",
		success:function(result){
			
			let boardlist = JSON.parse(result)
			
			for(let i = 0; i<boardlist.length; i++){
				let b = boardlist[i]
				tag+="<tr>"
					+"<td>"+b.bno+"</td>"
					+"<td>"+b.title+"</td>"
					+"<td>"+b.content+"</td>"
					+"<td>"+b.writer+"</td>"
					+"<td>"+b.bdate+"</td>"
					+"<td>"+"\t"+b.view+"</td>"
				+"</tr>"
				
			}
			boardlisttable.innerHTML = tag;
		}
		
	})
}




		
function deleteboardbtn(){
	
	document.querySelector("#deleteboard").innerHTML = "글번호: "+"<input type='text' id='bno'>"+"비밀번호: "+"<input type='password' id='password'>"+"<button onclick='deleteboard()'>삭제하기</button>";
	
	
	
}


function deleteboard(){
	let bno = document.querySelector("#bno").value;
	let password = document.querySelector("#password").value;
	$.ajax({
		url:"",
		data:{"bno":bno,"password":password},
		
		
		
	})
}
