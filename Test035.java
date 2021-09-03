/*=============================================================
	■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
	- if ~ else문 실습
===============================================================*/

/* ○ 과제
사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
소문자를 입력받았을 경우 ,,, 대문자로 변환하고,
대문자를 입력받았을 경우 ,,, 소문자로 변환하는
프로그램을 작성한다.
단, 입력은 『System.in.read()』메소드를 활용하여 구현한다.

//실행 예)
알파벳 한 문자 입력 : A
>> a
계속 하려면 아무키나 누르세요...

알파벳 한 문자 입력 : 7
>> 입력 오류~!!
계속 하려면 아무키나 누르세요...
			
																*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;


		// ○ 입력 및 처리
		System.out.print("알파벳 한 문자 입력 : ");
		a = System.in.read();

		if(a< 65 || (90 < a && a <97) || a >122)
			System.out.print(">> 입력 오류~!!\n");             //결과출력1 (알파벳이 아닌 경우)
		
		else if( 65<=a && a<=90)
		{
			a=a+32;
			System.out.printf("알파벳 한 문자 입력 : %c\n",a); //결과출력2 (대문자 -> 소문자)

		}else if (97 <=a && a<=122)
		{
			a=a-32;
			System.out.printf("알파벳 한 문자 입력 : %c\n",a); //결과출력3 (소문자 -> 대문자)
		}

		
	}
}

//최종 결과
/*
알파벳 한 문자 입력 : A
알파벳 한 문자 입력 : a
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : 7
>> 입력 오류~!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : h
알파벳 한 문자 입력 : H
계속하려면 아무 키나 누르십시오 . . .
*/