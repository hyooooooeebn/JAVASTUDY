/*===========================================================
	    ■■■ 메소드 중복정의(Method Overloading) ■■■
		- 메소드 오버로딩이 가능한 형태와 불가능한 형태
==============================================================*/

public class Test100
{
	public static void main(String[] args)
	{
		print('A');		//자동 형 변환 가능성도 있다 확인~~
		
	}
	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}		//불가능
	//public static void print(char c){}		//자동 형 변환 규칙 ★CHECK★
	public static void print(int i, int j){}
	public static void print(double d){}
	//public static double print(double){return 10.0;}	//불가능

}