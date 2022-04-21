package ch00;

public class TestMain {

	public static void main(String[] args) {
		// 들여쓰기 지키기, 줄 맞춰서 쓰기
		int number1 = 10;
		System.out.println("안녕");
		System.out.println("number1 = " + number1);

		int x; // 변수선언 , int 정수형 자료
		// 두 수를 더한 결과를 출력하는 프로그램
		// 두 개의 수를 각각 저장할 수 있는 공간을 먼저 만들자.
		// 두 변수의 값을 더해서 또 다른 변수에 대입하자.
		// 그리고, 더한 결과값을 갖고 있는 변수를 콘솔에 출력하자.
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
