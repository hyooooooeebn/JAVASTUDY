/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	-자바의 기본 입출력 : java.util.Scanner
================================================*/


//이름과 점수를 한번에 입력받는 Scanner

import java.util.Scanner;

public class Test017
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat,tot;


		// ○ 연산 및 처리
		System.out.print("이름 국어점수 영어점수 수학점수 입력(공백구분) : ");

		//-사용자가 입력한 데이터를 각각의 변수에 담아내기
		name = sc.next();
		kor =sc.nextInt();
		eng =sc.nextInt();
		mat =sc.nextInt();

		//총점 산출
		tot = kor + eng + mat;

		
		// ○ 결과 출력
		System.out.println();
		System.out.println(" >> 이름 : " + name);
		System.out.println(" >> 총점 : " + tot);

	}
}

/*
이름 국어점수 영어점수 수학점수 입력(공백구분) : 박효빈 70 70 70

 >> 이름 : 박효빈
 >> 총점 : 210
계속하려면 아무 키나 누르십시오 . . .
*/