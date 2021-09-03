/*=========================================
	■■■ 지역변수와 전역변수 ■■■
	- 지역변수의 초기화 테스트 실습
===========================================*/


// <<Test063.java와 비교>>


public class Test064
{
	//전역 변수 a 선언
	int a; 
	//-- 자동 0으로 초기화 지원

	boolean b;

	char c;
	
	double d;

	public static void main(String[] args)
	{
		Test064 ob = new Test0]64();

		System.out.println("ob.a : " + ob.a);
		//--==>> ob.a : 0

		System.out.println("ob.b : " + ob.b);
		//--==>> ob.b : false
		System.out.println("ob.c : " + ob.c);
		//--==>> ob.c :
		System.out.println("ob.d : " + ob.d);
		//--==>> ob.d : 0.0
	}
}









