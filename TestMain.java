package ch00;

public class TestMain {

	public static void main(String[] args) {
		// �鿩���� ��Ű��, �� ���缭 ����
		int number1 = 10;
		System.out.println("�ȳ�");
		System.out.println("number1 = " + number1);

		int x; // �������� , int ������ �ڷ�
		// �� ���� ���� ����� ����ϴ� ���α׷�
		// �� ���� ���� ���� ������ �� �ִ� ������ ���� ������.
		// �� ������ ���� ���ؼ� �� �ٸ� ������ ��������.
		// �׸���, ���� ������� ���� �ִ� ������ �ֿܼ� �������.
		// print, println,printf
		// /n /t
		x = 7;
		int y;
		y = 3;
		int z = x + y;
		int a = x - y;
		int b = x * y;
		int c = x / y;
		System.out.println(z);
		System.out.println(x + " + " + y + " = " + z);
		System.out.printf("%d + %d = %d", x, y, z);
		System.out.printf("%n%d - %d = %d", x, y, a);
		System.out.printf("%n%d * %d = %d", x, y, b);
		System.out.printf("%n%d / %d = %d", x, y, c);

	}
}
