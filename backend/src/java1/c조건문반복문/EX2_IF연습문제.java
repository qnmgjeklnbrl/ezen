

package java1.c조건문반복문;

import java.util.Scanner;

public class EX2_IF연습문제 {
	
	public static void main(String[] args) {
		
		// * 입력객체
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		System.out.println("정수1 입력: "); int num1 = scanner.nextInt();
		System.out.println("정수2 입력:");  int num2 = scanner.nextInt();
		
		
		if (num1>num2) {
			System.out.println(num1);
			
			
		}
		else {
			
			System.out.println(num2);
			
		}
		
		
		
		
		System.out.println("정수1 입력: ");  int num3 = scanner.nextInt();
		System.out.println("정수2 입력: ");  int num4 = scanner.nextInt();
		System.out.println("정수3 입력: ");  int num5 = scanner.nextInt();
		
		
		int max = num3;
		
		if(num3<num4) {
			max = num4;
		}
		if (num3<num5) {
			max = num5;
		}
		System.out.println("가장큰수: "+max);		
		
		
		
		System.out.println("정수1 입력: ");  int num6 = scanner.nextInt();
		System.out.println("정수2 입력: ");  int num7 = scanner.nextInt();
		System.out.println("정수3 입력: ");  int num8 = scanner.nextInt();
		
		int temp = 0;
		if(num6<num7) {
			temp=num6;
			num6=num7;
			num7=temp;
					
		}
		if(num6<num8) {
			temp=num6;
			num6=num8;
			num8=temp;
					
		}
		if(num7<num8) {
			temp=num7;
			num7=num8;
			num8=temp;
		}
		
		System.out.println(num6+","+num7+","+num8
				);
		
		
		System.out.println("국어점수 입력: ");  int kor = scanner.nextInt();
		System.out.println("영어점수 입력: ");  int eng = scanner.nextInt();
		System.out.println("수학점수 입력: ");  int mat = scanner.nextInt();
		
		
		
		
		

		if((kor+eng+mat)/3>=90 ) {
			if(kor==100) {
				System.out.println("국어우수");
			}
			if(eng==100) {
				System.out.println("영어우수");
			}
			if(mat==100) {
				System.out.println("수학우수");
			}
			
		}
		else if((kor+eng+mat)/3>=80 ) {
			if(kor>=90) {
				System.out.println("국어장려");
			}
			if(eng>=90) {
				System.out.println("영어장려");
			}
			if(mat>=90) {
				System.out.println("수학장려");
			}
		}else {
			System.out.println("재시험");
		}
		
		
		System.out.println("점수 입력: ");  int score = scanner.nextInt();
		if(score>=90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("아이디 입력: ");  String id = scanner.next();
		System.out.println("비밀번호 입력: ");  String password = scanner.next();
		
		if(id.equals("admin") && password.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		
		
		// 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 
		// 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
	
		// 문제4 : 3개의 정수를 입력받아서 오름차순 / 내림차순 
		// 문제5 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 
		//문제6
			// 점수를 입력받아 점수가 90점 이상이면 A등급
			//				점수가 80점 이상이면 B등급
			//				점수가 70점 이상이면 C등급
			//				그외 재시험
		/* 문제7
			[ 입력 ] : 국어,영어,수학 입력받기
			[ 조건 ]
				평균이 90점 이상이면서 
					국어점수 100점 이면 '국어우수' 출력
					영어점수 100점 이면 '영어우수' 출력
					수학점수 100점 이면 '수학우수' 출력
				평균이 80점 이상이면서 
					국어점수 90점이상 이면 '국어장려' 출력
					영어점수 90점이상 이면 '영어정려' 출력
					수학점수 90점이상 이면 '수학장려' 출력
				그외 재시험 
		 */
		//문제8 로그인페이지
			// [ 입력 ] : 아이디와 비밀번호를 입력받기
			// [ 조건 ] : 회원아이디가 admin 이고 
			//           비밀번호가 1234 일 경우에는 
			//          로그인 성공 아니면 로그인 실패 출력
		
		
	}

}