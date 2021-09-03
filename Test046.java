/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- 반복문(while) 실습
===============================================================*/

/* 사용자로부터 임의의 정수를 입력받아
   입력받은 정수가 소수인지 아닌지를 판별하여
   결과를 출력하는 프로그램 구셩

//실행 예)
임의의 정수 입력 : 10
10 -> 소수 아님
계속하려면 아무 키나 누르세요...

임의의 정수 입력 : 11
11 -> 소수
계속하려면 아무 키나 누르세요...

※소수 : 1또는 자기 자신의 값 이외의 어떤 수로도 나누어 떨어지지 않는 수,
		 단, 1은 소수 아님.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

		int n;			//입력받을 변수 선언
		int i=2;		//입력값을 대상으로 나눗셈 연산할 변수 (1씩증가)

		boolean flag = true; //소수

        //입력 및 처리
		System.out.print("임의의 정수 입력 : ");
		n =Integer.parseInt(br.readLine());


		while (i<n)
		{	

			//입력값이 n으로 나누어 떨어지는지 확인
			if (n%i==0)
			{
				flag = false;  //소수아님
				
				break;							//★CHECK★ 만족하면 모든 값을 실행하지않음.
												//if문을 나오는것이 아니고 반복문 나오는 조건~!!
			}
			
			i++;

		} 


	  //결과 출력 ->  			   

		if(flag && n!=1)		//이미 flag는 true이기때문에 flag사용가능
		
			System.out.printf("%d -> 소수\n",n);
		
		else 
		
			System.out.printf("%d -> 소수아님\n",n);
		
	}
}

/*
임의의 정수 입력 : 1
1 -> 소수아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 20
20 -> 소수아님
계속하려면 아무 키나 누르십시오 . .

임의의 정수 입력 : 13
13 -> 소수
계속하려면 아무 키나 누르십시오 . . .
*/

//2021-07-23 오전 11:29
