/*   ==============================
   ■■ 자바의 주요 클래스■■
   - Calendar 클래스
   ==============================*/

/*
○  java.util.Calendar 클래스는
	날짜와 시간을 객제 모델링화 한 클래스로
	연, 월, 일, 요일, 시, 분, 초까지의
	시간과 날짜와 관련된 정보를 제공한다.
	그리고 Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
	실제적인 메소드 구현은 Calendar클래스의 서브 클래스인
	GregorianCalendar 클래스에 정의되어 있다.

	시스템으로부터 현재 시스템 시간 정보를 얻어올 때
	getInstance() 라는 정적 메소드를 이요요하여 쟂게를 생성할 수 있다.
	생성된 Calendar 클래스 객세는 시스템의 현재 날씨와 시간 정보를 가지며,
	get()메소드를 이용하여 쉽게 가져올 수있다.

	getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
	돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
	구항 수 있다.

	//실습 문제
	// 사용자로부터 연,월을 입력받아
	//달력을 그려주는 프로그램을 구현한다.
	//단, 만년 달력이 아니라 Calendar 클래스를 활용하여 작성

	실행예)
	연도 입력 : 0
	연도 입력 : 2021
	월 입력 : -2
	월 입력 : 8

	[2021년 8월]

 일 월 화 수 목 금 토 
 ====================
 1  2  3  4  5  6  7 
 8  9 10 11 12 13 14 
15 16 17 18 19 20 21 
22 22 23 24 25 26 27
28 29 30 31
 ====================
*/

import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.io.*;

public class Test139
{
	public static void main(String[] args) throws IOException
   {
		/* [내가 한 풀이]
		Calendar c = new GregorianCalendar();
		
		Scanner sc = new Scanner(System.in);
		
		int y,m;
		do
		{	
			System.out.print("연도 입력 : ");
			y = sc.nextInt();
		}
		while (y==0);

		do
		{
			System.out.print("월 입력 : ");
			m = sc.nextInt();
		}
		while (m>12 || m<1);

		
		
		
		c.set(y,m-1,1);
		int w = c.get(Calendar.DAY_OF_WEEK);	//입력 달의 시작 요일,,.
		//System.out.println(w);
		//1 - 0
		//2 - 1

		
		
		
		
		System.out.println();
		System.out.printf("\t[%d년 %d월]\n",y,m);
		System.out.println();
		System.out.println("   일  월  화  수  목  금  토");
		System.out.println("==============================");

		int n=0;
		for (int a=1; a<w ;a++ )
		{
			System.out.print("    ");
			n++;
		}


		for (int i =1 ;i<=c.getActualMaximum(Calendar.DATE) ;i++ )				//마지막 날짜 받아내기,,,,
		{
			System.out.printf("%4d",i);
			
			if ((i+n)%7==0)
				System.out.println();
			
		}


		
		System.out.println();
		System.out.println("===============================");
		*/
		

		//[같이 한 풀이]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Calendar cal = Calendar.getInstance();

		//주요 변수 선언
		int y,m;
		int w;


		do
		{	
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y==0);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m>12 || m<1);

		
		// 사용자로부터 입력받은 연, 월을 이용하여
		// 달력의 날짜 세팅

		cal.set(y,m-1,1);
		//--월 구성 시 입력값을 그대로 사용하는 것이 아니라
		//	입력값에서 1을 뺀 값으로 월 설정
		//--일 구성 시 입력받은 연,월에 해당하는 1일로 설정해야 한다.

		//요일 가져오기
		w = cal.get(Calendar.DAY_OF_WEEK);
		// 1 -> 일요일


		//출력결과
		System.out.println();
		System.out.printf("\t[%d년 %d월]\n",y,m);
		System.out.println();
		System.out.println("   일  월  화  수  목  금  토");
		System.out.println("==============================");
	
		// 공백 발생
		int i;
		for (i=1; i<w ;i++ )
			System.out.print("    ");		


		//※ getActualMaxium() 메소드
		for (i =1 ;i<=cal.getActualMaximum(Calendar.DATE); i++ )	//cal.getActualMaxium(m-1)
		{
			System.out.printf("%4d",i);
			w++;		//--반복문을 수행하며 날짜가 증가할 때 마다
						//	요일도 함께 증가할 수 있도록 처리

			if (w%7==1)	//--증가한 요일이 일요일이면 개행
				System.out.println();	
		}


		if (w%7!=1)
			System.out.println();

		System.out.println("===============================");


	
   }
}