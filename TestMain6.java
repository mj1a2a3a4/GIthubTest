package ch00;

import java.util.Random;

public class TestMain6 {

	public static void main(String[] args) {
		// �������� 2���� ����غ���. 3��,4�� ��ø�ݺ��� �̿��ؼ� ���
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

		// ����: �ֻ����� 100�� ������ ���� �� ���� Ƚ���� ����ϴ� ���α׷�.
		// ex)��°� 1�� ���� Ƚ��:5 2�� ���� Ƚ��: 2 3�� ���� Ƚ��: 1
		// 4�� ���� Ƚ��:0 5�� ���� Ƚ�� :1 6�� ���� Ƚ�� :0

		// 1. �ֻ����� ������. 2. ���´��� Ȯ���ϰ� ǥ�� ����Ѵ�. 3. 1,2���� 100�� �ݺ��Ѵ�. 4. ���
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
		System.out.println("1�� ���� Ƚ����" + num[0] + "�Դϴ�.");
		System.out.println("2�� ���� Ƚ����" + num[1] + "�Դϴ�.");
		System.out.println("3�� ���� Ƚ����" + num[2] + "�Դϴ�.");
		System.out.println("4�� ���� Ƚ����" + num[3] + "�Դϴ�.");
		System.out.println("5�� ���� Ƚ����" + num[4] + "�Դϴ�.");
		System.out.println("6�� ���� Ƚ����" + num[5] + "�Դϴ�.");
	}// main
}// class
