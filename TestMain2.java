package ch00;

import java.util.Scanner;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("---<���� v1.0>---");
		System.out.println("�� ���� ��Ģ�����ϴ� ���α׷��Դϴ�.");

		System.out.println("ù��° ���ڸ� �Է��ϼ��� >>");
		int n1 = sc.nextInt();
		System.out.println(n1);

		System.out.println("�ι�° ���ڸ� �Է��ϼ��� >>");
		int n2 = sc.nextInt();
		System.out.println(n2);

		int result1 = n1 + n2;
		int result2 = n1 - n2;
		int result3 = n1 * n2;
		int result4 = n1 / n2;

		System.out.printf("%n%d + %d = %d", n1, n2, result1);
		System.out.printf("%n%d - %d = %d", n1, n2, result2);
		System.out.printf("%n%d * %d = %d", n1, n2, result3);
		System.out.printf("%n%d / %d = %d", n1, n2, result4);

		int n = 6;

		if (n % 2 == 0) {
			System.out.println("¦�� �Դϴ�.");
		} else {
			System.out.println("Ȧ�� �Դϴ�.");
		}

		sc.close();
	}

}
