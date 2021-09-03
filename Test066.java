/*=========================================
	■■■ 클래스와 인스턴스 ■■■
===========================================*/

//// ※ CircleTest.java 파일과 세트~!!
/*
	원의 넓이와 둘레 구하기
	원의 넒이와 둘레를 구할 수 있는 클래스를 설계한다.
	(클래스명 : CircleTest) -> CircleTest.java

	원의 넓이 = 반지름 * 반지름 * 3.141592
	원의 둘레 = 반지름 * 2 * 3.141592

	실행 예)
	반지름 입력 : 13

	반지름이 13인 원의
	넓이 : xxxxx
	둘레 : xxxxx

*/

/*
import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		CircleTest ct = new CircleTest();

		ct.input();

		double a=ct.area();

		double b =ct.length();

		ct.print(a,b);

	}
}

//최종 결과
/*
반지름 입력 : 13
반지름이 13인 원의
넓이는 : 530.929048
둘레는 : 81.681392
계속하려면 아무 키나 누르십시오 . . .

*/

import java.io.IOException;

public class Test066
{
	public static void main(String[] args) throws IOException
	{
		// CircleTest 클래스 인스턴스 생성
		CircleTest ob = new CircleTest();

		// 생성된 인스턴스 ob를 통해서 반지름 입력 메소드 호출
		ob.input();

		double a = ob.calArea();

		double b = ob.calLength();

		ob.print(a,b);

	}
}
