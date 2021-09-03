/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

//outer class
class Test2
{
	static int a = 10; //전역변수, Test2의 멤버변수, static변수(클래스 변수)
	int b = 20;		   //전역변수, Test2의 멤버변수, instance변수(인스턴스 변수)	
	
	void write()		// ▶첫 번째 write()메소드
	{
		System.out.println("write()...①");
		final int c = 30;	//지역변수, 상수화된 변수						//★CHECK★
		int d =40;			//지역변수, 값이 수시로 변할 수 있는 변수

		//메소드 안에 존재하는 또다른 클래스(지역 클래스, local class)
		//inner class
		class LocalTest
		{
			void write() // ▶두 번째 write()메소드
			{
				System.out.println("write()...②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);		//c의 탄생 시점은 모르지만 바뀌지않기 때문에 접근가능	
				//System.out.println("d : " + d);			//--에러발생		//★CHECK★
			}	
		}//end LocalTest

		//※ 변수 c와 변수 d는 둘 다 지역변수이지만,,,
		//	 c는 final변수이기때문에,,,
		//	 두번째 write()메소드에서 접근하는 시점에 언제이더라도
		//	 30의 고정된 값임을 보장받을 수 있다
		//	 반면에, d는 그값이 수시로 변동될 수 있는 상활이므로
		//	 LocalTest클래스의 인스턴스 생성 시점을
		//	 강제로 확정할 수 없기 때문에
		//	 d에 접근하는 것은 피해야한다.

		LocalTest ob1 = new LocalTest();
		ob1.write();		//--두 번째 write() 메소드 호출

		d+=10;
	} // end write()
}//end Test2


public class Test119
{
	public static void main(String[] args)
	{
		
		Test2 ob2 = new Test2();
		ob2.write();		//--
		/*
		write()...①
		write()...②
		a : 10
		b : 20
		c : 30
		*/
	}
}