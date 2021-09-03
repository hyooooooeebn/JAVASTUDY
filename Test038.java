/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- switch문
===============================================================*/

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
단, switch문을 활용하여 처리할 수 있도록 하며
연산 결과는 편의상 정수형으로 처리

//실행 예)
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +

 >> 20 + 14 =34
 																*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	
	{
		/*
		int a,b,op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = System.in.read(); 

		
	 [내가한거]

		switch (op)
		{
		case 43: System.out.printf("%d + %d = %d\n",a,b,(a+b)); break;
		case 45: System.out.printf("%d - %d = %d\n",a,b,(a-b)); break;
		case 42: System.out.printf("%d * %d = %d\n",a,b,(a*b)); break;
		case 47: System.out.printf("%d / %d = %d\n",a,b,(a/b)); break;
		default : System.out.println("입력오류~!!");

		} */

		
		//①
		/*
		int a,b,op,result;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = System.in.read();

		switch (op)								//op는 int형
		{
			case 43: result =a + b;	break;
			case 45: result =a - b; break;
			case 42: result =a * b; break;
			case 47: result =a / b; break;
			default : return;					// ★CHECK ★

		}
		//		※ return 키워드가 지니는 두가지 의미
		//		1. 값의 반환
		//		2. 메소드의 종료 -> main() 메소드 종료 -> 프로그램 종료
			  															


		System.out.printf(">> %d %c %d = %d\n",a,op,b,result); 
		// %c 대신 %d를 사용하면 '아스키코드값'이 출력된다.	
																			*/
		

		/*
		// ② 
		int a,b,result;
		char op;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();


		switch (op)								//op는 char형  -->> JDK 1.5부터 가능
		{
			case '+': result =a + b;	break;
			case '-': result =a - b; break;
			case '*': result =a * b; break;
			case '/': result =a / b; break;
			default : return;					

		}
		
		System.out.printf(">> %d %c %d = %d\n",a,op,b,result); 
		// %c 대신 %d를 사용하면 '아스키코드값'이 출력된다.			*/
																
		
																	
		// ③
		int a,b,result;
		String op;											// ★CHECK ★

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine();									// ★CHECK ★
	
	
		switch (op)							//op는 문자열   // ★CHECK ★ -->> JDK 1.7부터 가능
		{
			case "+": result =a + b; break;
			case "-": result =a - b; break;
			case "*": result =a * b; break;
			case "/": result =a / b; break;
			default : return;					
		}
		
		System.out.printf(">> %d %s %d = %d\n",a,op,b,result); 
		

	}
}
//최종 결과
/*
①
첫 번째 정수 입력 : 20
두 번째 정수 입력 : 14
연산자 입력[+ - * /] : +
20 + 14 = 34
계속하려면 아무 키나 누르십시오 . . .

②
첫 번째 정수 입력 : 4
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : -
>> 4 - 5 = -1
계속하려면 아무 키나 누르십시오 . . .

③
첫 번째 정수 입력 : 4
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : -
>> 4 - 5 = -1
계속하려면 아무 키나 누르십시오 . . .
*/