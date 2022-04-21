package ch00;

import java.util.Scanner;

public class TestMain10 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4월 18일 수업 내용
		// continue를 만나면 반복문 위로 올라가라.
		// 주민등록번호 상에 1은 사람, 0은 외계인
		// 출력값 사람은 ~명입니다. 외계인은 ~명입니다.
		// 배열속 값이 1 모우고 0 모우고
		// 출력값 n번째는 사람입니다. or 외계인입니다.
		int sum = 0;

		int[] a = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 1 };
		for (int i = 0; i < 10; i++) {
			if (a[i] == 1) {
				sum = sum + 1;

			}
		}
		System.out.println("사람은 " + sum + "명입니다.");
		int o = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == 0) {
				o = o + 1;
			}
		}
		System.out.println("외계인은 " + o + "명입니다.");

		for (int n = 0; n < 10; n++) {
			if (a[n] == 1) {
				System.out.println(n + 1 + "번째는 사람입니다.");
			} else if (a[n] == 0) {
				System.out.println(n + 1 + "번째는 외계인입니다.");
			}

		}
		sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if (a[n1] == 1) {
			System.out.println(n1 + 1 + "번째는 사람입니다.");
		} else if (a[n1] == 0) {
			System.out.println(n1 + 1 + "번째는 외계인입니다.");
		}
		// int n,x,sum; <폭포수 모델> 일= 분석>설계>개발>유지보수 애자일
		// int n ; n = 5; 5라는 값이 저장됨. system.out.println(n); >>Memory Map
		// int x = 10; P(x+n) cpu로 보내서 콘솔창에 15라는 값을 줌.
		// int sum = x+n;
		// a배열 100개짜리 배열, 배열에서 최대값이 몇인지 알고 싶음.
		// 최대값 구하기 a배열에서 최대값을 찾는다.???
		// 첫번째부터 끝까지 순서로 찾자.
		// max라는 변수를 만들자. int max = 0;
		int[] b = { 10, 62, 30, 44, 50, 23, 60, 8, 80, 11 };
		int max = 0;
		int min = 100;
		for (int i = 0; i < 10; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		System.out.println("b배열의 최대값은 " + max + "입니다.");
		for (int i = 0; i < 10; i++) {
			if (min > b[i]) {
				min = b[i];
			}
		}
		System.out.println("b배열의 최소값은 " + min + "입니다.");
		// TODO Auto-generated method stub
		// a배열={5,3,1,2,4} 출력= 1,2,3,4,5
		// 오름차순 정렬을 어떻게 하지? a[i]
		// 구조체 = 사용자 정의 자료형
		int[] c = { 5, 3, 1, 2, 4 };
		int tmp = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {// 0 넣었을때 a[0]>a[i]
					tmp = c[i]; // tmp = a[0]
					c[i] = c[j];
					c[j] = tmp;
				}
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
	}// main
}// class
