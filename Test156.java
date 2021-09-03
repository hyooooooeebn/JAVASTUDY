/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

import java.util.Vector;
import java.util.Collections;

public class Test156
{

	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String[] args)
	{
		//벡터 자료구조 생성
		Vector<String> v =new Vector<String>();

		for (String color : colors)
		{
			v.add(color);
		}

		System.out.println("첫번째 : "+v.firstElement());
		System.out.println("두번째 : "+ v.get(1));
		System.out.println("마지막 : "+v.lastElement());
		System.out.println("요소 수: "+v.size());

		//○ 첫 번째 요소 "하양"으로 변경 set()
		v.set(0,"하양");

		System.out.println("첫번째 : "+v.firstElement());
		System.out.println("두번째 : "+v.get(1));
		System.out.println("요소 수 : "+v.size());


		//○ 첫 번째 요소에 "주황" 추가 insertElementAt()
		v.insertElementAt("주황",0);


		System.out.println("첫번째 : "+v.firstElement());
		System.out.println("두번째 : "+v.get(1));
		System.out.println("요소 수 : "+v.size());


		//○ 전체 출력
		System.out.print("전체 출력 : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> 전체 출력 : 주황 하양 노랑 초록 파랑 빨강 연두

		
		//○ 오름차순 정렬
		Collections.sort(v);

		//○ 오름차순 정렬 후 전체 출력
		System.out.print("오름 차순 정렬 후 전체 출력 : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> 오름 차순 정렬 후 전체 출력 : 노랑 빨강 연두 주황 초록 파랑 하양


		//○ 검색
		//『Collections.binarySearch()』 -> 검색 기능 수행
		// 단, 오름차순 정렬이 수행되어 있는자료에 대해서만 사용 가능 
		// 검색 결과가 존재하지않을 경우 음수반환
		//★CHECK★

		int idxBlue = Collections.binarySearch(v, "파랑");
		System.out.printf("파랑 : %d 인덱스에 위치하고있다. \n",idxBlue);
		System.out.println();
		//--==>> 파랑 : 5 인덱스에 위치하고있다.
		int idxNavi = Collections.binarySearch(v,"남색");
		System.out.printf("남색 : %d 인덱스에 위치하고있다. \n",idxNavi);
		System.out.println();
		//--==>> 남색 : -1 인덱스에 위치하고있다.

		
		//○ 내림차순 정렬
		Collections.sort(v,Collections.reverseOrder());


		//○ 내림차순 정렬 후 전체 출력
		System.out.print("내림차순 정렬 후 전체 출력 : ");
		for (String color : v )
			System.out.print(color + " ");
		System.out.println();
		//--==>> 내림차순 정렬 후 전체 출력 : 하양 파랑 초록 주황 연두 빨강 노랑


		//※ 내림차순 정렬 후 검색 테스트
		idxBlue = Collections.binarySearch(v,"파랑");
		System.out.printf("파랑 : %d 인덱스에 위치하고있다. \n",idxBlue);
		System.out.println();
		//--==>>파랑 : -8 인덱스에 위치하고있다. 
		idxBlue = Collections.binarySearch(v,"파랑",Collections.reverseOrder());
		System.out.printf("파랑 : %d 인덱스에 위치하고있다. \n",idxBlue);
		System.out.println();
		//--==>> 파랑 : 1 인덱스에 위치하고있다.



		


	}
}