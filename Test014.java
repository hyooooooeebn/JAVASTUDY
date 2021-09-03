/*==============================================
	■■■ 자바 기본 프로그래밍 ■■■
	-자바의 기본 입출력 : System.in.read()
================================================*/


//실행 예)
//한 문자 입력 : A
//한 자리 정수 입력 : 7

// >> 입력한 문자 : A
// >> 입력한 정수 : 7

/*
   『System.in.read()』메소드는 한 문자만 가져온다.
   단, 하나의 문자를 입력받아 입력받은 문자의
   ASCII CODE 값을 반환한다.
*/


import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		//○ 주요 변수 선언
		char ch;				//입력받은 문자 담을 변수
		int n;					//입력받은 정수 담을 변수
		
		//char temp;  ★다른방법
		
		//○ 연산 및 처리
		//-사용자에게 안내 메세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();		//허락도 안받고 외부에서 값받을 수 없으니까 IOException사용
		//System.in.read(); 입력대기열에 있는 것을 데려와라~

		//※ 입력대기열에 남아있는 『\r』과 『\n』을 스킵 (enter = \r +\n)
		System.in.skip(2); //2칸뒤로 스킵
		//--매개변수(2)에 의해 두 글자를 읽지 않고 건너뛴다.

		//-사용자에게 안내 메세지 출력 및 입력값 얻어오기
		System.out.print("한 자리 정수 입력 :");
		n = System.in.read(); //입력한 문자의 아스키코드값 담김

		/*§아키스코드 값 §
		 1->49
		 2->50
		 3->51... 
		 48만큼 증가한 형태*/

		n-=48;  
		//temp =(char)n; ★다른방법


		//○ 결과 출력
		System.out.println();
		System.out.println(" >> 입력한 문자 : " + ch);
		System.out.println(" >> 입력한 정수 : " + n);
		//System.out.println(" >> 입력한 정수 : " + temp);  ★다른방법
	}
}

//최종결과
/*
한 문자 입력 : A
한 자리 정수 입력 :7

 >> 입력한 문자 : A
 >> 입력한 정수 : 7
계속하려면 아무 키나 누르십시오 . . .
*/