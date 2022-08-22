
let floors = ""

function floor(){
	for(let i = 5 ; i>=1 ; i--){
		if(i==5){
			floors+=`<button id = "down${i}">▼</button><span id ="e_${i}"></span><br>`
		}else if(2<=i && i<=4){
			floors+=`<button id = "down${i}"></button><button id = "up${i}">▲</button><span id ="e_${i}"></span><br>`	
		}else{
			floors+=`<button id = "up${i}">▲</button><span id ="e_${i}"></span>`
		}
	}
	document.getElementById('floors').innerHTML=floors
	
}
floor()