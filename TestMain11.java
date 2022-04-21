package ch00;

import java.util.Scanner;

public class TestMain11 {

	private static Scanner sc;

	public static void main(String[] args) {
		// 4월 19일 수업 내용
		// 작은 수가 앞으로 오게 만들어라.
		// 어제 한 배열 프로그램 1,0 카운팅 프로그램 다시 짜는데
		// 1~4까지 배열 안에 각각의 숫자를 세는 프로그램을 짜보고 자신 없다 하시면 어제 한거 그대로.
		// 출력값 1은 ~개입니다, 2는 ~개입니다. 3은 ~개입니다. 4~ 개입니다.
		int[] a = { 4, 1, 4, 2, 4, 3, 1, 2, 2, 3 };
		int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

		for (int i = 0; i < 10; i++) {
			if (a[i] == 1) {
				x1++;
			} else if (a[i] == 2) {
				x2++;
			} else if (a[i] == 3) {
				x3++;
			} else if (a[i] == 4) {
				x4++;
			}
		}
		System.out.println("출력값 1은 " + x1 + "개입니다.");
		System.out.println("출력값 2은 " + x2 + "개입니다.");
		System.out.println("출력값 3은 " + x3 + "개입니다.");
		System.out.println("출력값 4은 " + x4 + "개입니다.");
		sc = new Scanner(System.in);
		int[] B = new int[10];
		int sum = 0;
		double avg = 0;
		int n = 0;
		System.out.println("10명의 학생의 성적을 구하는 프로그램입니다.");
		System.out.println("10명의 학생의 성적을 각각 입력하시오.");
		for (int i = 0; i < B.length; i++) {
			B[i] = sc.nextInt();
			sum = sum + B[i];
			avg = sum / B.length;
			if (B[i] < 60) {
				n++;
			}
			if (B[i] == 100) {
			}
		}
		System.out.println("a반의 총점은 총 " + sum + "점입니다.");
		System.out.println("a반의 평균은 " + avg + "점입니다.");
		System.out.println("a반의 낙제학생은 " + n + "명입니다.(60점 미만)");

	}// main
}// class
