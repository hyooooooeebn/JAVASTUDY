/*   ==============================
   ■■ 자바의 주요 클래스■■
   - Calendar 클래스
   ==============================*/
/*
○ Calendar 클래스
: 추상클래스이므로 객체 생성 X

○ Calendar 객체(인스턴스) 생성
1. Calendar ob1 = Calendar.getInstance();		//클래스명으로 접근_static(정적)메소드
2. Calendar ob2 = new GregorianCalendar();      //GregorianCalendar()는 Calendar의 하위클래스(업캐스팅)
3. GregorianCalendar ob3 = = new GregorianCalendar();
*/

//현재의 년, 월, 일, 요일을 Calendar 객체를 활용하여 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
   public static void main(String[] args)
   {
	   // Calendar 클래스 기반 인스턴스 생성
	   // Calendar rightnow = new Calendar();		//-(x)
	   Calendar rightNow = Calendar.getInstance();

	   // 생성된 달력 인스턴스를 통해
	   // 날짜 관련 정보를 얻어 낼 수 있는 메소드 -> 『get()』
	   int y = rightNow.get(Calendar.YEAR);
	   System.out.println(y);
	   //--==>> 2021

	   int m = rightNow.get(Calendar.MONTH) +1;		//★CHECK★ 월은 배열로 구성되어 있어서 +1을 해야한다.
	   System.out.println(m);
	   //--==>> 8

	   int d = rightNow.get(Calendar.DATE);
	   System.out.println(d);
	   //--==>> 10

	   int w = rightNow.get(Calendar.DAY_OF_WEEK);
	   System.out.println(w);
	   //--==>> 3 

	   System.out.println(y+"-"+m+"-"+d+"-"+w);
	   //--==>> 2021-8-10-3

/*
	   //테스트
	   System.out.println(Calendar.SUNDAY);	//--==>> 1 -> 일요일
	   System.out.println(Calendar.MONDAY);	//--==>> 2 -> 월요일
*/

	   System.out.println();

	   String week ="";
	   switch (w)
	   {
		//case 1 : week = "일요일"; break;
		case Calendar.SUNDAY : week = "일요일"; break;

		//case 2 : week = "월요일"; break;
		case Calendar.MONDAY : week = "월요일"; break;

		//case 3 : week = "화요일"; break;
		case Calendar.TUESDAY : week = "화요일"; break;

		//case 4 : week = "수요일"; break;
		case Calendar.WEDNESDAY : week = "수요일"; break;

		//case 5 : week = "목요일"; break;
		case Calendar.THURSDAY : week = "목요일"; break;

		//case 6 : week = "금요일"; break;
		case Calendar.FRIDAY : week = "금요일"; break;

		//case 7 : week = "토요일"; break;
		case Calendar.SATURDAY : week = "토요일"; break;
	   
	   }


	   System.out.println(y+"-"+m+"-"+d+"-"+week);
	   //--==>> 2021-8-10-화요일

	   ///////////////////////////////////////////////////////////////////////
	   System.out.println();

	   // Calendar 객체 생성
	   Calendar rightNow2 = new GregorianCalendar();

	   String[] week2 = {"일요일", "월요일","화요일","수요일","목요일","금요일","토요일"};

	   //달력의 날짜 세팅 -> 『set()』
	   rightNow2.set(2021, 11, 24);			//12월 달력 ★CHECK★

	   System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));

	   System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 금요일


		//달력의 날짜 세팅

		//요일 확인
		rightNow2.set(1998,05,11);
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);


		  
   }
}