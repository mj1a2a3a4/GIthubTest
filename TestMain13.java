package ch00;

import java.util.Scanner;

public class TestMain13 {

	private static Scanner sc3;
	private static Scanner sc1;
	private static Scanner sc;

	public static void main(String[] args) {
		// �ѤѤѤѤ��¼� ���� ���α׷��ѤѤѤ�
		// 1 2 3 4 5 6 7 8 9 10 �迭
		// 0 0 0 0 0 0 0 0 0 0 �迭��
		// ������ �¼��� �����ϼ���. >>> 3���� �Է��ϸ� �� �迭�� ���� ���� 1�� ������ ����
		// 3�� �¼��� ����Ǿ����ϴ�.
		// 1 2 3 4 5 6 7 8 9 10
		// 0 0 1 0 0 0 0 0 0 0
		// ������ �¼��� �����ϼ��� >>3
		// �̹� ����Ǿ� �ֽ��ϴ�.
		// 1 2 3 4 5 6 7 8 9 10
		// 0 0 1 0 0 0 0 0 0 0
		System.out.println("�ѤѤѤѤѤѤѤ��¼����� ���α׷��Դϴ٤ѤѤѤѤѤѤѤ�");

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
		System.out.println("\n�ѤѤѤѤѤѤѤѿ����� �¼��� �����ϼ���.�ѤѤѤѤѤѤѤ�");
		sc = new Scanner(System.in);

		x = sc.nextInt();
		System.out.println("");
		System.out.println(x + "�� �¼��� ���ŵǾ����ϴ�.");
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
		System.out.println("\n�ѤѤѤѤѤѤѤѿ����� �¼��� �����ϼ���.�ѤѤѤѤѤѤѤ�");
		sc1 = new Scanner(System.in);
		x = sc1.nextInt();
		if (a[x - 1] == 1) {
			System.out.println(x + "���� �̹� ����� �¼��Դϴ�.");
		} else if (a[x - 1] == 0) {
			System.out.println(x + "�� �¼��� ���ŵǾ����ϴ�.");
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

		// a[4] 5�ڸ� �迭�� ����
		// �ټ��ڸ� ���ڸ� �Է��ϸ�. ex)12345
		// ���� �Է��ϸ� ���� �迭�� �ڸ����� ���� ���� ������.
		// 12345 a[0] = 1, a[1] = 2, a[2]
		// 12345�� ������ �ڸ����� ���Ϸ���
		// 15��� ���ڸ� 1�� 5�� 15������ 10 �� 1 ������ 5
		System.out.println("5�ڸ� ���� �Է��Ͻÿ�.");
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