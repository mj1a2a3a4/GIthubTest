package ch00;

import java.util.Scanner;

public class TestMain13 {

	private static Scanner sc3;
	private static Scanner sc1;
	private static Scanner sc;

	public static void main(String[] args) {
		// ㅡㅡㅡㅡㅡ좌석 예매 프로그램ㅡㅡㅡㅡ
		// 1 2 3 4 5 6 7 8 9 10 배열
		// 0 0 0 0 0 0 0 0 0 0 배열값
		// 예매할 좌석을 선택하세요. >>> 3번값 입력하면 그 배열에 대한 값이 1로 나오게 설정
		// 3번 좌석이 예약되었습니다.
		// 1 2 3 4 5 6 7 8 9 10
		// 0 0 1 0 0 0 0 0 0 0
		// 예매할 좌석을 선택하세요 >>3
		// 이미 예약되어 있습니다.
		// 1 2 3 4 5 6 7 8 9 10
		// 0 0 1 0 0 0 0 0 0 0
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ좌석예매 프로그램입니다ㅡㅡㅡㅡㅡㅡㅡㅡ");

		int[] a = new int[10];
		int x = 0;
		a[0] = 0;
		a[1] = 0;
		a[2] = 0;
		a[3] = 0;
		a[4] = 0;
		a[5] = 0;
		a[6] = 0;
		a[7] = 0;
		a[8] = 0;
		a[9] = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡ예매할 좌석을 선택하세요.ㅡㅡㅡㅡㅡㅡㅡㅡ");
		sc = new Scanner(System.in);

		x = sc.nextInt();
		System.out.println("");
		System.out.println(x + "번 좌석이 예매되었습니다.");
		for (int i = 0; i < 10; i++) {
			if (a[x - 1] == 0) {
				a[x - 1] = 1;
			}
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡ예매할 좌석을 선택하세요.ㅡㅡㅡㅡㅡㅡㅡㅡ");
		sc1 = new Scanner(System.in);
		x = sc1.nextInt();
		if (a[x - 1] == 1) {
			System.out.println(x + "번은 이미 예약된 좌석입니다.");
		} else if (a[x - 1] == 0) {
			System.out.println(x + "번 좌석이 예매되었습니다.");
		}
		for (int i = 0; i < 10; i++) {
			if (a[x - 1] == 0) {
				a[x - 1] = 1;
			}
			System.out.print(i + 1 + " ");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}

		// a[4] 5자리 배열을 만들어서
		// 다섯자리 숫자를 입력하면. ex)12345
		// 값을 입력하면 각각 배열에 자리마다 값이 들어가게 만들자.
		// 12345 a[0] = 1, a[1] = 2, a[2]
		// 12345의 각각의 자릿수를 구하려면
		// 15라는 숫자를 1과 5로 15나누기 10 몫 1 나머지 5
		System.out.println("5자리 수를 입력하시오.");
		sc3 = new Scanner(System.in);
		int h;
		int[] k = new int[5];
		h = sc3.nextInt();
		k[0] = h / 10000;
		k[1] = h % 10000 / 1000;
		k[2] = h % 10000 % 1000 / 100;
		k[3] = h % 10000 % 1000 % 100 / 10;
		k[4] = h % 10000 % 1000 % 100 % 10 / 1;
		for (int i = 0; i < 5; i++) {
			System.out.print(k[i]);
		}
	}
}