/*======================================
	 ■■■ 클래스와 인스턴스 ■■■
	 - 클래스 설계
	 - 배열 활용
	 - 정보 은닉과 접근제어시지자
========================================*/

/*
	사용자로부터 년, 월, 일을 입력받아
	해당 날짜의 요일을 출력하는 프로그램 구현
	단 , 달력 클래스는 사용하지 않는다.
	또한, 클래스의 개념을 활용
	그리고 배열의 개념도 적용
	접근제어지시자의 개념도 확인하여 작성

	실행 예)
	년 월 일 입력(공백 구분) : 1996 08 16

	1996년 8월 16일 -> x요일

	※ 1년 1월 1일 -> 월요일  
	   1년은 365일이 아닐 때도 있다.

*/

/*
	4년마다 윤달 100년 마다 아니고 400년마다 윤달....
	4년 -> 366
	100년 -> 365
	400 -> 366...
*/

import java.util.Scanner;

class WeekDay
{
	private int y,m,d;
	private String day;

	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	public String week()
	{
	/*
	//[내가 한 풀이]
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};		

		String[] days = {"일요일", "월요일", "화요일", "수요일","목요일","금요일","토요일"};

		//각 월의 마지막 날짜을 배열 형태로 구성

		int nalsu=0;

		for (int a=1; a<y ;a++ )	//지나온 년의 날 수
		{
			nalsu += 365;
		
			if ((y%4==0) && (y%100!=0) || (y%400==0))
				nalsu++;
		}
				

		for (int i=0;i<m-1 ;i++ )	//그해 지난 달의 날 수

			nalsu += months[i];			
			
		if ( m>2 && ((y%4==0) && (y%100!=0) || (y%400==0)))		//윤년이라면
			nalsu++;
		
		
		
		nalsu += d;		//지난 년 + 지난 달 + 지난 일 수



		return days[nalsu%7];
		
	*/

		// [같이 한 풀이]
		int[] months = {31,0,31,30,31,30,31,31,30,31,30,31};		

		String[] days = {"일요일", "월요일", "화요일", "수요일","목요일","금요일","토요일"};

		int nalsu;

		if ((y%4==0) && (y%100!=0) || (y%400==0))	//윤년이라면...
		
			//2월의 마지막 날짜를 29일로 설정
			months[1] =29;
		
		else

			//2월의 마지막 날짜를 28일로 설정
			months[1] = 28;
		
		// (1) 1년 1월 1일부터 입력받은 년도의 이전 년도 12월 31일까지의 날 수 계산
		//									   --------
		//										  y-1
		// 2021.07.30 -> 1.1.1 ~ 2020.12.31
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;			//★CHECK★

		// (2)
		for (int i =0;i<(m-1) ;i++ )									//★CHECK★

			nalsu += months[i];
		

		// (3)
		nalsu += d;


		// 요일 확인 연산
		int w = nalsu % 7;

		return days[w];

	}

	void print(String day)
	{
		System.out.printf("%d년 %d월 %d일 -> %s\n" , y,m,d,day);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();

		ob.input();

		String result = ob.week();

		ob.print(result);
	}
}

