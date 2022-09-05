package java1.c조건문반복문;

import java.util.Scanner;

public class EX7_별찍기 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("문제1) 별개수: " ); int s1 = scanner.nextInt();
		for(int i = 1 ; i <= s1 ; i++ ) {
			System.out.println("*");
		}

		System.out.print("문제2) 별개수: " ); int s2 = scanner.nextInt();
		for(int i = 1 ; i <= s2 ; i++ ) {
			System.out.print("*");if(i%3==0) {System.out.println();}
		}
		System.out.print("문제3) 줄수: " ); int s3 = scanner.nextInt();
		String output3 = "";
		for(int i = 1; i<=s3 ; i++) {
			
			output3+="*";
			System.out.println(output3);
		}
		System.out.print("문제4) 줄수: " ); int s4 = scanner.nextInt();
		
		for(int i = 1 ;i<=s4; i++) {
			for(int s =1 ; s<=s4-i+1; s++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		System.out.print("문제5) 줄수: " ); int s5 = scanner.nextInt();
		
		for(int i = 1 ;i<=s5; i++) {
			for(int b =1 ; b<=s5-i; b++) {
				System.out.print(" ");
			}
			for(int s = 1 ; s<=i ; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("문제6) 줄수: " ); int s6 = scanner.nextInt();
		for(int i= 1; i<=s6 ; i++) {
			for(int b = 1 ; b<=i-1 ; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s<=s6-i+1 ; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.print("문제7) 줄수: " ); int s7 = scanner.nextInt();
		for(int i = 1; i<=s7; i++) {
			for(int b = 1; b<=s6-i; b++) {
				System.out.print(" ");
				
			}
			for(int s =1;s<=2*i-1;s++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.print("문8) 줄수: " ); int s8 = scanner.nextInt();
		
		for(int i = 1; i<=s8; i++) {
			for(int b = 1; b<=s6-i; b++) {
				System.out.print(" ");
				
			}
			for(int s =1;s<=2*i-1;s++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.print("문9) 줄수: " ); int s9 = scanner.nextInt();
		for(int i = 1; i<=s9; i++) {
			for(int b = 1; b<=i-1; b++) {
				System.out.print(" ");
			}
			for(int s = 1; s<=2*s9-(2*i-1); s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.print("문10) 줄수: " ); int s10 = scanner.nextInt();
		for(int i = 1; i<=s10 ; i++) {
			if(i<=s10/2) {
				for(int b = 1; b<=(s10/2+1)-i; b++) {
					System.out.print(" ");
					
				}
				for(int s =1;s<=2*i-1;s++) {
					System.out.print("*");
				}
				System.out.println();
			}
			if(i>s10/2) {
				
				for(int b = 1; b<=i-s10/2-1; b++) {
					System.out.print(" ");
					
				}
				
				for(int s=1;s<=s10-2*(i-(s10/2))+2;s++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
		
		
		
		
		
	}

}}
