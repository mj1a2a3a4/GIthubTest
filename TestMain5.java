package ch00;

import java.util.Scanner;

public class TestMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���б����� ������ �ο��Ҷ� abcdf
		// 90�� �̻� a, 80�� b, 70�� c 60�� d, �� �� f
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
			System.out.println("A�Դϴ�.");
			break;
		case 1:
			System.out.println("B�Դϴ�.");
			break;
		case 2:
			System.out.println("C�Դϴ�.");
			break;
		case 3:
			System.out.println("D�Դϴ�.");
			break;
		default:
			System.out.println("F�Դϴ�.");

			// TODO Auto-generated method stub
			// �ݺ��� do~while, while, for
			int a = 0;
			while (a < 5) {
				System.out.println("�ȳ�");
				a = a + 1;
				// i++;= i = i +1;
				// 1~10���� ���� �ݺ����� ���ؼ� ���϶�.=55 1+2+3+4+5+6+7+8+9+10
				int sum = 0; // 1~10������ ���� ��� ���� ���� �����Ұž�.
				// int n = 0;// 1~10���ϰ� �Ұž�.sum���ٰ� ���Ұž�.
				int i = 1;// �ݺ����� �ݺ�ȸ���� �����ϴ� �뵵�� ���ž�.
				while (i <= 10) {
					i++;
					System.out.println("�������¼���" + sum);

					sum = sum + i;

					// while(��){
					// �ݺ��ϰ� ���� ��ɹ�
					// System.out.println("�ȳ�");
					// 1~100���� �����Ǵ� sum ���� sum�� 3õ�� �Ѿ������� �������� ����
					int h = 0;// ��� �������� �������� ��
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
