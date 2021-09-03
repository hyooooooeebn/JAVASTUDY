/*=======================
   ■■ 예외 처리 ■■
==========================*/

/*
○ 프로그램에서 발생하는 오류는
	
	① 잘못된 문법을 사용하거나 변수 등을정의하지 않은 상태에서
	   사용함으로써 컴파일 단계에서 발생하는 문법적인 오류

	② 프로그램을 실행하는 과정에서 발생되는 런타임 오류
	
	로 나눌 수 있다.

		- 개발자가 문제 분석을 잘못하거나 실수에 의해
		  엉뚱한 결과가 가져오게 되는 논리적인 오류와

		- 시스템 이상에서 발생되는 시스템 오류, 그리고

		- 프로그램 실행 중 발생되는 비정상적인 상황을 의미하는 
		  예외상황이 있다.

		예를 들어.
		-> 어떤 수를 0으로 나누거나..
		-> 배열 첨자를 벗어나는 상황,,
		-> 존재하지 않은 파일을 오픈하여 읽혀들인다거나,,,

	==> 개발자가 이런 예외 사항이 발생할 경우를 미리 예측하여
		적절히 대응하기 위한 절차를 구현하도록 문법을 정리해 놓은 것,
		예.외.처.리.

※ 정리해 놓은문법~!!! (→ Exception 클래스)
	
	- 예외는프로그램 실행 중에 발생할 수 있는
	  명령어늬 정상적인 흐름을 방해하는 이벤트로
	  자바에서 예외는하나의 오브젝트이다.

	- 프로그램실행 중에 메소드안에서 오류가 발생하게될경우
	  메소드는 그오류에 해당하는예외 오브젝트를 만들고
	  그것을 자바 런타임 시스템에 전달해 준다.

	- 자바에서의 모든 예외는 Throwable 클래스나
	  Throwable 클래스의 하위 클래스를 상속받아 사용한다.

	- Throwable 클래스는예외를 설명하는 문장이나
	  예외가발생할 때의 프로그램의 상태에 관한 정보를 포함하고 있다.

	- Throwable 클래스에서 파생된 클래스

		 > Exception 클래스
		   Exception 예외 클래스는 일반적으로 프로그래머에 의해
		   복원될 수 있는 예외 상황으로
		   메소드가 실행 중에 던지는 예외를 가리킨다.

		> Error 클래스
		  심각한 예외의 형태로 개발자가 복원할 수 없는 형태의 예외이다.

※ 예외의 종류

	- checked exception
	 메소드 내에서 예외가 발생한 경우
	 메소드를 정의할 때 throws문에 메소드 내에서 발생할 수 있는
	 예외들을명시해주거나 또는 그 예외를 try~catch해서
	 처리해주어야만 하는 예외이다.
	 컴파일러가 컴하일 하는 과정에서 checked exception 이
	 throws 되는가의 여부 혹은 try-catch 되는지의 여부를 판단하여
	 프로그램 예외를 어떤 방식으로든 처이하지 않으면
	 컴파일 자체가 불가능하다.

	- unchecked exception
	 사전에 처리하지 않아도 컴파일러가 체크하지 않는
	 런타임 시에 발생할 수 있는 예외이다.



○ java.lang.Throwable 클래스의 주요 메소드
	
	- String toString()
	: Throwable 각각에 대한 설명을 문자열 형태로 반환한다.
	- void printStackTrace(PrintStream s)
	- void printStackTrace(PrintSriter w)
	: 표준 출력스트림에 스택 호출 목록을 마지막 메소드부터 출력한다.

○ 주요 런타임예외 클래스

	- ArithmeticException
	: 수치 계산상의 오류
	- ArraryStoreException
	: 배열에 잘못된 데이터 향을 저장하여 했을 겨웅 발생하는오루
	- IndexOutOfBouundsException
	: 배열, 문자열, 백터 등에서 인덱스 범위가 벗어난 경우 발생하는 오류
	- ClassCastException
	: 클래스 변환을 잘못한 경우 발생한 오류
	- NullPointerException
	: 빈 객체를 참조하는 경우 (초기화 되지 않은 변수 사용 등) 발생하는 오류
	- SecurityException
	: 자바의 내부 보안 사항을 위반했을 경우 발생하는 오류

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{										   //방법(1):예외사항을 밖으로 던져라... 
	public static void main(String[] args) //throws IOException
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a,b,c;

		/*
		//방법(2)
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("결과 : " + c);
		
		}
		catch (IOException e)
		{
			//IOException -> checked exception
			//--메소들를 정의하는 과정에서 throws한 예외
			//	잡아내거나 던지지 않을 경우 컴파일 에러 발생,
			System.out.println(e.toString());	//Throws클래스에서 toString()오버라이딩완료
												//Throwable 각각에 대한 설명을 문자열 형태로 반환한다.
		}*/


		/*
		//방법(3)
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("결과 : " + c);
		
		}
		catch (IOException e1)
		{
			//IOException -> checked exception
			//--메소들를 정의하는 과정에서 throws한 예외
			//	잡아내거나 던지지 않을 경우 컴파일 에러 발생,
			System.out.println(e1.toString());	//Throws클래스에서 toString()오버라이딩완료
												//Throwable 각각에 대한 설명을 문자열 형태로 반환한다.
		}
		catch (NumberFormatException e2)
		{
			// Integer.parseInt -> unchecked exception
			// 안해도 오류는 아니지만 예외일 경우가 생긴다
			System.out.println(e2.toString());
			System.out.println("숫자 형태의 데이터를 입력하세요.");
		}*/

		/*
		//방법(4)
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("결과 : " + c);
		
		}
		catch (Exception e)	//다양한 Exception을 통합적으로 처리 가능
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());

			System.out.println("printStackTrace...");
			e.printStackTrace();
		}*/

		//방법(5)
		try
		{
			System.out.print("첫 번째 정수 입력 : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("두 번째 정수 입력 : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;
	
			System.out.println("결과 : " + c);
		
		}
		catch (Exception e)
		{
			System.out.println(e.toString());	
		}
		finally		//★CHECK★
		{
			//예외가 발생하거나 발생하지 않거나...
			//언제나 실행되는 영역

			System.out.println("수고하셨습니다.");
		}
		

	}
}