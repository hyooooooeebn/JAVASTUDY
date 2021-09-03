/*=============================
	■■■ 클래스 고급 ■■■
	  - 상속 (Inheritance)
==============================*/

/*
○ 메소드오버라이딩의 특징
	
	- 메소드 이름,리턴타입,파라미터 수나 타입이 완전히 일치해야 한다

	- 반드시 상속 관계가 있어야 한다

	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나같아야 한다,
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩하는 경우
	  접근제어지시자는 『protected』 또는 『public』이어야 한다.

	- 『static』『 final』『 private』 메소드는 오버라이딩 할 수 없다.

	- Exception의 추가는 불가능하다.
	  즉, 상위 클래스의 메소드가 가지고 있는 기존에외사항에
	  새로운 Exception을 추가하는것은 불가능하다는것이다.
*/

//부모 클래스
class SuperTest110
{
	private int a =5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
}

//자식 클래스
class SubTest110 extends SuperTest110
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.print("Sub... print() : " + a + " : " + b + " : " + c);
		//--==>>에러
		//-- 슈퍼 클래스에서 선언된 변수 a에는 접근할 수 없다.
		//   → private변수이기때문에,,,

		System.out.println("Sub... print() : " + b + " : " + c);

		//System.out.println("Sub... print() : " + b);
		//System.out.println("Sub... print() : " + this.b);
		//System.out.println("Sub... print() : " + super.b);
		//--변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//	슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b

		//System.out.println("Sub... print() : " + c);
		//System.out.println("Sub... print() : " + this.c);
		//System.out.println("Sub... print() : " + super.c);
		//--변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//	슈퍼 클래스에서 선언된 c


	}

	@Override
	public void write()
	{
		//System.out.print("Sub... write() : " + a + " : " + b + " : " + c);
		//--==>>에러
		//-- 슈퍼 클래스에서 선언된 변수 a에는 접근할 수 없다.
		//   → private변수이기때문에,,,
		System.out.println("Sub... write() : " + b + " : " + c);

	}
}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test110
{
	public static void main(String[] args)
	{
		//하위 클래스 인스턴스 생성
		SubTest110 ob = new SubTest110();
		
		ob.print();
		//--==>> Sub... print() : 100 : 20

		ob.write();
		//--==>> Super... write() : 5 : 10 : 20

		System.out.println("---------------------------------구분선");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest110)ob).b);					//★CHECK★
		//--==>> 10
		// ※ 슈퍼 부름 
		//	  super를 사용하면 Test110의 부모를 찾는다,,,, 
		//	  하지만 우리가 필요한 것은 ob의 부모,,,, 
		//	  따라서 위와 같은 형태로 부모클래스의 변수를 부른다...

	
		((SuperTest110)ob).write();									//★CHECK★
		//--==>> Sub... write() : 100 : 20
		// ※ 메소드와 변수 꼭 구분해서 정리~~~~~!!!!!1
		// 메소드는 부모가가진 write()호출하는 것이아니다!!
		// 왜냐면 오버라이딩하면서 덮어쓰기해서 자식의 write()가 나온다...




	}
}