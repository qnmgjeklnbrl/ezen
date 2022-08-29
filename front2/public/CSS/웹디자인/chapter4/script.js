
/* chartist.js 이용한 차트 구현 */
/* 
	변수 = 값 
	배열 = [ 값1 , 값2 ]
	객체 = { 키:값 , 키2:값2 }
*/
/* 파이차트[원형차트 = 백분율] 데이터 객체 선언 */
let pieData = { 
	/* 항목의 이름 */
	labels : ['웹디자이너','웹개발자','서버 엔지니어','영업직'],
	/* 항목의 값 */
	series : [ 14 , 9 , 8 , 6 ]
}
let pieOptions = {
	width : '100%' , 
	height : '440px' 
}
/* 차트 적용하기 : new Chartist.Pie( '표시할식별자' , 데이터객체 , 옵션객체 ) */
/* Chartist.Pie 클래스[ 미리 만들어진 클래스 ] */
new Chartist.Pie('.pie_chart' , pieData , pieOptions )

/* 막대차트 */
let barData = {
	labels : ['2018년' , '2019년' , '2020년'] ,
	series : [ [10,16,29] ]
}
let barOptions = {
	// y축
	axisY : { 	// *  let 객체명 = {  키 : { }  }
		offset : 60 ,									// 1. 
		scaleMinSpace : 50 , 							// 2.선 간격[px]
		labelInterpolationFnc : function(value) {		// 3.Y축 눈금 표시 
			return value +' 명'
		}
	} ,   
	width : '100%' , 
	height : '440px' 
}

// 
new Chartist.Bar('.bar_chart' , barData , barOptions )

	
/* 막대차트 */
let barData2 = {	// 객체 선언 [ 매번 선언시 초기화 ]
	/* 항목*/
	labels : [ ] ,
	/*  */
	series : [ [ ] ]		// 배열 = [ ]  
}
let barOptions2 = {
	// y축
	axisY : { 	// *  let 객체명 = {  키 : { }  }
		offset : 60 ,									// 1. 
		scaleMinSpace : 50 , 							// 2.선 간격[px]
		labelInterpolationFnc : function(value) {		// 3.Y축 눈금 표시 
			return value +' 원'
		}
	} ,   
	width : '100%' , 
	height : '440px' 
}

function 차트그리기(){
	const name = document.getElementById('name').value;
	const money = document.getElementById('money').value;
	barData2.labels.push( name )
	barData2.series[0].push( money )
	// 차트 적용 
	new Chartist.Bar('.bar_chart2' , barData2 , barOptions2 )
}





























