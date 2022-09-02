package java1.b연산자;

import java.util.Scanner;

public class EX2_연산자문제 { // class s
	public static void main(String[] args) { // main s
		Scanner scanner =new Scanner(System.in);
		
		
		
		
		
		
		
		/*
			문제1 : 급여 계산 
				[조건] 입력받기 : 기본급 , 수당 
				[출력] 실수령액 = 기본급 + 수당 - 세금[기본급10%]
		 */
		System.out.print("문1) 기본급: "); int 기본급  =  scanner.nextInt();
		System.out.print("문1)수당: ") ;  int 수당   =   scanner.nextInt();
		int 실수령액 = 기본급 + 수당 -(int)(기본급*0.1);
		System.out.println("문1) 실수령액: "+실수령액);
		
		
		
		
		
		
		
		/*
		 	문제2 : 지폐 개수 세기 
		 		[조건] 십만원 단위의 금액을 입력받기 
		 		[출력] 입력받은 금액의 지폐수 출력 
		 		[예시]  356789
		 			십만원 : 3장 
					만원 : 5장 
					천원 : 6장
	
				*/
		System.out.print("문2)금액: "); int 금액 = scanner.nextInt() ;
		int 십만원 = 금액/100000;
		int 만원 = 금액%100000/10000;
		int 천원 = 금액%10000/1000;
		System.out.println("문2) 십만원:"+십만원+"장"+"\n"+"만원: "+만원+"장"+"\n"+"천원: "+천원+"장");
		
		
		
		
		System.out.print("문3) 정수입력: "); int 정수3 = scanner.nextInt();
		String 확인 =  정수3%7==0 ? "맞다" : "아니다";
		System.out.println("문3) 7의배수 확인: "+확인);
		
		
		
		System.out.print("문4) 정수입력: "); int 정수4 = scanner.nextInt();
		String 확인2 =  정수4%2==0 ? "짝수" : "홀수";
		System.out.println("문4) 홀짝 확인: "+확인2);
		
		
		System.out.print("문5) 정수입력: "); int 정수5 = scanner.nextInt();
		String 확인3 =  정수5%7==0 && 정수5%2==0 ? "참" : "거짓";
		System.out.println("문5) 7의배수 이면서 짝수 확인: "+확인3);
		
		
		System.out.print("문6) 정수1입력: ")	;int 정수6 = scanner.nextInt();
		System.out.print("문6) 정수2입력: ")	;	int 정수7 = scanner.nextInt();
		
		int 확인4 = 정수6>정수7 ? 정수6 : 정수7;
		System.out.println(확인4);
		
		
		System.out.println("문7) 반지름: "); int r = scanner.nextInt();
		System.out.println("원의 넓이 : "+r*r*3.14);
		
		System.out.print("문8) 실수1 입력: ");	double 실수1 = scanner.nextDouble();
		System.out.print("문8) 실수2 입력: "); double 실수2 = scanner.nextDouble();
		System.out.printf("문8) 결과 : %.2f%% ",실수1/실수2*100);
		
		
		
		
		
		System.out.print("\n문9) 윗변: "); double 윗변  = scanner.nextDouble();
		System.out.print("문9) 아랫변: "); double 아랫변  = scanner.nextDouble();
		System.out.print("문9) 높이: "); double 높이 = scanner.nextDouble();
		
		
		System.out.println("문9) 사다리꼴의 넓이: "+(윗변+아랫변)*높이/2);
		
		
		System.out.print("문10) 키 입력: "); double 키 = scanner.nextDouble();
		System.out.println("문10) 표준체중: "+(키-100)*0.9);
		
		
		System.out.print("문11) 키 입력: "); double 키1 = scanner.nextDouble();
		System.out.print("문11) 몸무게 입력: "); double 몸무게 = scanner.nextDouble();
		
		System.out.println("문12) BMI : "+몸무게 / ( (키1/100) * (키1/100) ) );
		
		
		System.out.println("문13) 중간고사 : "); double 중간고사 = scanner.nextDouble();
		System.out.println("문13) 기말고사 : "); double 기말고사 = scanner.nextDouble();
		System.out.println("문13) 수행평가 : "); double 수행평가 = scanner.nextDouble();
		
		System.out.printf("문13) 점수: %.2f", 중간고사*0.3+기말고사*0.3+수행평가*0.4);
		
		
		int x = 10;
		int y = x-- + 5 + --x;//1.x-- +5  ==>  10+5   후위감소이므로 +연산후 x 감소 ; x ==9
							  // 2.15 + --x	 ==> 전위감소이므로 연산전 x 감소 ; x==8 , 따라서 15 + 8 =23
							  //3. y = 23  x==8
 		System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
		
		
		
		
		
		/*
		 	문제3 : 하나의 정수를 입력받아 7의 배수 이면 '맞다' 아니면 '아니다' [ if x ]
		 	문제4 : 하나의 정수를 입력받아 홀수이면 이면 '홀수' 아니면 '짝수' [ if x ]
		 	문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 이면 '참' 아니면 '거짓' 
		 	문제6 : 두개의 정수를 입력받아 더 큰수 출력 
		 	문제7 : 반지름을 입력받아 원 넓이 출력하기 
		 		// 원 넓이 공식 = 반지름 * 반지름 * 원주율[3.14]
		 	문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇 %인지 출력하기 
		 		// 예) 54.5     84.3  입력했으면    64.285714% 출력 
		 	문제9 : 사다리꼴 넓이 구하기 [ 윗변과 밑변 높이를 입력받아 출력하기 ] 
		 		// 사다리꼴 계산식 -> ( 윗변 * 밑변 ) * 높이 / 2 
		 	문제10: 키를 정수를 입력받아 표준체중 출력하기
				//표준체중 계산식 = > (키 - 100) * 0.9
			문제11 : 키와 몸무게를 입력받아 BMI 출력하기
				//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
		 	문제12 : inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 
		 	문제13 :  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
					//소수 둘째 자리 까지 점수 출력하기
					//중간고사 반영비율 => 30 %
					//기말고사 반영비율 => 30 %
					//수행평가 반영비율 => 40 %
			문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 				//int x = 10;
					//int y = x-- + 5 + --x;
					//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		 */
		
		
	} // main e 
} // class e