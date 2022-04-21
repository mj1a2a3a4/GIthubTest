package ch00;

import java.util.Scanner;

public class TestMain15 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 탄생석 당신의 탄생 월을 입력하세요.
		// 당신이 태어난 월은 ~입니다.
		System.out.println("태어난 월을 입력해주세요.");
		sc = new Scanner(System.in);
		int j = sc.nextInt();

		switch (j) {
		case 1:
			System.out.println("1월의 탄생석은 가넷입니다.");
			System.out.println("진실,우애,정조를 의미합니다.");
			break;
		case 2:
			System.out.println("2월의 탄생석은 자수정입니다.");
			System.out.println("마음의 평화, 성실을 의미합니다.");
			break;
		case 3:
			System.out.println("3월의 탄생석은 산호입니다.");
			System.out.println("용감, 총명, 침착을 의미합니다.");
			break;
		case 4:
			System.out.println("4월의 탄생석은 다이아몬드입니다.");
			System.out.println("순결, 고귀 , 용기, 신념을 의미합니다.");
			break;
		case 5:
			System.out.println("5월의 탄생석은 에메랄드입니다.");
			System.out.println("행운, 연애, 행복을 의미합니다.");
			break;
		case 6:
			System.out.println("6월의 탄생석은 진주입니다.");
			break;
		case 7:
			System.out.println("7월의 탄생석은 루비입니다.");
			break;
		case 8:
			System.out.println("8월의 탄생석은 페리도트입니다.");
			break;
		case 9:
			System.out.println("9월의 탄생석은 사파이어입니다.");
			break;
		case 10:
			System.out.println("10월의 탄생석은 오팔입니다.");
			break;
		case 11:
			System.out.println("11월의 탄생석은 토파즈입니다.");
			break;
		case 12:
			System.out.println("12월의 탄생석은 터키석입니다.");
			break;
		default:
			System.out.println("월을 입력해주세요.");
			break;
		}
	}
}