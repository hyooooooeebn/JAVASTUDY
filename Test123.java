/*=====================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
=====================================*/

// ※ Test122와 비교

//import java.lang.*;

public class Test123	//extends Object
{
	/*
	...
	public String toStirng()
	{
		...;
	}
	*/
	@Override
	public String toString()
	{
		return "재정의한 toSting()...";
	}

	public static void main(String[] args)
	{
		Test123 ob = new Test123();
		System.out.println(ob.toString());
		//--==>> 재정의한 toSting()...

		System.out.println(ob);
		//--==>> 재정의한 toSting()...


	}
}