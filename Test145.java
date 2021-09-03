/*=======================
   ■■ 예외 처리 ■■
==========================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{

	private String[] data =new String[3];

	public void proc() //throws IOException	
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int n=0;

		try
		{
			System.out.print("이름 입력(종료 :Ctrl+z) : ");

			while ((str = br.readLine()) != null)
			{
				data[n++] = str;
				System.out.print("이름 입력(종료 :Ctrl+z) : ");
			}

			System.out.println("입력된 내용...");
			for (String s : data )
			{
				if (s != null)
					System.out.println(s);
				
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생");
			System.out.println("getMessage :" + e.getMessage());
			System.out.println("toString()" + e.toString());
			System.out.println("e.printStackTrace()");
			e.printStackTrace();
		}
		
	}


	public static void main(String[] args) //throws IOException → try-catch사용하면 필요없다.
	{									   //★CHECK★
		Test145 ob = new Test145();
		ob.proc();
	}
}