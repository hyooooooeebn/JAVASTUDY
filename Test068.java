/*=========================================
	■■■ 클래스와 인스턴스 ■■■
===========================================*/

/*
	사용자로부터 임의의 두 정수와 연산자를 입력받아
	사칙연산을 수행하는 프로그램을 구현
	단, 클래스와 인스턴스의 개념을 활용

	실행 예)
	임의의 두 정수 입력(공백 구분) : 10 5
	임의의 연산자 입력(+ - * /) : +
	>> 10 + 5 = 15
*/

import java.util.Scanner;
import java.io.IOException;

class cal
{
	//주요 변수 선언
	int a,b;
	char c;

	// 메소드 정의 (기능 : 입력)
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);	//공백구분하면 Scanner사용하기
												//★ CHECK ★
		
		System.out.print("임의의 두 정수 입력(공백 구분) : "); 
						
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /) : ");
		c = (char)System.in.read();
	}


	// 메소드 정의 (기능 : 연산)
	int op()
	{	
		
		int result = 0; 

		/* [내가 한 풀이]
		if (c=='+')
			result = a+b;
		if (c=='-')
			result = a-b;
		if (c=='*')
			result = a*b;
		if (c=='/')
			result = a/b;
		
		return result;
		*/

		switch(c)
		{
			case '+' : result = a + b; break;
			case '-' : result = a - b; break;
			case '*' : result = a * b; break;
			case '/' : result = a / b; break;
		}
		return result;
	}


	// 메소드 정의 (기능 : 출력)
	void print(int d)
	{
		System.out.printf(">> %d %c %d = %d\n",a,c,b,d);
	}
}


public class Test068
{
	public static void main(String[] args) throws IOException
	{
		cal ob = new cal();

		ob.input();
		int a = ob.op();
		ob.print(a);

	}
}

//최종결과
/*
임의의 두 정수 입력(공백 구분) : 10 5
임의의 연산자 입력(+ - * /) : +
>> 10 + 5 = 15계속하려면 아무 키나 누르십시오 . . .
*/