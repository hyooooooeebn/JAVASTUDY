/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

import java.util.Queue;
import java.util.LinkedList;

public class Test153
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};


	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		Queue<String> qu = new LinkedList<String>();
		//--큐 인터페이스 기반의 인스턱스를 생성하기 위해서는
		//	new 연산자를 이용하여 큐 인터페이스를 implements한
		//	하위 클래스의 생성자를 호출해야 한다.

		//qu라는 Queue자료구조에
		//colors 배열의 데이터 입력 -> offer()
		for (String color : colors)
			qu.offer(color);

		//qu라는 Queue자료구조의 모든 데이터 전체 출력
		while (qu.peek() != null)
			System.out.print(qu.poll() + " ");
		System.out.println();
		//--peek() : head반환 후 제거 안됨,비어있음 null반환
		//--poll() : head반환 후 제거,비어있음 null반환
		//--==>> 검정 노랑 초록 파랑 빨강 연두
		
		
		
	}
}