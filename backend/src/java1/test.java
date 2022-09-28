package java1;

public class test {

	
	public static void main(String[] args) {
		
		
		
		
		
		int x = 0;
		
		
		String[][] test = new String[20][40];
		
		while(true) {
			
			
			for(int i = 0 ; i <test.length; i++) {
				for(int j = 0 ; j<test.length ; j++) {
					
			
					
					test[i][j] = "□";
					if(i==0 && j == 10) {
						
						test[i][j] = "■";
						
						
					}
					
					System.out.print(test[i][j]);
					
					
				}
				
				System.out.print("\n");
				
			}
			
		
			
				
				
		
					
		
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
}
