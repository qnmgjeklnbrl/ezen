/**
 * 
 */
 $.ajax({
	url:"http://localhost:8282/jsptest/list",
	
	success: function(re){
		let board = JSON.parse(re)
		let html =""	
		for( let i = 0 ;  i<board.length ; i++){
			let b = board[i] 
				html += '<tr>' + 
							'<td>'+b.bno+'</td>'+
							'<td onclick="viewload('+b.bno+')">'+b.btitle+'</td>'+
							'<td>'+b.bwriter+'</td>'+
							'<td>'+b.bdate+'</td>'+
							'<td>'+b.bview+'</td>'+
						'</tr>';
		}
		document.querySelector('.btalbe').innerHTML += html
	}
	
	
	
	
})