/**
 * 
 */getproduct()
// 1. 모든 제품 호출 메소드 

function getproduct(){
	$.ajax({
		url :"/jspweb/admin/regist" ,
		type : "get", 
		success : function( re ){
			let json = JSON.parse( re )
			console.log(json)
			let html = ""
			for(let i =0 ; i<json.length; i++){
				let p = json[i]
				 let pimg = p.pimg
				 let pno = p.pno
				 let pcno = p.pcno
				 let pname = p.pname
				 let pprice = p.pprice
				 let pdiscount =p.pdiscount
				 let pdate = p.pdate
				 let pactive =p.pactive
				 
				 html+=`<tr>
				 		<td><img src="/jspweb/admin/pimg/${pimg}" width="60px" height="60px"></td>
				 		<td>${pno}</td>
				 		<td>${pcno}</td>
				 		<td>${pname}</td>
				 		<td>${pprice}</td>
				 		<td>${pdiscount}</td>
				 		<td>${pprice*pdiscount}</td>
				 		<td>${pactive}</td>
				 		<td>${pdate}</td>
				 		</tr>
				 		`
			} 
			document.querySelector(".table").innerHTML=`<tr>
				<th> 제품이미지 </th> 
				<th> 제품번호 </th>
				<th> 카테고리 </th>
				<th> 제품명 </th>
				<th> 가격 </th>
				<th> 할인율 </th>
				<th> 판매가[가격*할인율] </th>
				<th> 판매상태 </th>
				<th> 등록날짜 </th>
			</tr>`+html
		}
	})
}