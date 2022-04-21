package ch00;

public class TestMain8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		b[0] = 60;
		b[1] = 70;
		b[2] = 80;
		b[3] = 90;
		b[4] = 100;

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}
		for (int i = 0; i < b.length; i++) {
			c[i + 5] = b[i];

		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);

		}

	}

}
