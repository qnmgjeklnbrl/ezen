package java1.e클래스.EX8;

public class Member {

	String id;
	String password;
	String name;
	
	Member(){}
	
	
	
	Member(String id   ){
		this.id = id ; 
		
	}
	
	Member(String id , String password ){
		this.id = id ; 
		this.password = password ;
		
	}
	
	Member(String id , String password , String name){
		this.id = id ; 
		this.password = password ;
		this.name = name; 
	}
	
}
