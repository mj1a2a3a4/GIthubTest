package ch00;


public class TestMain7 {

	public static void main(String[] args) {
		// a=b �迭�� ���� a�� c�� ���迭
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.print(" a �迭�� ");
		for (int i = 0; i < 5; i++) {
			System.out.print(a[i] + " ");
		}
		for (int k = 0; k < 5; k++) {
			b[k] = a[k];
			System.out.println(b[k] + " ");
			System.out.println();
			System.out.println("c �迭 : ");
			for (int i = 0; i < 5; i++) {
				System.out.println(c[i] + " ");
			}
		}

	}// main

}// class
