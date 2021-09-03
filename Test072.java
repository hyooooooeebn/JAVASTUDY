/*=========================================
	■■■ 클래스와 인스턴스 ■■■
	- 생성자(Constructor)
===========================================*/

public class Test072
{
	//int val1;
	//double val2;
	int x;
	double y;

	Test072()
	{
		x=0;
		y=0;
		System.out.println("매개변수 없는 생성자...");

	}

	Test072(int x)
	{
		this.x=x;
		y=0;
		System.out.println("int형 데이터를 매개변수로 받는 생성자...");
	}

	Test072(double y)
	{
		x=0;
		this.y=y;
		System.out.println("double형 데이터를 매개변수로 받는 생성자...");
	}

	Test072(int x, double y)
	{
		this.x=x;
		this.y=y;
		System.out.println("int형 변수와 double형 변수를 매개변수로 받는 생성자...");
	}

	public static void main(String[] args)
	{
		Test072 ob1 = new Test072();
		//--==>> 매개변수 없는 생성자...

		Test072 ob2 = new Test072(4);
		//--==>> int형 데이터를 매개변수로 받는 생성자...

		Test072 ob3 = new Test072(4.0);
		//--==>> double형 데이터를 매개변수로 받는 생성자...

		Test072 ob4 = new Test072(4,4.0);
		//--==>> int형 변수와 double형 변수를 매개변수로 받는 생성자...


		System.out.println(ob1.x + ", " + ob1.y);
		//--==>> 0, 0.0
		System.out.println(ob2.x + ", " + ob2.y);
		//--==>> 4, 0.0
		System.out.println(ob3.x + ", " + ob3.y);
		//--==>> 0, 4.0
		System.out.println(ob4.x + ", " + ob4.y);
		//--==>> 4, 4.0
	}
}

//최종결과
/*
매개변수 없는 생성자...
int형 데이터를 매개변수로 받는 생성자...
double형 데이터를 매개변수로 받는 생성자...
int형 변수와 double형 변수를 매개변수로 받는 생성자...
0, 0.0
4, 0.0
0, 4.0
4, 4.0
계속하려면 아무 키나 누르십시오 . . .

*/