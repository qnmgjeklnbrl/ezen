package java1;

public class Elevator {
	
	
	boolean[] o_u = new boolean[5];
	boolean[] o_d = new boolean[5];
	boolean[] i_b = new boolean[5];
	int e_c=(int)(Math.random()*5);
	int e_s=0;
	Elevator() {}
 
 
 

 
 
	void elevator_up() {
		for(int i = e_c ; i<=4; i++ ) {
			System.out.println(e_c);
			if(o_u[i]==true || i_b[i]==true) {
				System.out.println("문이열립니다.");
				o_u[i]=false; i_b[i]=false;
			}else if (o_u[i+1]==true) {
				e_c++;
			}else if (o_d[i+1]==true) {
				e_c++;
			}
			
		}
		
	
		
	
		
		
	}
 
	void elevator_down() {
	 
	 
	 
	 
	 
	 
	 }
	 
 
 
 
}



