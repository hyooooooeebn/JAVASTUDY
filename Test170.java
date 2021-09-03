/*====================================
   ■■ 자바의 기본 입출력(I/O) ■■
=======================================*/

//Reader 실습
//Test168.java와 비교

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test170
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in : 자바 표준 입력 스트림 -> 바이트 기반 스트림
		// InputStreamReader : 바이트 기반 스트림을 문자 기반 스트림으로 변환
		// Reader : 문자 기반 스트림 객체
		Reader rd = new InputStreamReader(System.in);
	//	------		     ----------------  ----------
	//  문자		       바이트-> 문자     바이트
		
		System.out.println("문자열 입력(종료:Ctrl+z)");
		while ( (data = rd.read() ) != -1)
		{
			ch=(char)data;
			//System.out.write(ch);
			//--==>> 
			/*
			rkskfek
			rkskfek
			가나다라
			섆|
			*/

			System.out.print(ch);
			//--==>>
			/*
			1234
			1234
			rkskekf
			rkskekf
			가나라다
			가나라다
			*/
		}
	}
}