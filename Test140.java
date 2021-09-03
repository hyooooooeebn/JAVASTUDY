/*   ==============================
   ■■ 자바의 주요 클래스■■
   - Calendar 클래스
 ==============================*/
  
/*
 실행 예)
 오늘 날짜 : 2021-8-11 수요일
 며칠 후의 날짜를 확인하고자합니까? : 200

 ============[확인 결과]==============
 200일 후 : xxx-xx-xx x요일
 =====================================

 ※ 현재 날짜를 기준으로 날 수를 더하는 연산메소드
 	『객체.add(Calendar.DATE, 날 수);』
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test140
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		String[] week = {"일요일", "월요일","화요일","수요일","목요일","금요일","토요일"};

		System.out.print(" 오늘 날짜 : ");

		int y = cal.get(Calendar.YEAR);

	    int m = cal.get(Calendar.MONTH) +1;		

	    int d = cal.get(Calendar.DATE);
	  
		int w = cal.get(Calendar.DAY_OF_WEEK);

	   
	    System.out.println(y+"-"+m+"-"+d+" "+week[w-1]);


		System.out.print("며칠 후의 날짜를 확인하고자합니까? : ");
		int a = sc.nextInt();

		cal.add(Calendar.DATE, a);

		y = cal.get(Calendar.YEAR);

	    m = cal.get(Calendar.MONTH) +1;		

	    d = cal.get(Calendar.DATE);
	  
		w = cal.get(Calendar.DAY_OF_WEEK);



		System.out.println();
		System.out.println("============[확인 결과]==============");
		System.out.printf("%d일 후 : %d-%d-%d %s\n",a,y,m,d,week[w-1]);
		System.out.println("=====================================");
	   

		

	}
}