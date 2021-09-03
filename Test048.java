/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- 반복문(while) 실습
===============================================================*/

/* ○ 과제

   사용자로부터 임의의 정수를 입력받아
   1부터 입력받은 그 수 까지의
   전체 합과 짝수의 합과 홀수의 합을
   각각 결과값으로 출력하는 프로그램을 구현

   //실행 예)
   임의의 정수 입력 : 270
   >> 1 ~ 270까지 정수의 합 : xxx
   >> 1 ~ 270까지 짝수의 합 : 
   >> 1 ~ 270까지 홀수의 합 : 
   											*/

import java.util.Scanner;

public class Test048
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a=0,n=0;
		int tot =0,even=0,odd=0;

		System.out.printf("임의의 정수 입력 :  ");
		a = sc.nextInt();

		n=a;

		while (0<a)
		{
			tot += a;
			if (a%2==0)
			even+=a;
			else 
			odd+=a;

			a--;
		} 
		
		System.out.printf("1부터 %d까지 정수의 합 : %d\n",n,tot);
		System.out.printf("1부터 %d까지 짝수의 합 : %d\n",n,even);
		System.out.printf("1부터 %d까지 홀수의 합 : %d\n",n,odd);

	}
}

//최종결과
/*
임의의 정수 입력 :  270
1부터 270까지 정수의 합 : 36585
1부터 270까지 짝수의 합 : 18360
1부터 270까지 홀수의 합 : 18225
계속하려면 아무 키나 누르십시오 . . .
*/