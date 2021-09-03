/*====================================
   ■■ 자바의 기본 입출력(I/O) ■■
=======================================*/

// Reader Writer 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test172
{
	public void process(InputStream is)	//바이트 기반 입력스트림
	{
		int data;
		System.out.println("문자열 입력(종료:Ctrl+z)");

		try
		{	
			// 매개변수 is라는 바이트기반 객체를 문자 스트림으로 변환하여 Reader에서 참조할 수 있도록 처리
			Reader rd = new InputStreamReader(is);
			
			// 바이트 기반 스트림인 자바 기본 출력스트림을
			// 문자 스트림으로 변환하여 write에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);

			while ((data = rd.read())!=-1)
			{
				wt.write(data);	//문자기반 데이터 쓰겠다. -> 물줄기에 기록
				wt.flush();		//이를 내보내겠다.	-> 기록한 스트림을 밀어내어 내보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args)
	{
		Test172 ob =new Test172();
		ob.process(System.in);		
	}
}

/*
문자열 입력(종료:Ctrl+z)
abcd
abcd
1234
1234
가나다라
가나다라
^Z
계속하려면 아무 키나 누르십시오 . . .
*/