/*==============================================
		■■■ 자바 기본 프로그래밍 ■■■
		-퀴즈
		삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
		이 삼각형의 넓이를 구하는 프로그램을 구현한다.
================================================*/

//실행 예)
//■ 삼각형의 넓이 구하기 ■
//- 삼각형의 밑변 입력 : 3
//- 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : 

//※삼각형의 넓이 = 밑변 * 높이 / 2

/*[내가 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 //입력값을 받아오기 위함

		 int a,b;
		 double c;

		 System.out.println("■ 삼각형의 넓이 구하기 ■");
		
		 System.out.print("-삼각형의 밑변 입력 :");
		 a = Integer.parseInt(br.readLine()); //밑변 a 받아오기
		
		
		 System.out.print("-삼각형의 높이 입력 :"); 
		 b = Integer.parseInt(br.readLine()); //높이 b 받아오기


		 c=a*b/2.0;

		 System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %f\n",a,b,c); 
	}
}

//최종결과
/*■ 삼각형의 넓이 구하기 ■
-삼각형의 밑변 입력 :3
-삼각형의 높이 입력 :5
>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.500000
계속하려면 아무 키나 누르십시오 . . .

*/



//[같이 한 풀이]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test012
{
	public static void main(String[] args) throws IOException
	{
		// ◎주요 변수 선언
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int bottomLength, height;		//밑변과 높이 선언
		 double area;

		 
		 // ◎ 연산 및 처리

		 // ① 사용자에게 안내 메세지 출력
		 System.out.println("■ 삼각형의 넓이 구하기 ■");		
		 System.out.print("-삼각형의 밑변 입력 :");

		 // ② 사용자가 입력한 데이터를 정수 형태로 변환 후 
		 //	   변수 bottomLength에 담아내기
		 bottomLength = Integer.parseInt(br.readLine()); 
		
		 // ③ 다시 사용자에게 안내 메세지 출력
		 System.out.print("-삼각형의 높이 입력 :");
		 
		 // ④ 사용자가 입룍한 데이터를 정수 형태로 변환 후
		 //	   변수 height 에 담아내기
		 height = Integer.parseInt(br.readLine()); 

		 // ⑤ 값이 채워진 변수들을 활용하여 넓이 구하는 연산 수행
		 area = bottomLength * height /2.0;                             //☆CHECK☆
		//		  정수형     * 정수형 /실수형 => 실수 기반 연산 수행
		/* ※실수 자료형이 결과값으로 산출되는 과정에서
			 실수 기반의 연산이 필요한 상황.
			 정수형 『2』가 아닌 『2.0』으로 나눗셈 연산을 수행하게 되면
			 이 연산은 실수 기반으로 처리된다.*/


		// ◎ 결과 출력
		//System.out.print() -> 에러
		 System.out.println(); //-> 개행
		 System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n",bottomLength,height,area); 
	}
}
//최종 결과
/*■ 삼각형의 넓이 구하기 ■
-삼각형의 밑변 입력 :3
-삼각형의 높이 입력 :5

>> 밑변이 3, 높이가 5인 삼각형의 넓이 : 7.50
계속하려면 아무 키나 누르십시오 . . .
*/