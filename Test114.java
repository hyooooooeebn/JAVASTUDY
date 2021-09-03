/*================================ 
	■■■ 클래스 고급 ■■■
	 - 인터페이스(Interface)
================================== */

// 인터페이스
interface ADemo
{
	public void write();	//interface안에는 추상 메소드만 가능하기 때문에
							//abstract 생략가능
}

// 인터페이스
interface BDemo
{
	public void print();
}


//※ 인터페이스는 2개 이상을 구현할 수 있다.
// -> 다중 상속이 되지 않는 부분을 보충하는 개념

// 클래스
//class DemoImpl
//class DemoImpl extends ADemo (x)
//implements하는 순간 추상클래스
//abstract class DemoImpl implements ADemo, BDemo
//모든 메소드 재정의 되면 추상 사라짐...
class DemoImpl implements ADemo, BDemo
{
	/*
	public abstract void write();
	public abstract void print();
	*/

	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}

	// ※ JDK 1.5(5.0) 에서는 ★인터페이스 메소드★를
	//	  오버라이딩 할 때 『@Override』 어노테이션을 사용할 수 없다
	//	  JDK 1.6(6.0)부터 가능한 문법
	//	  단, 상속받은 클래스의 메소드를
	//	  오버라이딩할 때는 JDK 1.5(5.0)부터 가능하다...
}


// main() 메소드를 포함하고 있는 외부의 다른클래스
public class Test114
{
	public static void main(String[] args)
	{
		//ADemo ob =new ADemo();		//인터페이스는 인스턴스생성 불가


		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo 인터페이스 메소드 write()...
		//		 BDemo 인터페이스 메소드 print()...

		ADemo ob2 = new DemoImpl();			//업캐스팅
		BDemo ob3 = new DemoImpl();	

		//ob2.print();		//에러발생...
		//ob3.write();		//에러발생...		//각 인터페이스에 없는 메소드 호출 불가

		ob2.write();
		ob3.print();

		((BDemo)ob2).print();
		((ADemo)ob3).write();		
		//DemoImpl 클래스가 모두 재정의했기때문에 가능....					★CHECK★
		//만약 DemoImp클래스가 이들 중 한 인터페이스만 구현한 상황이라면
		//이 구문은 런타임 에러 발생하는 구문이 된다...
		//업캐스팅,,, 다운캐스팅이 아니고 그냥 강제 형 변환이라고 할 수 있다,,,


		

	}
}