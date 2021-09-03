/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

//Map -> Hashtable , HashMap

/*
 java.util.map 인터페이스는
 키를 값에 매핑하며,
 동일한 키를 등록할 수 없고, 유일해여 하며(고유)
 각 키는 한 개의 값만을 매핑해야 한다.
 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다.

○ Hashtable<K, V>클래스
	
	- 해시테이블 구조를 객체 모델링한 클래스호
	  검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.

	- 해시테이블이란 키와 그에 상응하는 데이터로
	  구분된 데이터 구조이다.

	- 데이터를 저장하고 검색하기 위해서 키로 접근하며 
	  이 구조에서는 키 값을 부여하면 해당 데이터가 변환된다.

    - 또한, Hashtable 클래스는 key 또는 value의 값으로 null을 허용하지 않는다.
*/

import java.util.Hashtable;

public class Test166
{
	private static final String[] names = {"유영재","이준호","정해인","김기범","김진기","최민호"};

	private static final String[] tels
		= {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555","010-6666-6666"};
	public static void main(String[] args)
	{
		Hashtable<String, String> ht = new Hashtable<String, String>();

		//ht라고 명명한 Hashtable 자료구조에 
		//배열(names,tels)에 담겨있는 데이터를 요소로 담아내기
		// -> put(k, v)
		for (int i=0;i<names.length ;i++ )
		{
			ht.put(names[i], tels[i]);
		}


		//ht라는 Hashtable의 값을,,, key를 이용하여 검색
		//-> get(k)
		String findName1="유영재";
		String str = ht.get(findName1);
		if (str != null)
		{
			System.out.println(findName1 + " 전화번호 : "+str);
		}System.out.println();
		//--==>> 유영재 전화번호 : 010-1111-1111

		//key가 존재하는지의 여부 확인
		// -> containsKey()
		String findName2 = "강하늘";
		if (ht.containsKey(findName2))
		{
			System.out.println(findName2 + " 데이터가 존재합니다.");
		}else
			System.out.println(findName2 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 강하늘 데이터가 존재하지 않습니다.


		String findName3 = "이준호";
		if (ht.containsKey(findName3))
		{
			System.out.println(findName3 + " 데이터가 존재합니다.");
		}else
			System.out.println(findName3 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 이준호 데이터가 존재합니다.

		//value가 존재하는지의 여부 확인
		// -> contains()
		String findTel1 = "010-1111-1111";
		if (ht.contains(findTel1))
			System.out.println(findTel1 + " 데이터가 존재합니다.");
		else 
			System.out.println(findTel1 + " 데이터가 존재하지 않습니다.");
		System.out.println();
		//--==>> 010-1111-1111 데이터가 존재합니다.


		//데이터 삭제
		// -> remove()
		ht.remove("김진기");
		//--『remove()』메소드는 인자값으로 key를 넘겨받지만
		//	이 때, key만 삭제되는 것이 아니다.
		//	해당 key와 연결되어 있는 value도 함께 제거

		//삭제 이후 key가 존재하는지 확인
		if (ht.containsKey("김진기"))
			System.out.println("진기야 안녕");
		else 
			System.out.println("진기야 어딨니??");
		//--==>> 진기야 어딨니??

		// key 삭데 후 value가 존재하는지 확인
		if (ht.contains("010-5555-"))
			System.out.println("데이터가 존재합니다.");
		else
			System.out.println("데이터가 존재하지않습니다.");
		//--==>> 데이터가 존재하지않습니다.


		//null 관련 처리 관찰
		//ht.put(null,null);				//--==>> 런타임에러(NullPointerException)
		//ht.put("김우빈",null);			//--==>> 런타임에러(NullPointerException)
		//ht.put(null, "010-7777-7777");		//--==>> 런타임에러(NullPointerException)

		
		//중복된 key 입력
		ht.put("유영재","010-1234-1234");
		System.out.println(ht.get("유영재"));
		System.out.println();
		//--==>> 010-1234-1234
		// 변경되었음 -> 덮어쓰기

		
		//중복된 value
		ht.put("차은우","010-2222-2222");
		System.out.println(ht.get("이준호"));
		System.out.println(ht.get("차은우"));
		System.out.println();
		//--==>> 010-2222-2222
		//		 010-2222-2222
		// ※ value는 중복된 값이 입력되어도 기존 데이터에 아무런 영향을 미치지 않음.
		






	}
}