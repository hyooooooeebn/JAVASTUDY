/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

class InnerOuterTest
{
	static int a =10;
	int b = 20;

	class InnerNested
	{
		int c=30;

		void write()
		{
			System.out.println("inner의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	} //end class InnerNested

	void write()
	{
		System.out.println("outer의 write()");
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}// end class InnerOuterTest



public class Test120
{
	public static void main(String[] args)
	{
		//outer 의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//--outer의 write()호출

		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> 에러,,,(static이 없으니까,,,)

		//InnerNested ob4 = new InnerNested();
		//--==>> 에러,,,

		//※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//	 외부 클래스의 인스턴스를 사용하지 않고
		//	 단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		
		//★CHECK★
		//※Test118.java 파일과 비교
		
		//『new InnerOuterTest().new InnerNested();』			//★CHECK★

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		/*
		inner의 write()...
		a : 10
		b : 20
		c : 30
		*/

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		/*
		inner의 write()...
		a : 10
		b : 20
		c : 30
		*/

		//outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		//										-----------------------------------------		여기다름

		//cf) static -> 중첩 내부 클래스
		//Test.StaticNested ob = new Test.StaticNested();

		//outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
		//										-----------------------------------------		여기다름



	}
}