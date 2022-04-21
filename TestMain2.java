package ch00;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("---<계산기 v1.0>---");
		System.out.println("두 수를 사칙연산하는 프로그램입니다.");

		System.out.println("첫번째 숫자를 입력하세요 >>");
		int n1 = sc.nextInt();
		System.out.println(n1);

		System.out.println("두번째 숫자를 입력하세요 >>");
		int n2 = sc.nextInt();
		System.out.println(n2);

		int result1 = n1 + n2;
		int result2 = n1 - n2;
		int result3 = n1 * n2;
		int result4 = n1 / n2;

		System.out.printf("%n%d + %d = %d", n1, n2, result1);
		System.out.printf("%n%d - %d = %d", n1, n2, result2);
		System.out.printf("%n%d * %d = %d", n1, n2, result3);
		System.out.printf("%n%d / %d = %d", n1, n2, result4);

		int n = 6;

		if (n % 2 == 0) {
			System.out.println("짝수 입니다.");
		} else {
			System.out.println("홀수 입니다.");
		}

		sc.close();
	}

}
