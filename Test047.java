/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- 반복문(while) 실습
===============================================================*/

/*사용자로부터 임의의 두 정수를 입력받아
작은 수부터 큰수까지의 합을 구하여
결과를 출력하는 프로그램 구현

//실행 예)
  첫 번째 정수 입력 : 10
  두 번째 정수 입력 : 20
  >> 10 ~ 20 까지의 합 : xxx

  첫 번째 정수 입력 : 10
  두 번째 정수 입력 : 2
  >> 2 ~ 10 까지의 합 : xxx

									*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		System.out.print("첫 번째 정수 입력 : ");
		int a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		int b = Integer.parseInt(br.readLine());

		
		int sum=0,n;
		
		if (a>b)
		{
			a=a^b;
			b=b^a;
			a=a^b;
		}
		
		n=a;
		while (a<=b)
		{		
			sum += a;
			a++;
			
		}

		System.out.printf("  >> %d ~ %d 까지의 합 : %d\n",n,b,sum);*/

		// ○ 주요 변수 선언
		int n;				//루프변수 활용할 변수
		int su1,su2;		//입력받은 값 변수
		int result=0;			//누적합을 담을 변수
		
		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());
		
		//입력받은 두 수의 크기 비교 및 자리 바꿈
		//즉, su1이 su2보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리
	    if(su1>su2)
		{
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}
		
		//반복연산 수행
		//반복연산을 수행하기 전에
		//작은 수를 따로 저장해서 루프 변수로 활용한다.
		//(결과 출력 과정에서 필요하기 때문에...)
		
		n =su1;
		
		while (n<=su2)
		{
			result += n;
			n++;
		}


		// ○ 결과 출력
		System.out.printf(">> %d ~ %d까지의 합 : %d\n",su1,su2,result);	




	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
  >> 10 ~ 20 까지의 합 : 165
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 2
두 번째 정수 입력 : 10
  >> 2 ~ 10 까지의 합 : 54
계속하려면 아무 키나 누르십시오 . . .
*/

//2021-07-23 오후 12:24