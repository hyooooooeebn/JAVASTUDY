/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

// Set	-> HashSet, TreeSet
// - 순서 없음
// - 증복 허용하지 않음

/*
 ○ TreeSet<E> 클래스

 	java.util.TreeSet<E> 클래스는
	Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.
*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test165
{
	public static void main(String[] args)
	{
		//TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		set.add("하울의움직이는성");		
		set.add("이웃집토토로");
		set.add("아기공룡둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("미래소년코난");
		set.add("원령공주");
		

		// Iterator를 활용한 set 요소 전체 출력
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}System.out.println();
		//--==>> 겨울왕국 귀멸의칼날 미래소년코난 아기공룡둘리 원령공주 이웃집토토로 인사이드아웃 짱구는못말려 하울의움직이는성

		// TreeSet 자료구조 인스턴스 생성
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());		//★CHECK★

		//GradeVO ob = new GradeVO();

		set2.add(new GradeVO("2017162028","박효빈",70,80,80));
		set2.add(new GradeVO("2017162024","박여은",50,40,80));
		set2.add(new GradeVO("2017162057","정가연",100,30,90));
		set2.add(new GradeVO("2017162042","서영화",95,43,37));
		set2.add(new GradeVO("2017155125","유영재",45,35,78));
		
		// MyComparator 클래스 설계 / TreeSet 생성 구문 변경 후 다시 실행
		Iterator<GradeVO> itg = set2.iterator();
		while (itg.hasNext())
			System.out.print(itg.next() + " ");
		System.out.println();		
		//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
		//--해시코드 나옴

		//전체 출력
		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%10s %7s %4d %4d %4d %6d\n"
								,vo.getHak(),vo.getName(),vo.getKor(),
								 vo.getEng(),vo.getMat(),vo.getTot());
		}System.out.println();



	}
}

// VO  → Value Object
// DTO → Data Transfer Object
// DAO → Data Access Object

class GradeVO
{
	//주요 속성 구성
	private String hak;
	private String name;
	private int kor, eng,mat;

	// 생성자 (5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name =name;
		this.kor = kor;
		this.eng =eng;
		this.mat = mat;
	}

	// 생성자(매개변수 없는 생성자)
	//--매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//	default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//	추가로 정의한 생성자
	GradeVO()
	{
		
	}

	String getHak()
	{
		return hak;
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void  setName(String name)
	{
		this.name = name;
	}

	int getKor()
	{
		return kor;
	}

	void  setKor(int kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng=eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}
	
	//추가메소드 정의
	int getTot()
	{
		return kor+eng+mat;
	}

}//end GradeVO class


class MyComparator<T> implements Comparator<T> 
{
	@Override
	public int compare(T o1, T o2)
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;

		//학번 기준(오름차순)
		//return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//		"2017"문자열 -> 2017

		//학번 기준(내림차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());


		// 총점 기준 (오름차순)
		//return s1.getTot() - s2.getTot());

		// 총점 기준 (내름차순)
		//return s2.getTot() - s1.getTot();

		// 이름 기준 (오름차순)
		//return s1.getName().compareTo(s2.getName());

		// 이름 기준 (내림차순)
		return s2.getName().compareTo(s1.getName());
	}
}