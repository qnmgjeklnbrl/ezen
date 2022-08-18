



let 엘레베이터_층수 = Math.floor((Math.random()*5)+1)







let 상승버튼_눌린층수=[null,null,null,null]
let 하강버튼_눌린층수=[null,null,null,null]





 let floors = ''
 function f (){
	for( let i = 5; i>=1 ; i--){
		if(i==5){
			floors+=`${i}층<button onclick ="down(${i})" id="down${i}">▼</button><br>`
		
			
		}else if(i==1){
			floors+=`${i}층<button onclick = "up(${i})" id="up${i}">▲</button><br>`
		 }
		
	else {floors+=`${i}층<button onclick = "up(${i})" id="up${i}">▲</button><button onclick ="down(${i})" id="down${i}">▼</button><br>`}
	
	
	
	document.getElementById("floor").innerHTML=floors
	
	document.getElementById("elevator").innerHTML="현재 엘레베이터 층수 : "+엘레베이터_층수
	

		
	}
		
	
}

f()


function up(i){
	상승버튼_눌린층수[i-1]=i
	
	
}

console.log(상승버튼_눌린층수)





function down(i){
	
	
	하강버튼_눌린층수[i-2]=i
	
	
	
}
function elevator( ){
	
	

	
	
	
}









