/*=============================
	■■■ 클래스 고급 ■■■
	  - 상속 (Inheritance)
==============================*/

/*
	다음과 같은 프로그램을 구현한다.
	단, 상속의 개념을 적용하여 작성할 수있도록 한다.

	실행 예)
	임의의 두 정수 입력(공백 구분) : 20 15
	연산자입력(+ - * /) : -
	>> 20 - 15 = 5.00
*/

//import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
		
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}
}

/* [내가 한 풀이]
class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}

	Bclass()		
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("연산자입력(+ - * /) : ");
		op = (char)System.in.read();

	}

	double a =0;

	public double cal()
	{
		switch (op)
		{
			case  '+' : a=x+y; break;
			case  '-' : a=x-y; break;
			case  '*' : a=x*y; break;
			case  '/' : a=(double)x/y; break;
	
		}
		return a;
	}

}


public class Test109
{
	public static void main(String[] args)
	{
		Bclass ob = new Bclass();
		ob.cal();
		ob.write(result);
	}
}*/


//[같이 한 풀이]
class Bclass extends Aclass	 //Aclass 상속 받은 자식 클래스
{
	/* == 상속 받은 부분
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n",x,op,y,result);
	}
	*/

	/*
	Bclass()
	{
		super();
	}*/


	//입력
	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		String temp = br.readLine();	//"20 15" -> 전체를 문자열로 입력받아 온다
		String[] strArr = temp.split("\\s");	//구분자 → 공백	\s는 공백이다.		★CHECK★ 
		//String[] strArr = {"20", "15"};

		//※ 문자열.split("구분자")								//★CHECK★
		//	ex) "10 20 30 40".split("\\s");
		//		→ {"10","20","30","40"}; 반환

		if (strArr.length != 2)		//입력 받은 정수가 2개가 아니면
			return false;			//false를 반환하며 input() 메소드 종료
									//이조건을 수행할경우...
									//이 코드의 아래에 수행해야할 코드가남았더라도
									//종료...

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		System.out.print("연산자입력(+ - * /) : ");
		op = (char)System.in.read();

		if (op != '+' && op != '-' && op != '*' && op != '/' )	//※논리연산자 주의
			return false;

		return true;
		

	}// end input()


	double calc()
	{
		double result = 0;

		switch (op)
		{
			case  '+' : result=x+y; break;
			case  '-' : result=x-y; break;
			case  '*' : result=x*y; break;
			case  '/' : result=(double)x/y; break;
	
		}

		return result;


	}//end calc()
	

}//end Bclass

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
		
	} //end main()
}//end class Test109


//최종결과
/*
임의의 두 정수 입력(공백 구분) : 20 15
연산자입력(+ - * /) : -
>> 20 - 15 = 5.00
계속하려면 아무 키나 누르십시오 . . .

*/