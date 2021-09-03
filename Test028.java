/*=====================================
	■■■ 연산자(Operator) ■■■
	- 삼항 연산자 == 조건 연산자
=======================================*/

/*사용자로부터 임의의 연도를 입력받아
입력받은 연도가 ,,, 윤년인지 평년인지 판별하여
그 결과를 출력하는 프로그램 구현
단, 입력은 BufferedReader를 활용하고
처리과정은 조건 연산자를 활용

//실행 예)
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르세요...

임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르세요...


임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르세요...

*/

//※ 2월 28일까지 있는 해 -> 평년
//   2월 29일까지 있는 해 -> 윤년

//   윤년의 판별 조건
//	 연도가 4의 배수이면서 100의 배수가 아니거나 
//	 400의 배수이면 윤년  

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int year;
		 String strResult;

		// ○ 입력 및 처리
		 System.out.print("임의의 연도 입력 : ");
		 year = Integer.parseInt(br.readLine());

		//방법 1.
		strResult = (year%4==0) && (year%100!=0) || (year%400==0) ? "윤년" : "평년";
		
		//방법 2.//strResult = (year%4==0) ? ((year%100==0)? ((year%400==0)?"윤년":"평년"):"윤년") : "평년";


		// ○ 결과 출력
		System.out.printf("%d년 -> %s\n", year, strResult);

	}
}
//최종결과
/*
임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르십시오 . . .


임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .
*/