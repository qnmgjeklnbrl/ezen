package java1.e클래스.EX9;

public class EX9실행 {
	public static void main(String[] args) {
		Calculator mycalc = new Calculator();
		
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5, 6);
		System.out.println(result1);
		double result2 = mycalc.devide(20, 50);
		System.out.println(result2);
		mycalc.powerOff();
	}
	
	
}
