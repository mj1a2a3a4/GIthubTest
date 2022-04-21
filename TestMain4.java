package ch00;

import java.util.Scanner;

public class TestMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 자료를 담을 변수를 선언하시오.
		int x;
		x = 1;
		// 문자 자료를 담을 변수를 선언하시오.
		char y;
		y = 'a';
		// 실수 자료를 담을 변수를 선언하시오.(float, double)
		double z;
		z = 0.1;
		// 논리형 (참/거짓) 자료를 담을 변수를 선언하시오(boolean)
		boolean tf;
		tf = true;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(tf);

		// 조건문
		// 조건식이 참/거짓이냐에 따라 실행되는 코드가 다르다.
		// 조건식이 참이면 if문 블럭내의 코드가 실행된다.
		// 조건식이 거짓이면 else 문 블럭내의 코드가 실행된다.
		int n = 4;

		if (n % 2 != 1) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

		// 양의 정수 음의 정수, 0 n이 양수면 양수 음수면 음수 0이면 0입니다.
		System.out.println("양수, 음수, 0을 판별해주는 프로그램입니다.");
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수입니다.");
		} else {
			if (a < 0) {
				System.out.println("음수입니다.");
			} else {
				System.out.println("0입니다.");
			}
		}
		// 또다른 답
		// if (n>0){
		// System.out.println("양수입니다.");
		// }else if(n < 0)[
		// 또 다른답 if문 3개

		// 어떤수 y1가 최대값보다 크면 최대값보다 큽니다. 최소값보다 작으면 최소값보다 작습니다.
		// 최대값보다 큰 수가 들어오면 들어온수가 최대값이 된다.
		// 최대값= max, 최소값= min, 어떤수= y1
		int y1;
		y1 = 15;
		int max;
		max = 10;
		int min;
		min = 5;

		if (y1 > max) {
			System.out.println("최대값보다 큽니다.");
			max = y1;
			System.out.println("현재 최대값은 " + max + "입니다");
		} else if (y1 < min) {
			System.out.println("최소값보다 작습니다.");
		} else {
		}

		//byte n123 = -128;
		// 바이트가 표현할수있는 자리수 -128~128
		// 2의8승중 맨 앞자리는 음양수를 표현

	}

}
