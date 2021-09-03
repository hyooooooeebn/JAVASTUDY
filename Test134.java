/*===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
      - StringBuffer 클래스
===========================================*/

/*
○	StringBuffer 클래스는 문자열을 처리하는 클래스로
	String 클래스와의 차이점은
	String 클래스는 내부 문자열 데이터의 수정이 불가능하지만
	StringBuffer 클래스는 문자열을 사용할 때
	내부 문자열을 실행 단계에서 변경할 수 있다.

	즉, StringBuffer 객체는 가변적인 길이를 가지므로
	객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나
	실행 시점에 버퍼의 크기를 바꿀 수 있는 기능을 제공한다.

	또한, JDK 1.5이후부터는
	문자열을 처리하는 StringBuilder 라는 클래스도 제공한다,
	StringBuilder 클래스의 기능은 StringBuffer 클래스와 동일하지만
	가장 큰 차이점은 muiti-thread unsafe라는 점이다.
	즉, Syncronization이 없기 때문에
	StringBuffer보다 빠르며 동시성(동기화) 문제가 없다면
	StringBuilder를 사용하는 것이 성능을 향상시킬 수 있다.
*/

public class Test134
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));	//object의 equals를 사용 override하지 않아서 주소값 비교
		//--==>> false							//String 의 equals는 override해서 값비교
		//		 false

		System.out.println(sb1);				//toString()은 override해서 해시코드가 나오지 않음
		//--==>> korea		
		System.out.println(sb1.toString());
		//--==>> korea

		System.out.println(sb1.toString().equals(sb2.toString()));	//String의 equals()
		//				  ---------------	
		//				      String
		//--==>> true

		StringBuffer sb3 = new StringBuffer();
		//기본 생성자 호출 시(인스턴스 생성 과정)
		//기본적으로 생성되는 버퍼 크기는 『16』

		//capacity()
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 16

		/////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> 無 (에러나지않는다.)
		
		/*	String의 문자열 추가 방법 -> 비효율적
		String name = "홍길동";
		name += "강감찬";
		System.out.println(name);
		*/


		sb3.append("seoul");		// sb3 += "seoul";
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea우리나라대한민국
		//		 seoulkorea우리나라대한민국

		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 34				==> 버퍼 크기 증가... 버퍼 크기 자동으로 증가시킴,,,,

		///////////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle


		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> 에러 발생
		// String에는 존재하지만 StringBuffer에는 존재하지않는 메소드 toUpperCase()/ toLowerCase()

		String temp3 = sb3.toString();		//String에 담아서 처리가능
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국
		
		//temp3에 바뀐 값이 바뀐거고 아직 sb3는 값이 바뀐것이 아니다.... 
		//sb3 = "seoulkorea우리나라대한민국"
		System.out.println(sb3);


		//○ 대상 문자열(sb3) 중 seoul 앞에 『한국』이라는 문자열 추가
		sb3.insert(0,"한국");
		System.out.println(sb3.toString());
		//--==>> 한국seoulkorea우리나라대한민국

		// ○ 대상 문자열 중 korea 문자열 뒤에 『사랑』이라는 문자열 추가
		//	  단, 대상 문자열의 인덱스를 직접 확인하지 말고,,,
		
		/* [내가 한 풀이]
		sb3.insert(sb3.length()-sb3.indexOf("korea")-1,"사랑");
		System.out.println(sb3.toString());
		*/

		//[같이 한 풀이]
		sb3.insert(sb3.indexOf("korea")+"korea".length(),"사랑");
		//         -------------------- ----------------
		//			 korea 시작 위치    korea문자열길이
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑우리나라대한민국


		// ○ 『우리나라』 문자열 삭제
		//sb3.delete(14,18);
		//System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		sb3.delete(sb3.indexOf("우리나라"),sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국

		// ○ 대상 문자열(sb3)에서 korea 이후 문자열 삭제
		sb3.delete(sb3.indexOf("korea"),sb3.length());
		System.out.println(sb3);
		//--==>> 한국seoul

		///////////////////////////////////////////////////////////////////////////////////

		//버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34					//이미 늘어난 버퍼크기가 줄어들지 않음

		//문자열의 길이 확인
		System.out.println("문자열의 길이 : " + sb3.length());
		//--==>> 문자열의 길이 : 7

		//버퍼 크기 조절
		// -> 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize();

		//버퍼 크기 조절 이후 버퍼 크기 다시 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 7





	}
}