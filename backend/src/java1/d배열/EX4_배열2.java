package java1.d배열;

public class EX4_배열2 { // class s 
	public static void main(String[] args) { // main s 
		
		// 1. 1차원 배열 [ 길이 ]
		String[ ] 배열1 = new String[10];	// String 객체를 10개 저장할수 있는 배열 
			// 1. 항목에 값 대입
			배열1[0] = "유재석";	배열1[1] = "강호동";	배열1[2] = "신동엽";
			// 2. 항목에 값 수정 
			배열1[0] = "하하";
			// 3. 항목에 값 삭제 [ 메모리 자체 삭제X -> 데이터 초기화 ]  
			배열1[1] = null;
			// 4. 모든 항목 호출 
			for( String value : 배열1 ) { System.out.println( value ); }
		
		// 2. 2차원 배열 [ 가로길이=row ] [ 세로길이=col ]
		String[ ][ ] 배열2 = new String[10][5];	// String 객체를 20개 저장할수 있는 배열  
			// 1. 항목 값 대입 
			배열2[0][0] = "유재석";	배열2[0][1] = "123";
			배열2[1][0] = "강호동";	배열2[1][1] = "456";
			배열2[2][0] = "신동엽";	배열2[2][1] = "789";
			// 2. 항목 값 수정 
			배열2[0][0] = "하하";		배열2[0][1] = "852";
			// 3. 항목 값 삭제 [ 데이터 초기화 ]
			배열2[1][0] = null;		배열2[1][1] = null;
			// 4. 모든 항목 호출 
			for( int 행 = 0 ; 행<배열2.length ; 행++ ) { 
				// 행부터 반복 	[ 2차원배열.length : 행길이 ] 
				// 0부터 마지막 행까지 반복 
				
				for( int 열 = 0 ; 열<배열2[행].length; 열++ ) { 
					// 행마다 열 반복 [ 2차원배열[인덱스].length : 해당 행의 열길이 ]
					// 0부터 마지막 열까지 반복 [ 열은 행마다 반복 ] 
					System.out.print( 배열2[행][열]+"\t" );
				} // for end 
				
				System.out.println();
			} // for end 
		/* [3][4]
		 	0,0		0,1		0,2		0,3
		 	1,0		1,1		1,2		1,3
		 	2,0		2,1		2,2		2,3
		 */
		// 3. 3차원 배열 [가로] [세로] [높이]
		String[ ][ ][ ] 배열3 = new String[10][2][3]; // String 객체를 60개 저장할수 있는 배열 
		
	} // main end 
} // class end 