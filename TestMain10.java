package ch00;

import java.util.Scanner;

public class TestMain10 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4�� 18�� ���� ����
		// continue�� ������ �ݺ��� ���� �ö󰡶�.
		// �ֹε�Ϲ�ȣ �� 1�� ���, 0�� �ܰ���
		// ��°� ����� ~���Դϴ�. �ܰ����� ~���Դϴ�.
		// �迭�� ���� 1 ���� 0 ����
		// ��°� n��°�� ����Դϴ�. or �ܰ����Դϴ�.
		int sum = 0;

		int[] a = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 1 };
		for (int i = 0; i < 10; i++) {
			if (a[i] == 1) {
				sum = sum + 1;

			}
		}
		System.out.println("����� " + sum + "���Դϴ�.");
		int o = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i] == 0) {
				o = o + 1;
			}
		}
		System.out.println("�ܰ����� " + o + "���Դϴ�.");

		for (int n = 0; n < 10; n++) {
			if (a[n] == 1) {
				System.out.println(n + 1 + "��°�� ����Դϴ�.");
			} else if (a[n] == 0) {
				System.out.println(n + 1 + "��°�� �ܰ����Դϴ�.");
			}

		}
		sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		if (a[n1] == 1) {
			System.out.println(n1 + 1 + "��°�� ����Դϴ�.");
		} else if (a[n1] == 0) {
			System.out.println(n1 + 1 + "��°�� �ܰ����Դϴ�.");
		}
		// int n,x,sum; <������ ��> ��= �м�>����>����>�������� ������
		// int n ; n = 5; 5��� ���� �����. system.out.println(n); >>Memory Map
		// int x = 10; P(x+n) cpu�� ������ �ܼ�â�� 15��� ���� ��.
		// int sum = x+n;
		// a�迭 100��¥�� �迭, �迭���� �ִ밪�� ������ �˰� ����.
		// �ִ밪 ���ϱ� a�迭���� �ִ밪�� ã�´�.???
		// ù��°���� ������ ������ ã��.
		// max��� ������ ������. int max = 0;
		int[] b = { 10, 62, 30, 44, 50, 23, 60, 8, 80, 11 };
		int max = 0;
		int min = 100;
		for (int i = 0; i < 10; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		System.out.println("b�迭�� �ִ밪�� " + max + "�Դϴ�.");
		for (int i = 0; i < 10; i++) {
			if (min > b[i]) {
				min = b[i];
			}
		}
		System.out.println("b�迭�� �ּҰ��� " + min + "�Դϴ�.");
		// TODO Auto-generated method stub
		// a�迭={5,3,1,2,4} ���= 1,2,3,4,5
		// �������� ������ ��� ����? a[i]
		// ����ü = ����� ���� �ڷ���
		int[] c = { 5, 3, 1, 2, 4 };
		int tmp = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {// 0 �־����� a[0]>a[i]
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
