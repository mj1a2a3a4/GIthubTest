package ch00;

import java.util.Scanner;

public class TestMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �ڷḦ ���� ������ �����Ͻÿ�.
		int x;
		x = 1;
		// ���� �ڷḦ ���� ������ �����Ͻÿ�.
		char y;
		y = 'a';
		// �Ǽ� �ڷḦ ���� ������ �����Ͻÿ�.(float, double)
		double z;
		z = 0.1;
		// ���� (��/����) �ڷḦ ���� ������ �����Ͻÿ�(boolean)
		boolean tf;
		tf = true;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(tf);

		// ���ǹ�
		// ���ǽ��� ��/�����̳Ŀ� ���� ����Ǵ� �ڵ尡 �ٸ���.
		// ���ǽ��� ���̸� if�� ������ �ڵ尡 ����ȴ�.
		// ���ǽ��� �����̸� else �� ������ �ڵ尡 ����ȴ�.
		int n = 4;

		if (n % 2 != 1) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}

		// ���� ���� ���� ����, 0 n�� ����� ��� ������ ���� 0�̸� 0�Դϴ�.
		System.out.println("���, ����, 0�� �Ǻ����ִ� ���α׷��Դϴ�.");
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("����Դϴ�.");
		} else {
			if (a < 0) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("0�Դϴ�.");
			}
		}
		// �Ǵٸ� ��
		// if (n>0){
		// System.out.println("����Դϴ�.");
		// }else if(n < 0)[
		// �� �ٸ��� if�� 3��

		// ��� y1�� �ִ밪���� ũ�� �ִ밪���� Ů�ϴ�. �ּҰ����� ������ �ּҰ����� �۽��ϴ�.
		// �ִ밪���� ū ���� ������ ���¼��� �ִ밪�� �ȴ�.
		// �ִ밪= max, �ּҰ�= min, ���= y1
		int y1;
		y1 = 15;
		int max;
		max = 10;
		int min;
		min = 5;

		if (y1 > max) {
			System.out.println("�ִ밪���� Ů�ϴ�.");
			max = y1;
			System.out.println("���� �ִ밪�� " + max + "�Դϴ�");
		} else if (y1 < min) {
			System.out.println("�ּҰ����� �۽��ϴ�.");
		} else {
		}

		//byte n123 = -128;
		// ����Ʈ�� ǥ���Ҽ��ִ� �ڸ��� -128~128
		// 2��8���� �� ���ڸ��� ������� ǥ��

	}

}
