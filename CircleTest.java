/*=========================================
	■■■ 클래스와 인스턴스 ■■■
===========================================*/

// ※ Test066.java 파일과 세트~!!

/* [내가 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class CircleTest
{
	int r;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	double area() 
	{
		double result =0;

		result = r * r * 3.141592;

		return result;
	}

	double length()
	{
		double result =0;

		result = r * 2 * 3.141592;

		return result;
	}

	void print(double a, double b)
	{
		System.out.printf("반지름이 %d인 원의\n", r);
		System.out.printf("넓이는 : %f\n", a);
		System.out.printf("둘레는 : %f\n", b);
	}

}*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest
{
	//-- 주요 속성
	int r;							//반지름
	final double PI = 3.141592;		//원주율 (변수의 상수화)

	//-- 기능(동작, 행위)
	//반지름 입력 기능
	void input () throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	//넓이 연산 기능
	double calArea()
	{
		double result =0;

		result = r*r*PI;

		return result;
		
	}

	//둘레 연산 기능
	double calLength()
	{
		double result =0;

		result = r*2*PI;

		return result;
	}

	//출력 기능
	void print(double a, double l)
	{
		System.out.printf("반지름이 %d인 원의\n", r);
		System.out.printf("넓이는 %f\n", a);
		System.out.printf("둘레는 %f\n", l);
	}
}