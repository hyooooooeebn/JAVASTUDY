/*===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
      - StringTokenizer 클래스
===========================================*/
// StringTokenizer 클래스를 실무에서 사용하지않지만 존재한다.
// 뒤에 내용과 유사한 부분이 있어서 보고 넘어간다...
/*
○  StringTokenizer 클래스는
	문자열 파싱(Parsing)을 위한 정보를제공하는 클래스로
	파싱(Parsing)하고자 하는 문자열을인자로 받아 생성하는데,
	여기에서 파싱(Parsing)이란 하나의 문자열을 여러 문자열로
	나누는 작업을 의미하게 되며, 이 때 나누는단위가 되는
	문자열을 토큰(token)이라고 한다.

	StringTokenizer 클래스를 사용하기 위해서는
	java.util 패키지의 StringTokenizer를 import해야 한다.

	☆StringTokenizer 클래스는 호환성을 유지하는 목적으로
	보관 유지되고 있으며☆ 문자열을 파싱(parsing)하기 위해서는
	String 클래스의 split() 메소드나 java.util.regex 패키지를
	사용할 것을 권장하고 있다.


○  생성자
	- 원형
	  StringTokenizer(String str)
	  StringTokenizer(String str, String delim)
	  StringTokenizer(String str, String delim, boolean returnDelims)
	  -> 주어진 문자열 str 을 단어로 분히라는 객체를 생성하며
	     공백문자는 delim에 포함된 문자로 처리하게 된다.
		 만약 returnDelims가 true라면
		 구분 문자도 분리된 데이터로 처리하게 된다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;
import java.util.StringTokenizer;

public class Test136
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파싱할 문자열 입력(컴마구분) : ");		//"사과,딸기,바나나,토마토"
		strTemp = br.readLine();

		//StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//--strTemp를 대상 문자열로,,,
		//	『,』를 구분자로,,,

		strArr = new String[st.countTokens()];						// st.countTokens()  -> 4 
		//--int countTokens()
		//	: 파싱된 문자열 갯수를 반환(return)한다.

		n=0;
		while (st.hasMoreTokens())				//다음 토큰이 있는가 확인만 하는 메소드...
		{
			strArr[n++] = st.nextToken();		//다음으로 이동하고 값을 가져오고 하는 메소드...
		}
		//--『hasMoretokens()』
		//	: 사용할 수 있는 토큰이 남아있는 경우 true 반환,
		//	  더 이상 사용할 토큰이 남아있지 않은 경우 false 반환.
		//	  확인 결과만 반환할 뿐,,,
		//	  실제 내용을 읽어들이는 헤드(▼)를 이동시키지 않는다.

		//--『nextToken()』
		//	: 다음 토큰을 얻어온다.
		//	  다음 토큰을 얻어오며 헤드(▼)를 이동시키게된다.
		//	  구분자를 바꾸었을 경우 다음 허출에도
		//	  바뀐 구분자를 이용하여 토큰을 분리한다.

		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();

	
	}
}