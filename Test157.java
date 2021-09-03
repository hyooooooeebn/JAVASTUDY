/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

//검색 및 삭제

import java.util.Vector;

public class Test157
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	
	public static void main(String[] args)
	{
		//벡터 자료구조 v 생성
		Vector<String> v = new Vector<String>();

		for (String color : colors)
			v.add(color);

		System.out.print("전체 출력 :");
		for (String str : v )
			System.out.print(str + " ");
		System.out.println();

		String s1 ="분홍";

		int i = v.indexOf(s1);
		System.out.println(s1 + " index 위치 : "+ i);
		System.out.println();

		String s2 ="노랑";

		// contains(s) : 백터 구조에 찾고자 하는 s가 포함되어있다면...
		if (v.contains(s2))
		{
			i = v.indexOf(s2);
			System.out.println(s2+" index 위치 : "+ i );

			//우선 위의 코드를 통해 제거하고자 하는대상의 위치를 찾고
			//찾으면 삭제
			v.remove(i);
		}

		System.out.println("삭제 후 전체 요소 출력 : ");
		for (String str : v)
			System.out.print(str + " ");
		System.out.println();

		System.out.println(v);
		//--==>> [검정, 초록, 파랑, 빨강, 연두]

		//※ 확인용 더미 데이터는
		//	 실제요소가아니기 때문에
		//	 이를 활용하여 연산을 진행하거나 해서는 안된다.
		//★CHECK★


	}
}