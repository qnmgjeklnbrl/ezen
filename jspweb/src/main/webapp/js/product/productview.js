
/*
	document.querySelector('tag명')
	document.querySelector('#id명')
	document.querySelector('.class명')
	여러개[배열] : document.querySelectorAll()
	-- 속성[ 해당 tag내에서 사용가능한 속성 ]
		value 		:  div,span,td 등 사용불가
		innerHTML
		src : 
		style : 
*/


// 1. 현재 페이지내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자 
let pno = document.querySelector('.pno').value

$.ajax({
	url : "/jspweb/admin/regist" ,	
	type : "get" , 
	data : { "type" : 2 , "pno" : pno } ,
	success : re => { 
		let product = JSON.parse( re )
		
		console.log( product ) // 제품 정보
		
		// 1.제품사진 대입
		document.querySelector('.pimg').src ='/jspweb/admin/pimg/'+product.pimg
		// 2.제품명 대입
		document.querySelector('.pname').innerHTML = product.pname
		// 3.제품설명 대입
		document.querySelector('.pcomment').innerHTML = product.pcomment
		// 4.가격 대입
		let phtml = ''
		
		if( product.pdiscount == 0 ){ // 2. 할인이 없을때	[ 천단위 쉼표 함수 : 데이터.toLocaleString() ]
			phtml += '<span class="psale">'+(product.pprice.toLocaleString() )+'원</span>'
		}else{ // 1. 할인이 있을때						[ 반올림(소수점버리고 반올림) : Math.round( 데이터 ) ]
			phtml +=
				'<span class="pdiscount">'+ Math.round( product.pdiscount * 100 )+'%</span>'+
				'<span class="pprice">'+( product.pprice.toLocaleString() )+'원</span>'+
				'<span class="psale">'+ ( product.pprice -( product.pprice * product.pdiscount ) ).toLocaleString() +'원</span>'
		}
		document.querySelector('.pricebox').innerHTML = phtml 
		
		// 5. 현재 제품의 재고목록 호출 [ ajax ]
		$.ajax({
			url : "/jspweb/admin/stock" ,
			type : "get" , 
			data : { "pno" : pno },
			success : (re) => { 
				let stock = JSON.parse( re )
				console.log( stock ) // 재고 목록
				
				// java set VS js set   [ 컬렉션 : 수집 // 프레임워크 : 미리 만들어진 클래스  ]
				let sizelist=[]
				stock.forEach(s=>{sizelist.push(s.psize)})
				let sizeset = new Set(sizelist)
				
					// let set = new Set( [1,1,2,2,3,3] );	console.log( set )
				
				// 6. 사이즈 종류 출력
				let shtml = '<span> [ '
				sizeset.forEach( s => { 
					shtml += " " + s +" "
				})
				shtml += ' ] </span>'
				document.querySelector('.sizebox').innerHTML = shtml
				
				// 7. 색상 select 구성 
				let colorlist=[]
				stock.forEach(s=>{colorlist.push(s.pcolor)})
				let colorset = new Set(colorlist)
				let chtml='<option>-[필수] 색상 선택</option>'
				colorset.forEach(c=>{
					chtml+=`<option>${c}</option>`
					
					
				})
				
				
				document.querySelector(".cselect").innerHTML = chtml
				
				// 8. 색상 select 에서 선택된 색상 의 사이즈 select 구성 
			}
		})
	 }
	 
	 
	 
	 
	 
	 
})
