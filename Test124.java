/*===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Object 클래스
===========================================*/

class Test
{
	/*
	public boolean 
	*/
	private int a = 10;

	public void write()
	{
		System.out.println("a : "+ a);
	}
}

public class Test124
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10 == 9 : " + (10==9));
		//--==>> 10 == 9 : false
		//--『==』 비교연산자는 피연산자의 크기를 비교함을 확인

		int a = 10;
		int b = 10;
		System.out.println("a == b : " + (a==b));
		//-==>> a == b : true
		//--『==』 비교연산자는 피연산자의 크기를 비교함을 확인
		
		System.out.println("ob1 == ob2 : " + (ob1 ==ob2));
		//--==>> ob1 == ob2 : false
		//--객체(Test)들을 비교하는 과정에서 사용하는 『==』연산자는
		//	크기를 비교하는 것이 아니라 객체의 ☆주소값을 비교☆
		// ★CHECK★

		System.out.println("ob1.equals() : " + (ob1.equals(ob2)));
		System.out.println("ob1.equals() : " + (ob2.equals(ob1)));
		//--==>> ob1.equals() : false
		//		 ob1.equals() : false

		//--『==』연산자와 Object 클래스가 갖고 있는 『equals()』메소드는
		//	동일한개념으로 객체를 주소값을 비교
		


		System.out.println("===========================================");
		System.out.println();

		System.out.println(ob1);
		//--==>> Test@15db9742
		System.out.println(ob1.toString());
		//--==>> Test@15db9742

		System.out.println(ob2);
		//--==>> Test@6d06d69c
		System.out.println(ob2.toString());
		//--==>> Test@6d06d69c

		//『클래스면@해시코드』

		//※ 해시코드 
		//	 :자바 내부적으로 객페를 구분하기 위해 사용하는 것
		//	  메모리의 주소값으로 생각하면 절대로 안된다.

		//※ 객체가 같은면 해시코드가 같지만
		//	 해시코드가값다고 같은 객체는 아니다.



	}
}