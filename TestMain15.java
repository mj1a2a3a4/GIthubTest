package ch00;

import java.util.Scanner;

public class TestMain15 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ź���� ����� ź�� ���� �Է��ϼ���.
		// ����� �¾ ���� ~�Դϴ�.
		System.out.println("�¾ ���� �Է����ּ���.");
		sc = new Scanner(System.in);
		int j = sc.nextInt();

		switch (j) {
		case 1:
			System.out.println("1���� ź������ �����Դϴ�.");
			System.out.println("����,���,������ �ǹ��մϴ�.");
			break;
		case 2:
			System.out.println("2���� ź������ �ڼ����Դϴ�.");
			System.out.println("������ ��ȭ, ������ �ǹ��մϴ�.");
			break;
		case 3:
			System.out.println("3���� ź������ ��ȣ�Դϴ�.");
			System.out.println("�밨, �Ѹ�, ħ���� �ǹ��մϴ�.");
			break;
		case 4:
			System.out.println("4���� ź������ ���̾Ƹ���Դϴ�.");
			System.out.println("����, ��� , ���, �ų��� �ǹ��մϴ�.");
			break;
		case 5:
			System.out.println("5���� ź������ ���޶����Դϴ�.");
			System.out.println("���, ����, �ູ�� �ǹ��մϴ�.");
			break;
		case 6:
			System.out.println("6���� ź������ �����Դϴ�.");
			break;
		case 7:
			System.out.println("7���� ź������ ����Դϴ�.");
			break;
		case 8:
			System.out.println("8���� ź������ �丮��Ʈ�Դϴ�.");
			break;
		case 9:
			System.out.println("9���� ź������ �����̾��Դϴ�.");
			break;
		case 10:
			System.out.println("10���� ź������ �����Դϴ�.");
			break;
		case 11:
			System.out.println("11���� ź������ �������Դϴ�.");
			break;
		case 12:
			System.out.println("12���� ź������ ��Ű���Դϴ�.");
			break;
		default:
			System.out.println("���� �Է����ּ���.");
			break;
		}
	}
}