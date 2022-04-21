package ch00;

import java.util.Scanner;

public class FunctionTest {
	private static Scanner sc;

	// 함수형태 > 자료형'반환자료형' 함수이름(){}
	// 함수이름은 소문자로 시작
	// 계산기 메뉴를 선택하세요. 1. 덧셈, 2. 뺄셈, 3. 곱셈, 4. 나눗셈
	// 출력값 1을 선택하면 덧셈으로 가서 숫자를 두개 입력하면 덧셈하는 값이 나온다.
	// 숫자 배열을 넣어주면 정렬을 해주는 함수를 만들어보자.
	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	static void minus(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	static void multi(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	static void div(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		System.out.println("계산기 메뉴를 선택하세요.");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
		sc = new Scanner(System.in);
		int x;
		int a1;
		int a2;
		x = sc.nextInt();
		System.out.println("연산할 두 수를 입력하세요.");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		switch (x) {
		case 1:
			add(a1, a2);
			break;
		case 2:
			minus(a1, a2);
			break;
		case 3:
			multi(a1, a2);
			break;
		case 4:
			div(a1, a2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}
	}
}