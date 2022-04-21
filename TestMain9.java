package ch00;

import java.util.Arrays;

public class TestMain9 {

	public static void main(String[] args) {
		// a() = 함수, function, method ; class 안에 들어가는 함수를 method라 한다.
		// Arrays.toString(배열); 배열안에 있는걸 수를 다 보여준다.
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int[] b = { 10, 20, 30, 40, 50 };

		int[] c = new int[10];
		for (int i = 0; i < 5; i++) {
			c[i] = a[i];

			for (int x = 0; x < 5; x++) {
				c[x + 5] = b[x];
			}
		}
		System.out.println(Arrays.toString(c));

		// 변수 i가 1부터 10까지 변하는데, i변수 값이 짝수일때만 sum에 누적해야지.
		int n = 1;
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			if (n % 2 == 0) {
				sum = sum + n;

			}
			n++;
		}
		System.out.println(sum);
	}

}
