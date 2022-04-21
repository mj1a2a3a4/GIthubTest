package ch00;

import java.util.Scanner;

public class TestMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대학교에서 학점을 부여할때 abcdf
		// 90점 이상 a, 80점 b, 70점 c 60점 d, 그 외 f
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println(n1);
		if (n1 >= 90) {
			n1 = 0;

		} else if (n1 >= 80) {
			n1 = 1;
		} else if (n1 >= 70) {
			n1 = 2;
		} else if (n1 >= 60) {
			n1 = 3;
		} else {
			n1 = 4;
		}

		switch (n1) {
		case 0:
			System.out.println("A입니다.");
			break;
		case 1:
			System.out.println("B입니다.");
			break;
		case 2:
			System.out.println("C입니다.");
			break;
		case 3:
			System.out.println("D입니다.");
			break;
		default:
			System.out.println("F입니다.");

			// TODO Auto-generated method stub
			// 반복문 do~while, while, for
			int a = 0;
			while (a < 5) {
				System.out.println("안녕");
				a = a + 1;
				// i++;= i = i +1;
				// 1~10까지 수를 반복문을 통해서 구하라.=55 1+2+3+4+5+6+7+8+9+10
				int sum = 0; // 1~10까지의 수를 모두 더한 값을 저장할거야.
				// int n = 0;// 1~10변하게 할거야.sum에다가 더할거야.
				int i = 1;// 반복문의 반복회수를 제어하는 용도로 쓸거야.
				while (i <= 10) {
					i++;
					System.out.println("더해지는숫자" + sum);

					sum = sum + i;

					// while(식){
					// 반복하고 싶은 명령문
					// System.out.println("안녕");
					// 1~100까지 누적되는 sum 값이 sum이 3천이 넘었을때에 더해지는 숫자
					int h = 0;// 계속 누적으로 더해지는 값
					int n = 0;
					while (n < 100) {

						n = n + 1;
						h = h + n;
						if (h >= 3000) {
							System.out.println(n);
							break;

						}
					}
				}
			}
		}
		sc.close();
	}
}
