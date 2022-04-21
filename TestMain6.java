package ch00;

import java.util.Random;

public class TestMain6 {

	public static void main(String[] args) {
		// 구구단을 2단을 출력해보자. 3단,4단 중첩반복문 이용해서 출력
		int dan = 1;
		int n = 1;
		while (dan < 10) {
			n = 1;
			while (n < 10) {
				System.out.println(dan + " * " + n + " = " + dan * n);
				n++;
			}
			dan++;
		}

		// 문제: 주사위를 100번 굴려서 나온 각 눈의 횟수를 출력하는 프로그램.
		// ex)출력값 1이 나온 횟수:5 2가 나온 횟수: 2 3이 나온 횟수: 1
		// 4가 나온 횟수:0 5가 나온 횟수 :1 6이 나온 횟수 :0

		// 1. 주사위를 굴린다. 2. 나온눈을 확인하고 표에 기록한다. 3. 1,2번을 100번 반복한다. 4. 결과
		Random rd = new Random();
		// System.out.println(dice);
		int[] num = new int[6];
		for (int x = 0; x <= 100; x++) {
			int dice = rd.nextInt(6) + 1;
			if (dice == 1) {
				num[0]++;
			} else if (dice == 2) {
				num[1]++;
			} else if (dice == 3) {
				num[2]++;
			} else if (dice == 4) {
				num[3]++;
			} else if (dice == 5) {
				num[4]++;
			} else if (dice == 6) {
				num[5]++;

			}
		}
		System.out.println("1이 나온 횟수는" + num[0] + "입니다.");
		System.out.println("2이 나온 횟수는" + num[1] + "입니다.");
		System.out.println("3이 나온 횟수는" + num[2] + "입니다.");
		System.out.println("4이 나온 횟수는" + num[3] + "입니다.");
		System.out.println("5이 나온 횟수는" + num[4] + "입니다.");
		System.out.println("6이 나온 횟수는" + num[5] + "입니다.");
	}// main
}// class
