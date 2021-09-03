/*==========================
	 ■■■ 배열 ■■■
    - 배열의 기본적 활용
============================*/

// ○ 과제
/*
	사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서
	입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
	단, 배열을 활용하여 구현할 수 있도록한다.

	실행 예)
	입력할 데이터의 갯수 : 10
	데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
	>> 가장 큰 수 -> 91

*/

import java.util.Scanner;

public class Test078
{ 
	public static void main(String[] args)
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		int n;		// 입력할 데이터 갯수 변수
		int max =0;	// 입력 받은 데이터 중 최대값


		//연산 및 처리
		System.out.print("입력할 데이터의 갯수 : ");
		n =sc.nextInt();

		// 배열 선언
		int[] arr = new int[n];	

		System.out.print("데이터 입력(공백 구분) : ");
		for (int i=0; i<n ;i++ )
		
			arr[i] = sc.nextInt();


		for (int i=0; i<n ;i++ )
		{
			if (max < arr[i])
				max =arr[i];
		}
		
			
		//결과 출력	
		System.out.println(">> 가장 큰 수 -> " + max);


	}
}

//최종결과
/*
입력할 데이터의 갯수 : 5
데이터 입력(공백 구분) : 56 37 58 27 20
>> 가장 큰 수 -> 58
계속하려면 아무 키나 누르십시오 . . .

*/ 2021-07-28 오후 8:53 