package ch00;

import java.util.Scanner;

public class TestMain11 {

	private static Scanner sc;

	public static void main(String[] args) {
		// 4�� 19�� ���� ����
		// ���� ���� ������ ���� ������.
		// ���� �� �迭 ���α׷� 1,0 ī���� ���α׷� �ٽ� ¥�µ�
		// 1~4���� �迭 �ȿ� ������ ���ڸ� ���� ���α׷��� ¥���� �ڽ� ���� �Ͻø� ���� �Ѱ� �״��.
		// ��°� 1�� ~���Դϴ�, 2�� ~���Դϴ�. 3�� ~���Դϴ�. 4~ ���Դϴ�.
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
		System.out.println("��°� 1�� " + x1 + "���Դϴ�.");
		System.out.println("��°� 2�� " + x2 + "���Դϴ�.");
		System.out.println("��°� 3�� " + x3 + "���Դϴ�.");
		System.out.println("��°� 4�� " + x4 + "���Դϴ�.");
		sc = new Scanner(System.in);
		int[] B = new int[10];
		int sum = 0;
		double avg = 0;
		int n = 0;
		System.out.println("10���� �л��� ������ ���ϴ� ���α׷��Դϴ�.");
		System.out.println("10���� �л��� ������ ���� �Է��Ͻÿ�.");
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
		System.out.println("a���� ������ �� " + sum + "���Դϴ�.");
		System.out.println("a���� ����� " + avg + "���Դϴ�.");
		System.out.println("a���� �����л��� " + n + "���Դϴ�.(60�� �̸�)");

	}// main
}// class
