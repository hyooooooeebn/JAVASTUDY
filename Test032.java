/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/


/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단,if조건문을 활용하여 처리할 수 있도록 하며
연산 결과는 편의상 정수형으로 처리

//실행 예)
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +

 >> 20 + 14 =34
 																*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{

		
		/*
		//방법 ①

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		char c;						//『Strig c;』는 불가능 -> 문자열 비교하는 법 모름
		int d=0;
		
		System.out.print("첫 번째 정수 입력 : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("연산자 입력[+ - * /] : ");
		c = (char)System.in.read();								//★CHECK★
		//		  ----------------					
		//			    int 형
		//『System.in.read()』하나의 문자를 받아오는 메소드
	 

		if(c=='+')				//43==43 -> 아스키코드값
		{
			System.out.printf("%d + %d = %d",a,b,(a+b));

		} else if (c=='-')
		{
			 System.out.printf("%d - %d = %d",a,b,(a-b));

		} else if (c =='*')
		{
			System.out.printf("%d * %d = %d",a,b,(a*b));
			
		}else if (c=='/')
		{
		    System.out.printf("%d / %d = %d",a,b,(a/b));
			
		} else
		{ 
			System.out.println("연산자 오류입니다.\n");

		} */


		/*
		//방법 ②

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a,b,c;
		
		System.out.print("첫 번째 정수 입력 : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("연산자 입력[+ - * /] : ");
		c = System.in.read();							
	
		

		if(c==43)  //43==43 -> 아스키코드값
		{
			System.out.printf("%d + %d = %d",a,b,(a+b));
		} else if (c==45)
		{
			 System.out.printf("%d - %d = %d",a,b,(a-b));
		} else if (c ==42)
		{
			System.out.printf("%d * %d = %d",a,b,(a*b));	
		}else if (c==47)
		{
		    System.out.printf("%d / %d = %d",a,b,(a/b));	
		} else
		{ 
			System.out.println("연산자 오류입니다.\n");
		} */



		// 방법 ③		★CHECK★

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a,b,result=0;
		char op;
		
		System.out.print("첫 번째 정수 입력 : ");
		a =Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();							
	
		

		if(op=='+')  
			 result = a + b;
		else if (op=='-')
			 result = a - b;
	    else if (op=='*')
			result = a * b;	
		else if (op=='/')
		    result = a/b;
		else
			System.out.print("연산자 오류입니다.\n");
		
		 
		System.out.printf("\n >> %d %c %d = %d",a,op,b,result);
	

	}
}

//최종결과
/*
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +
 >> 20 + 14 = 34
계속하려면 아무 키나 누르십시오 . . .
*/