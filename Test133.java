/*===========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - String 클래스
===========================================*/



public class Test133
{
	public static void main(String[] args)
	{

		String s = "seoul Korea";
		System.out.println(s);
		//--==>> seoul Korea


		// ○ 문자열 추출
		System.out.println(s.substring(6,9));
		//--==>> Kor

		System.out.println(s.substring(7));
		//--==>> orea
		//--『String.substring(s)』
		//	String문자열을 대상으로
		//	s번째에서 끝까지,,,


		// ○ 문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul Korea"));
		System.out.println(s.equals("seoul korea"));
		//--==>> true
		//		 false
		//--대소문자 구분

		System.out.println(s.equalsIgnoreCase("Seoul korea"));
		//--==>> true
		//--대소문자 구분 안함


		//○ 찾고자 하는 대상 문자열(s)에
		//	 『kor』문자열이 존재할까?
		//	  존재한다면,,,  그 위치는 어떻게 될까?

		//"seoul korea"
		System.out.println(s.indexOf("Kor"));
		//--==>> 6
		
		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1		//앞에서부터 표시한다...

		System.out.println(s.indexOf("tt"));
		//--==>> -1		
		//해당 문자가 없으면 음수가 나온다... 무조건 -1이 아니다...
		//--찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//	그 문자열의 인덱스를 반환하지만
		//	존재하지 않을 경우 음수를 반환하게 된다. (-1)


		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//	  (true/false)
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false


		// ○ 찾고자 하는 대상 문자열(s)에 『e』문자열이 존재하는가?
		//	  존재한다면 그 위치는 어디인가?
		//	  단, 뒤에서부터 검사

		//seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));	//찾는것만 뒤에서 찾고 앞에서부터 카운딩
		//--==>> 9

		System.out.println(s.lastIndexOf("o"));
		//--==>> 7


		// ○ 대상 문자열(s) 중 『6』번째 인덱스 위치의 문자는?
		
		System.out.println(s.charAt(6));
		//--==>> K

		System.out.println(s.charAt(10));
		//--==>> a

		//System.out.println(s.charAt(22));
		//--==>> 런타임 에러 (StringIndexOutOfBoundsException)

		
		// ○ 대상 문자열(s)과 비교 문자열 『seoul Corea』중 어떤 문자열이 더 큰가?
		//	  두 문자열이 다르다면 차이를 확인	(-> 사전식 배열)

		System.out.println(s.compareTo("seoul Korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul Corea"));
		//--==>> 8 (c~k => defghijk)

		// ○ 대상 문자열(s) 중 해댱 문자열을 찾아서 원하는 형태로 수정
		
		s ="우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한","자주");

		System.out.println(s);
		//--==>> 우리나라 자주민국 자주독립 만세

		
		// ○ 공백 제거
		s = "      사       랑      ";
		System.out.println(";" + s +";");
		//--==>> ;      사       랑      ;

		System.out.println(";"+s.trim()+";");	//trim() 양쪽 공백 제거	-> 한번에 자르는게 아니고 하나씩 잘라나간다.
		//--==>> ;사       랑;					//손톱깎기,,,,ㅎ		   남은 아이만 취한다...
		
		System.out.println(";"+s.replaceAll(" ","")+";");
		//--==>> ;사랑;

		
		int n = Integer.parseInt("30");		//parseInt() 문자열 -> 정수형
		s = Integer.toString(30);			//toString() 정수형 -> 문자열
		System.out.println(s);

		n =2345678;
		System.out.printf("%d",n);
		System.out.format("%d\n",n);	//printf와 같은 출력 메소드
		

		s= String.format("%,d",n);		//출력이 아니고 해당 형태의 문자열로 반환
		System.out.println(s);	
		//--==>> 2,345,678

		System.out.format("%.2f\n",3.141592);	//출력

		s = String.format("%.2f",3.141592);		//문자열 반환
		System.out.println(s);


		String[] sArray = "기본,열정,배려".split(",");

		for (String str : sArray)
		{
			System.out.print(str + " ");
		}
		System.out.println();
		//--==>> 기본 열정 배려


	 
	 
	}
}