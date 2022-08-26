/**
 * 
 */
 
 
 
 
 const imgs = document.querySelectorAll('img')
 for(let i = 0 ; i<imgs.length ; i++){
	imgs[i].addEventListener('contextmenu',(event)=>{
		
		event.preventDefault()
		
	})
}




//-------------------------------------------------------------------


let status = false
const checkbox = document.querySelector('input')



checkbox.addEventListener('change' , ( event ) =>{
	status = event.currentTarget.checked
	
	
	
})


const link = document.querySelector('a')
link.addEventListener('click', ( event )=>{
	if(!status){
		event.preventDefault()
		
	}
	
})














































