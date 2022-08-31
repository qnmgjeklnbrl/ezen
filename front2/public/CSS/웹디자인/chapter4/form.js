/**
 * 
 */
 


let applicant_list = []


submit.addEventListener('click',(event)=>{
	let name = document.querySelector("#name").value
	let eng_name = document.querySelector("#eng_name").value
	let email = document.querySelector("#email").value
	let portpolio = document.querySelector("#portpolio").value
	
	let applicant = {
		이름:name,
		영어이름:eng_name,
		이메일: email,
		포폴:portpolio
		
	}
	
	
	console.log(applicant)
	
})