/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	-자바의 기본 입출력 : java.util.Scanner
================================================*/

/* ※ java.util.Scanner
	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
	  디폴트(default)로 사용되는 단락문자는 공백이다.
	  작성된 다음 토큰은 『next()』 메소드를 사용
	  다른 형태(자료형)의 값으로 변황할 수 있다. */

import java.util.Scanner;

public class Test016	 
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언


		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		String name;
		int kor,eng,mat;


		// ○ 연산 및 처리 
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();   // br.readLine();

		System.out.print("국어 점수 입력 : ");
		//kor = Integer.parseInt(sc.next());
		kor = sc.nextInt();


		System.out.print("영어 점수 입력 : ");
		eng = sc.nextInt();


		System.out.print("수학 점수 입력 : ");
		mat = sc.nextInt();



		// ○ 결과 출력
		System.out.println();
		System.out.println(" >> 이름 : " + name);
		System.out.println(" >> 총점 : " + (kor + eng + mat));
		//산술연산을 먼저하기 위해 ()를 사용한다.
		

	}
}
//최종 결과
/*
이름을 입력하세요 : 효빈
국어 점수 입력 : 60
영어 점수 입력 : 70
수학 점수 입력 : 40

 >> 이름 : 효빈
 >> 총점 : 170
계속하려면 아무 키나 누르십시오 . . .
*/