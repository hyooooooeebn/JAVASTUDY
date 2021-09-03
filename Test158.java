/*====================================================
   ■■ 컬렉션 프레임워크 (Collection Framework) ■■
======================================================*/

//벡터 자료구조 객체 선언 및 생성 시
//사용자 정의 클래스 활용 -> 자료형

import java.util.Vector;

// 사용자 정의 클래스 설계 -> 자료형처럼 활용
class MyData
{
	private String name;
	private int age;

	//getXxx() -> getter
	//setXxx() -> setter

	//getter/setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	
	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	//생성자(매개변수 두개) -> 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//생성자 (매개변수 없는 생성자) -> 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age =0;
	}

}



public class Test158
{
	public static void main(String[] args)
	{
		Vector<MyData> v =new Vector<MyData>();

		//v에
		//채지윤 13세/김진령 17세/장진하 50세/
		//담아내기
		
		
		/*
		//(1)
		MyData st1 = new MyData();
		st1.setName("채지윤");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김진령");
		st2.setAge(17);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("장진하");
		st3.setAge(50);
		v.add(st3);
		*/


		/*
		//(2)
		MyData st1 = new MyData("채지윤",13);
		v.add(st1);

		MyData st2 = new MyData("김진령",17);
		v.add(st2);

		MyData st3 = new MyData("장진하",50);
		v.add(st3);
		*/


		//(3)
		v.add(new MyData("채지윤",13));
		v.add(new MyData("김진령",17));
		v.add(new MyData("장진하",50));


		// 벡터 자료구조 v에 담긴 내용 전체 출력하기
		// 이름 :채지윤, 나이 : 13세


		//(1)
		for (MyData obj : v)
			System.out.printf("이름 : %s, 나이 : %d세\n", obj.getName(),obj.getAge());
		System.out.println();

		//(2)
		for (int i=0;i<v.size() ;i++ )
			System.out.printf("이름 : %s, 나이 : %d세\n", v.elementAt(i).getName(),v.elementAt(i).getAge());
		System.out.println();

		//(3)
		for (Object temp : v)
			System.out.printf("이름 : %s, 나이 : %d세\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		
		




	}
}