package ch00;

import java.util.Scanner;

public class FunctionTest {
	private static Scanner sc;

	// �Լ����� > �ڷ���'��ȯ�ڷ���' �Լ��̸�(){}
	// �Լ��̸��� �ҹ��ڷ� ����
	// ���� �޴��� �����ϼ���. 1. ����, 2. ����, 3. ����, 4. ������
	// ��°� 1�� �����ϸ� �������� ���� ���ڸ� �ΰ� �Է��ϸ� �����ϴ� ���� ���´�.
	// ���� �迭�� �־��ָ� ������ ���ִ� �Լ��� ������.
	static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	static void minus(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

	static void multi(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}

	static void div(int a, int b) {
		int c = a / b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		System.out.println("���� �޴��� �����ϼ���.");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ������");
		sc = new Scanner(System.in);
		int x;
		int a1;
		int a2;
		x = sc.nextInt();
		System.out.println("������ �� ���� �Է��ϼ���.");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		switch (x) {
		case 1:
			add(a1, a2);
			break;
		case 2:
			minus(a1, a2);
			break;
		case 3:
			multi(a1, a2);
			break;
		case 4:
			div(a1, a2);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�.");
			break;
		}
	}
}