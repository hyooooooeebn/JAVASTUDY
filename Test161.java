/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

//List → Vector, ArrayList, ...
//·순서있음
//·배열과 유사
//·중복 허용


/*
○ ArrayList 클래스
	
	- ArrayList와 Vector 클래스는
	  List를 크기 변경이 가능한배열로 구현한 것으로
	  차이점은 벡터 클래스의 객체는 기본적으로 동기화 되지만,
	  ArrayList는 그렇지 않다는 겁니다.

	- 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하며
	  스레드들이 컬렉션을 공유하지 않는프로그램에서는
	  일반적으로 ArrayList를 Vector보다 더 선호하며,
	  ArrrayList는동기화를 고려하지 않은 Vector처럼동작함으로써
	  스레드 동기화에 따르는 부담을 가지지 않기 때문에
	  Vector보다 더 빠르게 실행된다.

	- null을 포함한 모든 요소를 허용하며
	  List 인터페이스를 구현하는 것외에 리스트에 격납하기위해
	  내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test161
{
	public static void main(String[] args)
	{
		//ArrayList 자료구조 인스턴스 생성
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		List<String> list1 = new  ArrayList<String>();	//가능

		//list1에 요소 추가 -> add()
		list1.add("나이브스아웃");
		list1.add("인셉션");		
		list1.add("인터스텔라");
		

		//ArrayList 자료구조 인스턴스 생성
		List<String> list2 = new  ArrayList<String>(list1);	//list1넘겨주기

		list2.add("모가디슈");


		//ArrayList 자료구조 인스턴스 생성
		List<String> list3 = new ArrayList<String>();

		//list3에 list2 전체 요소 추가 -> addAll();
		list3.addAll(list2);	//list2전체 넘겨주기


		//"인셉션" 앞에 "분노의질주" 추가
		// (1) "인셉션" 찾기 -> indexOf() -> 위치값 인덱스 반환
		int n = list3.indexOf("인셉션");

		//System.out.println("인셉션 위치 : "+n);
		//--==>> 인셉션 위치 : 1

		// (2) "인셉션" 인덱스 위치에 "분노의질주" 삽입
		list3.add(n,"분노의질주");




		System.out.println("===================");
		System.out.println(list1);
		//--==>>[나이브스아웃, 인셉션, 인터스텔라]
		System.out.println(list2);
		//--==>> [나이브스아웃, 인셉션, 인터스텔라, 모가디슈]
		System.out.println(list3);
		//--==>> [나이브스아웃, 분노의질주, 인셉션, 인터스텔라, 모가디슈]

		System.out.println();

		// 출력 -> listIterator() 메소드를 활용하여 출력
		System.out.println("==================");
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " " );
		}
		System.out.println();
		//--==>> 나이브스아웃 분노의질주 인셉션 인터스텔라 모가디슈

		System.out.println();
		
		// 출력 -> 역순으로 출력
		System.out.println("==================");
		while (li.hasPrevious())	//역순 탐색 //[true/false]
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//--==>> 모가디슈 인터스텔라 인셉션 분노의질주 나이브스아웃





	}
}