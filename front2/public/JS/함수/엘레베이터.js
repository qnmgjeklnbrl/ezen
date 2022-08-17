let 엘레베이터_층수 = Math.floor((Math.random()*5)+1)

let 상승버튼_눌린층수=[null,null,null,null,null]
let 하강버튼_눌린층수=[null,null,null,null,null]





 let floors = ''
 function f (){
	for( let i = 5; i>=1 ; i--){
	floors+=`${i}층<button onclick = "up(${i})" id="up${i}">▲</button><button onclick ="down(${i})" id="down${i}">▼</button><br>`
	}
	document.getElementById("floor").innerHTML=floors
	document.getElementById("elevator").innerHTML="현재 엘레베이터 층수 : "+엘레베이터_층수
}



function up(){
	
	
}







function down(){
	
	
	
	
	
	
}