/*==============================
	  ■■■ 만년달력 ■■■
================================*/

/*
	실행 예)
	『연도』를 입력하세요 : 2021
	『월』을 입력하세요 : 8
	
	 [2021년 8월]

 일 월 화 수 목 금 토
 =====================
  1  2  3  4  5  6  7  
  8  9 10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31
 =====================

*/


/*
○ 문제 분석 및 접근
	1년1월1일 =월요일
	4의 배수이면서 100의 배수가 아니거나, 400의 배수이면 윤년
	만약 2021년 8월 달력을 그린다고 가정하면,
	1.1.1~2021.7.31까지의 날 수 구하고
	그 날 수에 +1 연산을 수행하면,,, 1.1.1~21.08.01까지의 날수
	이 날 수를 통해 2021년 8월 1일 요일 확인가능
*/

import java.util.Scanner;

public class Test101
{
	public static void main(String[] args)
	{

// [내가 한 풀이]
/*
		Scanner sc = new Scanner(System.in);
		System.out.print("『연도』를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("『월』을 입력하세요 : ");
		int month = sc.nextInt();

		int[] date = {31,0,31,30,31,30,31,31,30,31,30,31};

		if ((year%4==0) && (year%100!=0) || (year%400==0))
			date[1] =29;
		else
			date[1] =28;


		int nalsu;

		nalsu = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;	//지난 년도의 날 수

		for (int i=0; i<(month-1) ;i++ )		//올해 지난달의 날 수
		
			nalsu += date[i];
	
		nalsu++;	//입력한 달의 시작 요일 

		int day = nalsu%7;		//요일 정하기  0일요일~6토요일  


		System.out.println();
		System.out.printf("  [%d년 %d월]\n",year,month);
		System.out.println();
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("=====================");

		int k =0;
		if (day==0){} //일요일
		else						
		{	
			do
			{
				System.out.print("   ");
				k++;
			}
			while (k<day);	
		} // 일요일을 제외한 나머지 요일 공백

		for (int j=1;j<=date[month-1] ;j++ )
		{
			System.out.printf("%3d",j);

			if (( k + j )%7==0)
				System.out.println();	
		}

		System.out.println();
		System.out.println("=====================");

*/

//[같이 한 풀이]

		Scanner sc = new Scanner(System.in);
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int nalsu, y,m,w;


		do
		{
			System.out.print("『연도』를 입력하세요 : ");
			y = sc.nextInt();
		}
		while (y<1);
		
		do
		{
			System.out.print("『월』을 입력하세요 : ");
			m = sc.nextInt();
		}
		while (m<1 || m>12);

		//---------------------------여기까지 수행하면 유효한 연도, 월 입력한 상태
		

		//입력받은 년도에 해당하는 2월의 마지막 날 계산

		if ((y%4==0) && (y%100!=0) || (y%400==0))	//윤년이라면,,,
			days[1] = 29;
		else
			days[1] = 28; // 배열에서 이미 선언 => 생략 가능



		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;	//+지난 년도의 날 수

		for (int i=0; i<(m-1) ;i++ )		//+올해 지난달의 날 수
		
			nalsu += days[i];
	
		nalsu += 1;	//입력한 달의 시작 요일 

		w = nalsu % 7;

		//----------------------------입력된 달의 시작 요일 

		
		System.out.println();
		System.out.printf("\t[%d년 %d월]\n",y,m);
		System.out.println();
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("==============================");

		for (int i=1;i<=w ;i++ )
		{
			System.out.print("    ");
		}

		for (int i=1; i<=days[m-1] ;i++ )
		{
			System.out.printf("%4d", i);
			w++;							
			//날짜를 하나씩 처리할때마다 요일도 하나씩 증가
			//★요일을 증가시켜서 일요일일때 개행

			//일요일에 해당하는 날짜에 개행
			if(w%7==0)
			System.out.println();

		}


		// 달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		// 이미 일요일 개행이 이루어졌기 때문에
		// 이 경우는 추가 개행을 하지 않도록 한다.
		if (w%7!=0)
		{
			System.out.println();
		}

		
		System.out.println("==============================");

	}
}


//최종결과
/*
『연도』를 입력하세요 : 1998
『월』을 입력하세요 : 6

        [1998년 6월]

  일  월  화  수  목  금  토
==============================
       1   2   3   4   5   6
   7   8   9  10  11  12  13
  14  15  16  17  18  19  20
  21  22  23  24  25  26  27
  28  29  30
==============================
계속하려면 아무 키나 누르십시오 . . .
*/
