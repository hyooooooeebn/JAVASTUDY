/*================================================
		■■■ 자바 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : BufferedReader 클래스
==================================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test011
{
	public static void main(String[] args) throws IOException 
		// throws IOException은 규범에서 벗어나는 일이 있으면 던져라하고 각서 쓴거
		// br.readLine()를 사용하기 위해
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	


		//주요 변수 선언
		int r;
		final double PI = 3.141592;
		double a, b;


		//연산 처리
		//① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");

		//② 사용자가 입력한 값을 받아와 반지름 변수 r 담아오기
		//r = br.readLine(); -> 문자열 받아오기
		//Integer.parseInt() -> 문자열 데이터를 정수형으로 변환
		r = Integer.parseInt(br.readLine());
		/*-- 사용자가 입력한 값을 BufferedReader(br)의 『readLine()』
			 메소드를 활용하여 문자열 형태로 읽어들인 후
			 그 값을 『Integer.parseInt()』를 통해 숫자형으로 변환 후
			 정수 형태의 반지름 변수 r에 담아내기*/


		//③ 넓이 및 둘레 연산
		a = r*r*PI;
		b = r*2*PI;

		//결과 출력
		//System.out.println(">> 넓이 : " + a);
		//System.out.println(">> 둘레 : " + b);

		//System.out.printf(">> 넓이 : %f\n", a);
		//System.out.printf(">> 둘레 : %f\n", b);

		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", b);
		//--『%f』는 서식 출력용 메소드에서 실수형을 담아내는 옵션 문자
		//	『.2%f』는 소수점 이하 둘째자리까지 표현
		 
	
	}
}

//최종결과
/*
원의 반지름 입력 : 45
>> 넓이 : 6361.72
>> 둘레 : 282.74
계속하려면 아무 키나 누르십시오 . . .
*/