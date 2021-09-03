/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

/*
	Vector v = new Vector();
	비어있는 Vector 자료구조생성

	Vector v = new Vector(8);
	8개의 초기 element를 가진 Vector 자료구조 생성
	8개가 모두 채워지게 되면 자동 확장

	Vector v = new Vector(3,5);
	3개의 초기 element를 가진 백터 생성
	3개가 모두 채워지면 자동으로 5개 증가

	※  백터는 데이터 요소로 정수, 실수,,,등을
		담아내는 것이 가능
		-> 데이터 안정성 확보 check~
*/

import java.util.Vector;
import java.util.Iterator;

// MyVector클래스 설계
class MyVector extends Vector<Object>
{
	//사용자 정의 생성자
	MyVector()
	{
		//Vector(슈퍼 클래스) 생성자 호출
		super(1,1);	 //(주어진용량, 증가량)			
		
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}

	void addFloat(float f)
	{
		addElement(new Float(f));
	}

	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		int length =size();
		System.out.println("백터 요소 수 : " + length);
		//--==>> 백터 요소 수 : 4


		Object o;

		for (int i=0;i<length ;i++ )
		{
			o = elementAt(i);

			//『instanceof』연산자  ★CHECK★
			//--처리해야 하는 대상의 객체 타입 확인

			if (o instanceof String)
			{
				System.out.println("문자열 : "+o.toString());	//o(객체)로 접근하면 class명@해시태그
			}
			else if (o instanceof Integer)
			{
				System.out.println("정수형 : "+o); //오토언박싱		//int를 Integer로 자동 박싱해서 접근,,,
																	//Vector는 기본 자료형을 받을 수 없다...
			}else if (o instanceof Float)					
			{
				System.out.println("실수형 : "+o);
			}else if (o instanceof char[])
			{
				//System.out.println("문자 배열 : " + o);
				//System.out.println("문자 배열 : " + o.toString());
				System.out.println("문자 배열 : " + String.copyValueOf((char[])o));	//★CHECK★
													//String.copyValueOf((문자배열)) -> 문자열
			}
			else 
			{
				System.out.println("타입 확인 불가");
			}
		}

/*
		Iterator<Object> it = this.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		//--==>> 5
		//		 3.14
		//		 안녕하세요
		//		 [C@15db9742
*/
	}

} //end MyVector class


public class Test155
{
	public static void main(String[] args)
	{
		//MyVector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		//주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};

		v.addInt(digit);			//벡터 자료구조에 정수 저장
		v.addFloat(real);			//벡터 자료구조에 실수 저장
		v.addString(s);				//벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//벡터 자료구조에 문자배열 저장

		v.write();
	}
}