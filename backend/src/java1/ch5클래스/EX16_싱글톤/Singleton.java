package java1.ch5클래스.EX16_싱글톤;

public class Singleton {
	
	private static Singleton s1 = new Singleton();
	
	// 싱글톤 : 객체 1개만 선언 가능한 클래스
		// 방법 : 
		// 1. 외부에서 생성자를 못쓰게 하자
			// private Singleton() {}
		// 접근제한자 : 
			// private : 현재 클래스에서만 호출 가능 
			// public	: 프로젝트 어디서든 호출 가능 
	
		// 2. 필드에 정적 객체 선언 
			// private static 클래스명 객체명 = 생성자();
	
		// 3. 정적싱글톤객체 반환 메소드  [ 외부에서 간접 접근 ] 
			// public static Singleton 메소드명(){ return 싱글톤객체명; }
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return s1;
	}
	
}