package ch00;

import java.util.Arrays;

public class TestMain9 {

	public static void main(String[] args) {
		// a() = �Լ�, function, method ; class �ȿ� ���� �Լ��� method�� �Ѵ�.
		// Arrays.toString(�迭); �迭�ȿ� �ִ°� ���� �� �����ش�.
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

		// ���� i�� 1���� 10���� ���ϴµ�, i���� ���� ¦���϶��� sum�� �����ؾ���.
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
