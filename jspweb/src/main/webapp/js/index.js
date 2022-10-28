
getpactive1();
function getpactive1(){
	$.ajax({
		url : "/jspweb/admin/regist" , 
		data : { "type" : 1 , "option" : "pactive1" } , 
		success : function( re ){ 
			let json = JSON.parse( re ) 
			let html = '';
			for(let i = 0; i<json.length;i++){
				let a = json[i]
				html+='<div class="item">	'+
							'	<a href="#">  '+
							'		<img src="/jspweb/admin/pimg/'+a.pimg+'">'+
							'	</a>'+
							'	<div class="item_info">'+
							'		<div class="item_title"> 	'+
										a.pname+
							'		</div>'+
							'		'+
							'		<div class="item_size"> [FREE] </div>'+
							'		'+
							'		<div class="item_price">'+a.pprice.toLocaleString()+'원</div> '+
							'		<div> '+
							'			<span class="item_sale">'+(a.pprice*(1-a.pdiscount)).toLocaleString() +' </span>'+
							'			<span class="item_discount">'+a.pdiscount*100 +'% </span>'+
							'		</div>	'+
							'		<div class="item_review">찜수 54 리뷰수 412</div> '+
							'		'+
							'	</div>'+
							'	<div>	'+
							'		<span class="badge rounded-pill text-bg-warning">주문폭주</span>'+
							'		<span class="badge rounded-pill text-bg-danger">1+1</span>'+
							'	</div>'+
							'</div>';	
				
			}
			
			document.querySelector('.itemlist').innerHTML += html;
		}
	})
}

	'<div class="item">	'+
	'	<a href="#">  '+
	'		<img src="/jspweb/img/p1.gif">'+
	'	</a>'+
	'	<div class="item_info">'+
	'		<div class="item_title"> 	'+
	'			트렌디한 크롭 기장의 덤블안감 카라넥 스웨이드 무스탕'+
	'		</div>'+
	'		'+
	'		<div class="item_size"> [FREE] </div>'+
	'		'+
	'		<div class="item_price"> 200,000 원 </div> '+
	'		<div> '+
	'			<span class="item_sale"> 20,000원 </span>'+
	'			<span class="item_discount"> 90% </span>'+
	'		</div>	'+
	'		<div class="item_review">찜수 54 리뷰수 412</div> '+
	'		'+
	'	</div>'+
	'	<div>	'+
	'		<span class="badge rounded-pill text-bg-warning">주문폭주</span>'+
	'		<span class="badge rounded-pill text-bg-danger">1+1</span>'+
	'	</div>'+
	'</div>';	