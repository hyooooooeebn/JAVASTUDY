/*=========================================
	■■■ 클래스와 인스턴스 ■■■
===========================================*/

/*
	사용자로부터 임의의 정수를 입력받아
	1부터 입력받은 수 까지의 합을 연산하여
	결과 값을 출력하는 프로그램을 구현한다.

	단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
	또한, 입력 처리 과정에서 BufferedReader를 활용하며, 
	입력 데이터가 1보다 작거나 1000보다 큰 경우
	다시 입력받을 수 있는 처리를 포함하여 프로그램 구현

	실행 예 )
	임의의 정수 입력(1~1000) : 1022
	임의의 정수 입력(1~1000) : -20
	임의의 정수 입력(1~1000) : 100
	>> 1부터 100까지의 합 : 5050

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// 주요 변수 선언(사용자의 입력값을 담아둘 변수)
	int n;

	//입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
		    n = Integer.parseInt(br.readLine());
		}
		while (1 > n || n > 1000);
		
	}


	// 연산 처리 메소드 정의
	int sum()
	{	
		int result =0;
		for (int a=1; a<=n ;a++ )
		result +=a;
		return result;
	}
	

	//결과 출력 메소드 정의
	void print(int result) 
	{
		System.out.printf(">> 1부터 %d까지의 합 : %d\n",n,result);		
	}

}

public class Test067
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();
		ob.input();
		int a = ob.sum();
		ob.print(a);
	}
} 

//최종결과
/*
임의의 정수 입력(1~1000) : 1023
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 90
>> 1부터 90까지의 합 : 4095
계속하려면 아무 키나 누르십시오 . . .

*/

