package java1.e클래스.EX10;

public class Car {
	int gas;
	
	
	void setGas(int gas) {
		this.gas = gas;
		return;	
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
			
		}else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.[gas잔량: "+gas+"]");
				gas-=1;
			}else {
				System.out.println("멈춥니다.[gas잔량: "+gas+"]");
				return;
				
			}
		}
	}	
		
		
		
	
	
}
