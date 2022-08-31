let 상승버튼 = [false,false,false,false]
let 하강버튼 = [false,false,false,false]
let 내부버튼 = [false,false,false,false,false]
let e_f = Math.floor( (Math.random()*5)+1 )
document.getElementById('elevator').innerHTML = "엘레베이터 층수 : "+e_f



function downbutton (i){
	if(!상승버튼.includes(true)&&!하강버튼.includes(true)&&!내부버튼.includes(true)){
		하강()
	}
	else if ()
	
	하강버튼[i-2]=true
	
	
	
	
	
}