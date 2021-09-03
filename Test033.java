/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/

/*

//실행 예)
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 15
세 번째 정수 입력 : 10

>> 정렬 결과 : 5 10 15
 																*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,c;					//--사용자가 입력하는 임의의 변수 


		
		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());



		if(a>b)						//★CHECK★ else를 사용하지 않고 if만 사용한다.
		 {							//	모든 것을 수행해야하기 때문에 else는 안된다.
			a=a^b;
			b=b^a;
			a=a^b;
			
			//테스트
			System.out.println("자리바꿈 발생");
		  }

		if (a>c)
		 {
			a=a^c;
			c=c^a;
			a=a^c;

			//테스트
			System.out.println("자리바꿈 발생");
		 }

		if (b>c)
	     {
			b=b^c;
			c=c^b;
			b=b^c;

			//테스트
			System.out.println("자리바꿈 발생");
		  }



		// ○ 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n",a,b,c);

	}
}
//최종 결과
/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 15
세 번째 정수 입력 : 10
>> 정렬 결과 : 5 10 15계속하려면 아무 키나 누르십시오 . . .
*/