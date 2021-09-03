/*==================================
  ■■■ 자바의 개요 및 특징 ■■■
  -변수와 자료형
  -키워드 및 식별자
  =================================*/

public class Test004
{
	public static void main(String[] args)
		{
			double height = 172.8;
			int age = 25;
			char degree = 'A';

			String name = "박효빈";

			//-String name = "유영재";
			//※ 스포크 영역 안에서 변수명은 식별자


			//-String #name = "서강준";
			/* 『$』와 『_』를 제외한 특수문자는 사용 불가
			하지만 이마저도 함부로 사용하면 안된다*/

			//-int tel = 0101234567;
			//정수형이기때문에 앞에 0은 나오지않는다
			String tel = "01012345678";
			String _tel = "010-1234-5678";


			String 주소 = "경기도 고양시";
			/*--문법적으로는 한글 사용가능 하지만
				실무적인 측면에서 접근한다면
				절대로 사용하면 안된다*/


			//실행결과
			System.out.println("name : " + name);
			System.out.println("tel : " + tel);
			System.out.println("_tel : " + _tel);
			System.out.println("주소 : " + 주소);
			
		}
}


//최종결과
/*
name : 박효빈
tel : 01012345678
_tel : 010-1234-5678
주소 : 경기도 고양시
계속하려면 아무 키나 누르십시오 . . .
*/