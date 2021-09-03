/*====================================
   ■■ 자바의 기본 입출력(I/O) ■■
=======================================*/

//OutPutStream 실습

import java.io.OutputStream;
import java.io.IOException;

public class Test169
{
	public static void main(String[] args) throws IOException
	{
		// System.in  : 자바의 표준 입력 스트림
		// System.out : 자바의 표준 출력 스트림

		OutputStream out = System.out;	// →출력 바이트 수도꼭지 on

		byte[] ch = new byte[3];		// 바이트 배열 생성
	
		ch[0] = 65;		// A			// 바이트 채우기
		ch[1] = 97;		// a
		ch[2] = 122;	// z

		out.write(ch);					// 밖으로 내보낼 데이터(변수)를 스트림에 기록 → 물줄기에 내보낼 배띄우기

		out.flush();					// 기록된 스트림을 내보내는 기능을 수행	→ 버퍼에 찬 물 한번에 밀어서 내보내기
										//	지은은 Bufer를 활용하지 않고 있는 상황이기 때문에 생략가능
										//	Buffered되어 있는 스트림은 생략 불가능

		out.close();					// 출력 스트림에 대한 리소스 반납
										//	→ out 스트림 수도꼭지 잠그기

		System.out.println("나와라 뿅!");
		//『out.close()』를 작성한 이후 출력되지 않는 구문
		// 출력되는 스트림을 닫았기 때문에,,,
	}
}