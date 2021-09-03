/*==========================
	 ■■■ 배열 ■■■
    - 배열의 기본적 활용
============================*/

// ○ 과제
/*
	사용자로부터 학생 수를 입력받고
	그 만큼의 점수(정수 형태)를 입력받아
	전체 학생 점수의 합, 평균, 편차를 구하여
	결과를 출력하는 프로그램을 구현한다.
	단, 배열을 활용하여 처리할 수 있도록 한다.

	실행 예) 
	학생 수 입력 : 5
	1번 학생의 점수 입력 : 90
	2번 학생의 점수 입력 : 82
	3번 학생의 점수 입력 : 64
	4번 학생의 점수 입력 : 36
	5번 학생의 점수 입력 : 98

	>> 합 : 370
	>> 평균 : 74.0
	>> 편차
	90 : 16.0
	82 : 8.0
	64 : -10.0
	36 : -38.0
	98 : 24.0

*/


import java.util.Scanner;

public class Test079
{
	public static void main(String[] args) 
	{
		// 주요 변수 선언
		int stu;				//학생 수 	
		int sum=0;				//합
		double avg =0.0;		//평균

		Scanner sc = new Scanner(System.in);


		// 연산 및 처리
		System.out.print("학생 수 입력 : ");
		stu = sc.nextInt();
		
		// 점수 배열 선언
		int[] score = new int[stu];

		for (int i=0; i<stu ;i++ )
		{
			System.out.printf("%d번 학생의 점수 입력 : ",(i+1));
			score[i] = sc.nextInt();
		}

		System.out.println();

		for (int a=0; a<score.length ;a++ )
		{
			sum += score[a];
			avg = sum/(double)stu;
		}


		// 결과 출력
		System.out.printf(">> 합 : %d\n",sum);
		System.out.printf(">> 평균 : %.2f\n",avg);
		System.out.printf(">> 편차 : \n");
		
		for (int i=0;i<stu ;i++ )
		
			System.out.printf("%d : %.2f\n",score[i],(score[i]-avg));
		

	}
}
//최종결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.00
>> 편차 :
90 : 16.00
82 : 8.00
64 : -10.00
36 : -38.00
98 : 24.00
계속하려면 아무 키나 누르십시오 . . .

*/	2021-07-28 오후 9:03