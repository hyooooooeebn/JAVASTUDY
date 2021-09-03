/*=========================================
	■■■ 클래스와 인스턴스 ■■■
===========================================*/

//직사각형 클래스 설계

/*
직사각형의 넓이와 둘레 계산, 클래스로 표현

클래스의 정체성 -> 직사각형
클래스의 속성	-> 가로, 세로, (넓이, 둘레, 부피, 무게, 재질, 색 ....)
클래스의 기능	-> 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력 ...


객체를 구성		-> 데이터(속성, 상태) + 기능(동작, 행위)
						↓					  ↓	
클래스를 설계	->	   변수			  +	    메소드

class 직사각형
{
	//데이터 -> 변수 
	int 가로, 세로;

	//기능 -> 메소드
	가로세로 입력()
	{
	}
	
	둘레 계산()
	{
	}
	
	넓이 계산()
	{
	}

	결과출력()
	{
	}

}

*/

import java.util.Scanner;

class Rect		//직사각형 클래스 설계
{
	//데이터(속성, 상태) -> 변수 
	int w,h;			//가로, 세로;

	//기능(동작, 행위) -> 메소드
	void input()			//가로세로 입력()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();

		//retrun 없으면 리턴자료형이 void 
	}
	
	int calLength()				//둘레 계산()
	{
		// 결과값으로 반환하게 될 변수 선언 및 초기화
		int result = 0;

		// 선언한 변수에 값 채워넣기
		result = (w+h) * 2;
		
		// 최종 결과값 반환;
		return result;
	}
	
	int calArea()				//넓이 계산()
	{
		int result = 0;

		result = w * h;

		return result;
	}

	void print(int a, int l)						//결과출력()
	{
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}

}

/*
※ 하나의 자바파일(.java)에 여러 개의 클래스를 만들 수 있다.
	 하지만, 『public class』는 하나만 올 수 있다.
	 파일을 저장할 때의 이름은
	 이 『public class』의 이름으로 지정해서 저장해야 한다.
	 일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
	 또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
	 내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.
																	*/

public class Test065
{
	public static void main(String[] args)
	{
		//Rect 클래스 인스턴스 생성
		Rect ob = new Rect();
		
		// 생성된 인스턴스 ob를 활용하여 입력 메소드 호출
		ob.input();

		// 생성된 인스턴스 ob를 통해 넓이 연산 메소드 호출
		// -> 메소드 호출로 얻어낸 값을 담아낼 준비
		int area = ob.calArea();

		// 생성된 인스턴스 ob를 통해 둘레 연산 메소드 호출
		// -> 메소드 호출로 얻어낸 값을 담아낼 준비
		int length = ob.calLength();

		// 생성된 인스턴스 ob를 통해 출력 메소드 호출
		ob.print(area, length);
	}
}

//최종결과
/*
가로 입력 : 10
세로 입력 : 20
가로 : 10
세로 : 20
넓이 : 200
둘레 : 60
계속하려면 아무 키나 누르십시오 . . .


*/