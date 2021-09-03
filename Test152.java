/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

/*
○  큐(Queue)
	
	큐는 FIFO(선입선출)구조로
	먼저 입력된 자료를 먼저 출력하며.
	Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

 ※ Queue 인터페이스 인터페이스를 생성하기 위해서는
	new 연산자를 이용하여 Queue 인터페이스를 구현(implements)한
	클래스의 생성자를 호출한다.

	ex) Queue ob = new LinkedList();

○ 주요 메소드
	
	- E element()
	큐의 head 요소를 반환하며 삭제하지 않는다.

	- boolean offer(E o)
	지정된 요소를 큐에 삽입

	-E peek()
	큔의 head 요소를 반환하고삭제하지 않으며
	큐 자료구조가 empty인 경우 null을 반환

	-E poll()
	큐의 head요소를 반환하고 삭제하며
	큐 자료구조가 empty인 경우 null 반환

	-E remove()
	큐의 head 요소 반환하고 삭제
	
*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		//Queue myQue = new Queue(); (x)

		Queue<Object> myQue = new LinkedList<Object>();

		//데이터 준비
		String str1	="박박박"; 
		String str2 ="김김김";
		String str3 ="이이이";
		String str4 ="정정정";

		//myQue라는 Queue자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//--==>> [박박박, 김김김, 이이이, 정정정]

		System.out.println(test);
		//--==>> true

		//Queue 자료구조에서 요소를 제거하지 않고 head 요소 반환 후 제거안함
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		//--==>> 값1 : 박박박
		//		 값2 : 박박박

		System.out.println();

		String val;

/*
		//(1) peek() : 큐의 head요소 반환. 제거 안함
		//			   큐가 enmpty 일 경우 null 반환
		while (myQue.peek() != null)
		{
			// poll() : 큐의 head요소를 반환하고 삭제
			//			큐 자료구조가 empty인 경우 null 반환 
			val = (String)myQue.poll();
			System.out.println("요소 : "+val);
		}System.out.println();

		//--==>> 요소 : 박박박
		//		 요소 : 김김김
		//		 요소 : 이이이
		//		 요소 : 정정정
*/
/*
		// (2)
		while (true)
		{
			val = (String)myQue.poll();

			if (val==null)
			{
				break;
			}else
			System.out.println("요소 : "+val);
		}
		//--==>> 요소 : 박박박
		//		 요소 : 김김김
		//		 요소 : 이이이
		//		 요소 : 정정정

*/
		//(3)
		while (!myQue.isEmpty())
		{
			val =(String)myQue.poll();
			System.out.println("요소 : "+val);
		} System.out.println();
		//--==>> 요소 : 박박박
		//		 요소 : 김김김
		//		 요소 : 이이이
		//		 요소 : 정정정



		
	}
}