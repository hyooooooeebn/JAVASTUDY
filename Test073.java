/*=============================================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)와 초기화 블럭(Initialized Block)
===============================================================*/

public class Test073
{

	//int n=100; //--가능 (초기화)
	//int m=200;

	//int n;
	//int m;
	//n=100;
	//m=200;   //-- 불가능 (클래스에서 대입연산 불가능) ★CHECK★


	int n;
	int m;

	//초기화 블럭		★CHECK★
	//-- "생성자보다 우선순위가 낮음" = 생성자가 초기화 블럭 다 갈아엎을 수 있음
	{
		n=100;
		m=200;
		System.out.println("초기화 블럭 실행...");
	}			//--가능

	// 생성자
	Test073(int n, int m)
	{
		this.n =n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행,,,");
	}

	// 생성자(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("생성자 실행");
	}

	//출력 메소드 정의
	void write()
	{
		System.out.println("n:" + n + "," + "m:" + m);

	}


	public static void main(String[] args)
	{
		Test073 ob1 = new Test073();

		ob1.write();

		Test073 ob2 = new Test073(1234, 5678);
		//--==>> 초기화 블럭 실행...					★CHECK★
		//		 매개변수 있는 생성자 실행,,,

		ob2.write();
		//--==>> n:1234,m:5678
		
	}
}