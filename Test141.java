/*==============================
   ■■ 자바의 주요 클래스■■
		- Math 클래스
================================*/

/*
○ java.lang.Math 클래스는

	수학과 관련된 유용한 속성과 함수들을 제공하는 클래스로
	생성자가 있긴하지만,,, 『private』으로 선언되어 있기 때문에
	외부에서 객체를 생성할 수없다.
	단, 모든메소드가 static으로 정의되어있으므로
	객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다.

○ java.lang.Math 클래스의 주요 상수 및 메소드
	
	- public static final double E = 2.71...
	  :자연로그

	- public static final double PI = 3.141592...
	  : 원주율(π)

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	: sin(a) cos(a) tan(a) 값을 반환한다.

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	: asin(a) acos(a) atan(a) 값을 반환한다.

	- public static double toRadians(double angdeg)
    : 각도를 라디언으로 바꾸어 반환한다.
	- public static double toDegrees(double angrad)
	: 라디안을 각도로 바꾸어 반환한다.

	- public static double exp(double a)
	:e의 a승 반환

	- public static double log(double a)
	: 로그값 반환

	- public static double sqrt(double a)
	: a의 제곱근 반환

	- public static double ceil(double a)
	: a보다 크거나 같은 정수 반환(올림)

	- public static double floor(double a)
	: a보다 작거나 같은 정수 반환(절삭)

	- public static double pow(double a, double b)
	: a의 b승 반환

	- public static int round(float a)
	- public static long round(double a)
	: a를 반올림하여 결과값 반환

	- public static doublerandom()
	: 0.0~1.0 사이의 난수 반환

*/

public class Test141
{
	public static void main(String[] args)
	{
		System.out.println("원주율 : "+ Math.PI);

		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		//--==>> 2의 제곱근 : 1.4142135623730951

		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
		//--==>> 파이에 대한 Degree : 180.0

		System.out.println("2파이레 대한 Degree : " + Math.toDegrees(2.0*Math.PI));
		//--==>> 2파이레 대한 Degree : 360.0

		double radian45 = Math.toRadians(45);

		System.out.println("싸인 45   : " + Math.sin(radian45));
		System.out.println("코싸인 45 : " + Math.cos(radian45));
		System.out.println("탄젠트 45 : " + Math.tan(radian45));
		//--==>> 싸인 45   : 0.7071067811865475
		//		 코싸인 45 : 0.7071067811865476
		//		 탄젠트 45 : 0.9999999999999999

		System.out.println("로그25 : " + Math.log(25));
		//--==>> 로그25 : 3.2188758248682006
		System.out.println("2의 4승 : " + Math.pow(2,4));
		//--==>> 2의 4승 : 16.0

		for (int i = 1;i<10 ;i++ )
		{
			System.out.println("0.0 ~ 1.0사이의 난수 : "+ Math.random());
		}

		//--==>> 0.0 ~ 1.0사이의 난수 : 0.5957917690637358
		//		 0.0 ~ 1.0사이의 난수 : 0.9285857095111426
		//		 0.0 ~ 1.0사이의 난수 : 0.8775555556924443
		//		 0.0 ~ 1.0사이의 난수 : 0.4850339088078991
		//		 0.0 ~ 1.0사이의 난수 : 0.48036337347101665
		//		 0.0 ~ 1.0사이의 난수 : 0.32312063693533055
		//		 0.0 ~ 1.0사이의 난수 : 0.2140089088671845
		//		 0.0 ~ 1.0사이의 난수 : 0.18991637411833084
		//		 0.0 ~ 1.0사이의 난수 : 0.26442595348529996
		
	}
}