package ch00;

public class ScoreManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 83, 54, 62, 92, 49, 58, 77, 85, 36, 100 };
		int total = 0;
		double avg = 0.0;
		int count = 0;
		int max = 0;
		int min = 100;

		for (int i = 0; i < 10; i++) {
			total = total + a[i];
			avg = total *1.0/ a.length;
			if (a[i] < 60) {
				count++;
			}
		}
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		System.out.println("60�� �̸� ���� ���� : " + count);
		for (int i = 0; i < 10; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("�ִ����� : " + max);
		System.out.println("�ּ����� : " + min);
		System.out.println("------------------");

		// switch (a[i]) {
		// case 90:
		// System.out.println("90�� �̻� : ");
		// case 80:
		// System.out.println("80�� �̻� : ");
		// case 70:
		// System.out.println("70�� �̻� : ");
		// case 60:
		// System.out.println("60�� �̻� : ");
		// default:
		// System.out.println("60�� �̸� : ");
		// }
	}
}