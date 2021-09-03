/*====================================
   ��� �ڹ��� �⺻ �����(I/O) ���
=======================================*/

//Reader �ǽ�
//Test168.java�� ��

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test170
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in : �ڹ� ǥ�� �Է� ��Ʈ�� -> ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� ���� ��� ��Ʈ������ ��ȯ
		// Reader : ���� ��� ��Ʈ�� ��ü
		Reader rd = new InputStreamReader(System.in);
	//	------		     ----------------  ----------
	//  ����		       ����Ʈ-> ����     ����Ʈ
		
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");
		while ( (data = rd.read() ) != -1)
		{
			ch=(char)data;
			//System.out.write(ch);
			//--==>> 
			/*
			rkskfek
			rkskfek
			�����ٶ�
			��|
			*/

			System.out.print(ch);
			//--==>>
			/*
			1234
			1234
			rkskekf
			rkskekf
			�������
			�������
			*/
		}
	}
}