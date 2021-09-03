//■■■■■■■■■■■■■■■■■■■■■■■■
//              자바 기본 프로그래밍
//                  -변수와 자료형
//■■■■■■■■■■■■■■■■■■■■■■■■




public class Test003
{
	public static void main(String[] args)
	{
		//변수 선언
		int a;

		//변수 초기화(변수 a에 10대입)
		a = 10;

		// 변수 선언 및 초기화(선언과 대입을 한 번에 처리)
		int b = 20;

		//변수 선언
		int c;

		//출력물을 통해 확인(테스트)
		//System.out.print(c);
		//===> 에러발생(컴파일 에러)

		c = a + b;

		System.out.println(c);
		//=====> 30

		//테스트
		System.out.println("a의 값은" + a + "입니다.");
		System.out.println("b의 값은" + b + "입니다.");
		System.out.println("a와 b를 더한 값은" + c + "입니다.");
		//--==> a의 값은10입니다.
        //      b의 값은20입니다.
        //      a와 b를 더한 값은30입니다.


		/*『+』연산자를 사용하는 과정에서
		  피연산자 중 문자열이 포함되어 있을 경우
		  문자열 결합 연산자로 활용되며 
		  처리결과는 문자열의 형태로 반환된다.*/

		  System.out.println(1+2);
		  System.out.println("1"+2);
		  System.out.println(1+"2");
		  System.out.println("1"+"2");

		  /*3
			12
			12
			12*/


	}
}
