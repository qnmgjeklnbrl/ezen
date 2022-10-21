
const urlstr = window.location.href;

const url = new URL(urlstr);
const bno = url.searchParams.get('bno');
let btitle = document.querySelector(".btitle")
let bwriter = document.querySelector(".bwriter")
let bcontent = document.querySelector(".bcontent")
console.log(bno)
$.ajax({
	url:"http://localhost:8282/jsptest/view",
	data: {"bno": bno },
	success:function(re){	
		 let board = JSON.parse(re)
		btitle.innerHTML = board.btitle;
		bwriter.innerHTML = board.bwriter;
		bcontent.innerHTML = board.bcontent;
		
	}
})