/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	-자바의 기본 입출력 : java.util.Scanner
================================================*/

//박효빈,100,20,40 입력

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		// ○ 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat, tot;


		// ○ 연산 및 처리
		System.out.print("이름,국어점수,영어점수,수학점수 입력(『,』구분) : ");
		sc =new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		/*             ----------     --------- ----- -----
		                입력받은값     구분자  임의의 문자열  */

		
		name = sc.next();
		kor =sc.nextInt();
		eng =sc.nextInt();
		mat =sc.nextInt();
		
		tot = kor+eng+mat;

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		System.out.println(">> 총점 : " + tot );
	}
}

//최종 결과
/* 
이름,국어점수,영어점수,수학점수 입력(『,』구분) : 박효빈,100,20,40

>> 이름 : 박효빈
>> 총점 : 160
계속하려면 아무 키나 누르십시오 . . .
*/