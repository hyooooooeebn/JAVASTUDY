/*=======================
   ■■ 예외 처리 ■■
==========================*/

//예외 다시 던지기

public class Test148
{
	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);		// (6) 예외 발생
			System.out.println(a);
		}
		catch (Exception e)					// (7) 예외 잡아내기
		{
			System.out.println("ⓑ printStackTrace.........");
			e.printStackTrace();
		}
		
		
	}

	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data가 0보다 작습니다.");
			// (1) 예외 발생

		return data + 10;
	}

	public int getValue(int value) throws Exception //(5) 때문에 작성,,,
	{
		int a = 0;

		try
		{
			a = getData(-2);		// (2) 예외 발생
		}
		catch (Exception e)		// (3) 예외 잡아내기
		{
			// (4) 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace.........");
			e.printStackTrace();
			
			// (5) 잡은 예외 다시 던지기
			throw e;
			//--주석 처리 시 main() 매소드의 예외 처리 구문은 수행되지 않게 된다.
		}

		return a;
	}
}