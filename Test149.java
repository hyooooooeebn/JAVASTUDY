/*=======================
   ■■ 예외 처리 ■■
==========================*/

//다른 예외 다시 던지기

public class Test149
{
	public int getValue(int value) throws Exception			// (7) 예외 던지기-파랑
	{
		int a =0;

		try
		{
			a = getData(-2);								// (3) 예외 발생-빨강

		}
		catch (Exception e)									// (4) 예외 잡아내기-빨강
		{
			// (5) 예외 처리-빨강
			System.out.println("printStackTrace..............");
			e.printStackTrace();

			// (6) 새로운 예외 발생 -파랑
			throw new Exception("value가 음수입니다.");
		}
		return a;
	}

	public int getData(int data) throws Exception			//(2) 예외 던지기 -빨강
	{
		if(data<0)
			throw new Exception("data가 0보다 작습니다.");	// (1) 예외발생 -빨강
														
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test149 ob = new Test149();

		try
		{
			int a = ob.getValue(-1);							// (8) 예외 발생(파랑)
			System.out.println("a : " +a);
		}
		catch (Exception e)										// (9) 예외 잡아내기(파랑)
		{
			// (10)예외 처리(파랑)
			System.out.println("printStackTrace..............");
			e.printStackTrace();
		}

	}
}